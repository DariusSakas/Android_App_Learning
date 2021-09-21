package com.example.testapp;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void disable (View v){
        v.setEnabled(false);
        Log.d("Success", "Button Disabled");
        Button button = (Button) v;
        button.setText("Disabled");
        TextView textView = findViewById(R.id.hello);
        textView.setText("Button 1 text");
    }
    public void doSmth( View v){
        TextView textView = findViewById(R.id.hello);
        textView.setText("New text");
        Button button = findViewById(R.id.button2);
        button.setEnabled(false);
        button.setText("Disabled");
    }
}
