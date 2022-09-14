package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewHelloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewHelloWorld=findViewById(R.id.text_view_hello_world);

        Button buttonChinese=findViewById(R.id.button_chinese);
        Button buttonEnglish=findViewById(R.id.button_english);
        buttonChinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewHelloWorld.setText(R.string.string_chinese);
            }
        });
        buttonEnglish.setOnClickListener(new EnglishClickListener());


    }

    private class  EnglishClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            textViewHelloWorld.setText(R.string.string_english);

        }
    }
}