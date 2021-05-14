package com.example.list;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView text_goods_counter;
    private EditText edit_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text_goods_counter = findViewById(R.id.text_goods_counter);
        edit_log = findViewById(R.id.edit_log);
    }
}

