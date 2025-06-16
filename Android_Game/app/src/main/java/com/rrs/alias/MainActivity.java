package com.rrs.alias;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void to_command_set(View v) {
        // переход
        Intent intent = new Intent(this, command_set.class);
        startActivity(intent);
    }

    public void to_rules(View v) {
        // переход
        Intent intent = new Intent(this, rules.class);
        startActivity(intent);
    }

    public void to_support(View v) {
        // переход
        Intent intent = new Intent(this, support.class);
        startActivity(intent);
    }
}