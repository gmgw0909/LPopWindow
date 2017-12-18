package com.leeboo.lpopwindow;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.leeboo.library.LPopWindow;

/**
 * 创建者 LeeBoo
 * 创建时间 2017/12/18
 */

public class MainActivity extends Activity {

    TextView textView;
    LPopWindow lPopWindow;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.button);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View contentView = LayoutInflater.from(MainActivity.this).inflate(R.layout.pop_menu, null);
                lPopWindow = new LPopWindow.Builder(MainActivity.this)
                        .setView(contentView)
                        .enableBackgroundDark(true) //弹出popWindow时，背景是否变暗
                        .setBgDarkAlpha(0.7f) // 控制亮度
                        .build()
                        .showAsDropDown(textView, 0, 20);
            }
        });

    }
}
