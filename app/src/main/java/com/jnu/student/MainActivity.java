package com.jnu.student;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private TextView textViewHelloWorld1;
    private TextView textViewHelloWorld2;
    private Button  changeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewHelloWorld1=findViewById(R.id.text_view_hello_world1);//find text1
        textViewHelloWorld2=findViewById(R.id.text_view_hello_world2);//find text2
        //changeText=(Button)findViewById(R.id.button_change);//find button
        changeText=findViewById(R.id.button_change);
        changeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==changeText) {
                    String str1 = textViewHelloWorld1.getText().toString();
                    String str2 = textViewHelloWorld2.getText().toString();
                    textViewHelloWorld2.setText(str1);
                    textViewHelloWorld1.setText(str2);
                }
            }
        });



    }


}