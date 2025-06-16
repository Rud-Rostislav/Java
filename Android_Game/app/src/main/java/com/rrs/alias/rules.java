package com.rrs.alias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
    }
    public void to_main(View v) {
        // переход
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}