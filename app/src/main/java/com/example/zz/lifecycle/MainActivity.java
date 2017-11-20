package com.example.zz.lifecycle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void secondActivity(View view) {
        //String text =((Button)view).getText().toString();

        //Intent intent=new Intent(this, Main2Activity.class);
        //intent.putExtra("num", (Integer.parseInt(text)));
        //startActivity(intent);
Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://myitschool.ru"));
        startActivity(intent);

    }
}
