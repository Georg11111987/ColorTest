package com.example.colortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondMainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main2);
        TextView textView = findViewById(R.id.textView2);
        Intent intent2 = getIntent();
        String optionColor = intent2.getStringExtra("optionColor");
        textView.setText(optionColor);
    }

    public void onClickBack(View view) {
        Intent intentBack = new Intent(this, MainActivity.class);
        startActivity(intentBack);


    }
}