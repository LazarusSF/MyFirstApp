package com.sf.lazarus.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonClicked(View v) {

        TextView textview=(TextView) findViewById(R.id.message);

        EditText edittext=(EditText) findViewById(R.id.newMessage);

        String text= edittext.getText().toString();

        textview.setText(text);
    }

}
