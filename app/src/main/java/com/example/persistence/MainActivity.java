package com.example.persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase database;
    private DatabaseHelper databaseHelper;
    Button read = findViewById(R.id.button1);
    Button write = findViewById(R.id.button2);
    EditText gender = findViewById(R.id.edit1);
    EditText name = findViewById(R.id.edit2);
    EditText age = findViewById(R.id.edit3);
    TextView showtext = findViewById(R.id.inserted_text);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
