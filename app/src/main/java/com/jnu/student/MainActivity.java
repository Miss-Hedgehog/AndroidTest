package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private TextView textViewHelloWorld;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewHelloWorld=this.findViewById(R.id.text_hello_world);
        String strHellWorld=textViewHelloWorld.getText().toString();
        textViewHelloWorld.setText("test");
        textViewHelloWorld.setText(R.string.hello_world2);

        String strHelloWorld2=this.getResources().getText(R.string.hello_world2).toString();
        textViewHelloWorld.setText(strHelloWorld2);



    }
}