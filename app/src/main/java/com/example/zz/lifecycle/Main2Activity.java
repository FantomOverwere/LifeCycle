package com.example.zz.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.zz.lifecycle.R.id.text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void firstActivity(View view) {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
        Intent Intent = this.getIntent();
        int num = intent.getIntExtra("num", 0);
        TextView tv =(TextView)findViewById(R.id.text);
        tv.setText((num*num)+"");
    }
}
