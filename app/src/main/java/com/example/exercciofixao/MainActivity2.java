package com.example.exercciofixao;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText editTextA, editTextB;
    private TextView txtViewResultado;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

         editTextA = findViewById(R.id.ValorA);

         editTextB = findViewById(R.id.ValorB);

         txtViewResultado = findViewById(R.id.txtResultado);
    }

    public void verificarMultiplos(View view) {
        int ValorA = Integer.parseInt(editTextA.getText().toString());
        int ValorB = Integer.parseInt(editTextB.getText().toString());

        if (ValorA % ValorB == 0 || ValorB % ValorA == 0) {

            txtViewResultado.setText("São Múltiplos");
        }
        else{
            txtViewResultado.setText("Não Múltiplos");
        }
    }
}