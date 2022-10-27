package com.example.lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText Username;
    EditText Password;
    TextView Res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Username = (EditText) findViewById(R.id.editTextTextPersonName);
        Password = (EditText) findViewById(R.id.editTextTextPersonName2);
        Res = (TextView) findViewById(R.id.textView2);
    }
    public void LogIn(View v) {
        if (Username.getText().toString().equals("admin") && Password.getText().toString().equals("admin"))
        {
            Res.setText("Авторизация успешна");
        }
        else
        {
            Res.setText("Ошибка авторизации");
        }

    }

}