package com.example.exercciofixao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private EditText editTextText3, editTextText4;
    private TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editTextText3 = findViewById(R.id.editTextText3);
        editTextText4 = findViewById(R.id.editTextText4);
        textView3 = findViewById(R.id.textView3);


    }


    public void Cardapio(View view){
        int produto = Integer.parseInt(editTextText3.getText().toString());
        int quantidade = Integer.parseInt(editTextText4.getText().toString());
        double resultado;

        if (produto == 1) {
            resultado = 2 * quantidade;

            textView3.setText("Resultado: " +resultado);

        } else if (produto == 2) {
            resultado = 2.50 * quantidade;

            textView3.setText("Resultado: " +resultado);

        } else if (produto == 3) {
            resultado = 1.50 * quantidade;

            textView3.setText("Resultado: " +resultado);
        } else
            textView3.setText("Código Inválido ");


    }
    }


