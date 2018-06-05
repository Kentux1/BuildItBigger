package com.example.jokedisplaylib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        TextView randomJokeTextView = findViewById(R.id.display_text_view);
        Intent intent = getIntent();
        String randomJoke = intent.getStringExtra("randomJoke");
        randomJokeTextView.setText(randomJoke);
    }
}
