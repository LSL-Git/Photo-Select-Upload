package app.com.lsl.importmoduledemo_photo_selecter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sleepyzzz.photo_selector.activity.PhotoPickerActivity;


public class MainActivity extends AppCompatActivity {


    Button button;

    public static final String url = "http://114.115.141.43:4040/webServer/UploadImages";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.but);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PhotoPickerActivity.actionStart(MainActivity.this, 10, null, url);
            }
        });

    }

    //    /**
//     * 暴露接口
//     * @param context
//     * @param maxSelectNum 指定选择图片最大数量
//     * @param searchPath    指定图片搜索路径， null则表示所有
//     * @param url   服务器地址
//     */
//    public static void actionStart(Context context, int maxSelectNum, String searchPath, String url) {
//        Intent intent = new Intent(context, PhotoPickerActivity.class);
//        intent.putExtra(PhotoPickerFragment.EXTRA_SELECT_COUNT, maxSelectNum);
//        intent.putExtra(PhotoPickerFragment.EXTRA_DEFAULT_SELECTED_LIST, searchPath);
//        intent.putExtra(HTTP_URL, url);
//        context.startActivity(intent);
//    }
}
