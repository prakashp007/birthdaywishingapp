package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createcard(View view) {
       // Object n;
       // val n=n.EditableText.toString();
        EditText name=(EditText)findViewById(R.id.name);
        Toast.makeText(this,"name is $name",Toast.LENGTH_SHORT).show();
        Intent i=new Intent(MainActivity.this,birthdaywish.class);
        i.putExtra("name",name.getText().toString());
        startActivity(i);

    }
}