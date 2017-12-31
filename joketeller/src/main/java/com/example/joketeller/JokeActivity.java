package com.example.joketeller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "joke";
    private TextView mJokeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mJokeView = (TextView) findViewById(R.id.tv_joke);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(JOKE_KEY)){
            String jokeText = intent.getStringExtra(JOKE_KEY);
            mJokeView.setText(jokeText);
        }
    }
}
