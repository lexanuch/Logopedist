package ru.mobasti.logopedist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickArtGum(View view) {
        Intent intent = new Intent(MainActivity.this, ArticGym.class);
        startActivity(intent);
    }

    public void onClickClose(View view) {
        finish();
    }

    public void onClickSyllable(View view) {
        Intent intent = new Intent(MainActivity.this, SelectSyllableActivity.class);
        startActivity(intent);

    }
}
