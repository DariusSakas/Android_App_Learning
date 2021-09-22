package com.example.testapp;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
    }

    public void launchSettings(View view){
        Intent intent = new Intent(this, SettingsActivity.class);
        intent.putExtra("Key Name", "Value");
        startActivity(intent);
    }

}
