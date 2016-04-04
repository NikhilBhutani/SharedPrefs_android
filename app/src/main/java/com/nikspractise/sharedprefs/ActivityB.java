package com.nikspractise.sharedprefs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Nikhil Bhutani on 4/4/2016.
 */
public class ActivityB extends Activity{
TextView username;
private static final String Default = "N/A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        username = (TextView)findViewById(R.id.textView2);
    }

    public void load(View view)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MyFile", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("name",Default);
        if(name.equals(Default))
        {
            Toast.makeText(this,"No data is stored", Toast.LENGTH_SHORT).show();

        }else
        {
            username.setText(name);
        }


    }


    public void previous(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
