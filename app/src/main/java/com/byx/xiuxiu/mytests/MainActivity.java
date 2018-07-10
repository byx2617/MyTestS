package com.byx.xiuxiu.mytests;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        tv = (TextView) findViewById(R.id.tv);
        tv.setText("天下都是朕的！");
        tv.setTextColor(Color.WHITE);
    }
}
