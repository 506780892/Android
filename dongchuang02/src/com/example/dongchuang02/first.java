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
        //��Ӧ��ťbtn�¼�
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //��ʾ��ʽ����Intent��ֱ������SecondActivity
                Intent it = new Intent(first.this,MainActivity.class);
                //����Activity
                startActivity(it);
            }
        });
}
}
