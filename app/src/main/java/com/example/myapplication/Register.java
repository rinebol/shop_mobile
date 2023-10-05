package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R.id;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText Username = (EditText)findViewById(id.lusername);
        EditText Password = findViewById(id.lPassword);
        Button ButtonSign = findViewById(R.id.Sign);
        Button lloginbt= findViewById(R.id.lloginbt);

        ButtonSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcher = new Intent(Register.this,MainActivity.class);
                startActivity(switcher);
            }
        });






    }
}