package com.example.colortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner_colors);

    }

    public void onClickButton(View view) {
        int position = spinner.getSelectedItemPosition();
        String[] optionsColors = getResources().getStringArray(R.array.optionsColor);
        String optionColor = optionsColors[position];
        Intent intent = new Intent(this, SecondMainActivity2.class);
        intent.putExtra("optionColor", optionColor);
        startActivity(intent);

    }
}