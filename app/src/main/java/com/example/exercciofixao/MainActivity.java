package com.example.exercciofixao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnmulti(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }


    public void btncarda(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

}