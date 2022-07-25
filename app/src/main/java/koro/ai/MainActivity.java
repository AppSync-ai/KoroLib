package koro.ai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import appsync.ai.koro.KoroToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KoroToast.show(this, "Hola Koro!");
    }
}