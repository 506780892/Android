package com.example.dongchuang02;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class first extends Activity {
    private Button btn;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.b1);
        //响应按钮btn事件
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //显示方式声明Intent，直接启动SecondActivity
                Intent it = new Intent(first.this,MainActivity.class);
                //启动Activity
                startActivity(it);
            }
        });
}
}
