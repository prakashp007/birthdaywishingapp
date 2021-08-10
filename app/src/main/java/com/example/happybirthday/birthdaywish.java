package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class birthdaywish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthdaywish);
        Bundle b=getIntent().getExtras();
        String n=b.getString("name");
        TextView t1=(TextView)findViewById(R.id.birthday);
        t1.setText("happy  birthday  "+n);
    }
}