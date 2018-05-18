package ru.mobasti.logopedist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ExercisesSyllableActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        Intent intent = getIntent();

        String letter = intent.getStringExtra("Letter");



    }
}
