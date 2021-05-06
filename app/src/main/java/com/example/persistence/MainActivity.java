package com.example.persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase database;
    private DatabaseHelper databaseHelper;
    private Button read;
    private Button write;
    private EditText editGender;
    private EditText editName;
    private EditText editAge;
    private TextView showtext;

    private long addInfo() {
        ContentValues values = new ContentValues();
        values.put(DatabaseTables.personInfo.COLUMN_NAME_NAME, String.valueOf(editName.getText()));
        values.put(DatabaseTables.personInfo.COLUMN_NAME_AGE,String.valueOf(editAge.getText()));
        values.put(DatabaseTables.personInfo.COLUMN_NAME_GENDER,String.valueOf(editGender.getText()));
        Log.d("==>" , String.valueOf(editName.getText())  +  String.valueOf(editAge.getText()) + String.valueOf(editGender.getText()));
        return database.insert(DatabaseTables.personInfo.TABLE_NAME, null, values);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        read = findViewById(R.id.button1);
        write =  findViewById(R.id.button2);
        editGender  = findViewById(R.id.gender);
        editName = findViewById(R.id.name);
        editAge = findViewById(R.id.age);
        showtext = findViewById(R.id.inserted_text);

        databaseHelper = new DatabaseHelper(this);
        database = databaseHelper.getWritableDatabase();
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addInfo();

            }
        });
    }
}
