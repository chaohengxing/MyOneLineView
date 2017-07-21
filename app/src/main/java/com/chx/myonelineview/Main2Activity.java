package com.chx.myonelineview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    MyOneLineView oneItem, twoItem, thereItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //在xml布局中使用MyOneLineView
        oneItem = (MyOneLineView) findViewById(R.id.one_item);
        twoItem = (MyOneLineView) findViewById(R.id.two_item);
        thereItem = (MyOneLineView) findViewById(R.id.there_item);

        oneItem.initMine(R.mipmap.ic_launcher, "第一行", "", true);
        twoItem.initMine(R.mipmap.ic_launcher, "第二行", "第二行", false);
        thereItem.initMine(R.mipmap.ic_launcher, "第三行", "这是一个输入框", false);

    }
}
