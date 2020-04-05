package ru.deforce.transitionbetweenscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text1;
    private String rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        rnd = Integer.toString((int) (Math.random() * 100));
        text1.setText(getString(R.string.url, rnd));

    }

    public void initViews() {
        text1 = findViewById(R.id.textView);

    }

    public void onPrevClick(View v) {
        finish();

    }

    public void onNextClick(View v) {

        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);


    }


}
