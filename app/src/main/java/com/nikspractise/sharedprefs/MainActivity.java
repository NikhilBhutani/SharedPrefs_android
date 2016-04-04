package com.nikspractise.sharedprefs;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userName, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText)findViewById(R.id.username);

    }

    public void save(View view)
    {
        SharedPreferences sharedprefs = getSharedPreferences("MyFile",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedprefs.edit();
        editor.putString("name",userName.getText().toString());
        editor.commit();

    }

    public void next(View view)
    {
        Toast.makeText(this, "Next", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,ActivityB.class);
        startActivity(intent);
    }

}
