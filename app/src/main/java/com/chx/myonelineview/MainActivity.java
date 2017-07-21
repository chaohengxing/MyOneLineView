package com.chx.myonelineview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyOneLineView.OnRootClickListener, MyOneLineView.OnArrowClickListener {

    LinearLayout llRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //使用示例，通过Java代码来创建MyOnelineView

        llRoot = (LinearLayout) findViewById(R.id.ll_root);

        //icon + 文字 + 箭头
        llRoot.addView(new MyOneLineView(this)
                .initMine(R.mipmap.ic_launcher, "第一行", "", true)
                .setOnRootClickListener(this, 1));
        //icon + 文字 + 文字 + 箭头
        llRoot.addView(new MyOneLineView(this)
                .initMine(R.mipmap.ic_launcher, "第二行", "第二行", true)
                .setOnArrowClickListener(this, 2));
        //icon + 文字 + 输入框
        llRoot.addView(new MyOneLineView(this)
                .initItemWidthEdit(R.mipmap.ic_launcher, "第三行", "这是一个输入框")
                .setRootPaddingTopBottom(20, 20));
    }

    @Override
    public void onRootClick(View view) {

        int position = 0;
        switch ((int) view.getTag()) {
            case 1:
                position = 1;
                break;
            case 2:
                position = 2;
                break;
        }
        Toast.makeText(this, "点击了第" + position + "行", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onArrowClick(View view) {

        int position = 0;
        switch ((int) view.getTag()) {
            case 1:
                position = 1;
                break;
            case 2:
                position = 2;
                break;
        }
        Toast.makeText(this, "点击了第" + position + "行右边的箭头", Toast.LENGTH_SHORT).show();
    }
}
