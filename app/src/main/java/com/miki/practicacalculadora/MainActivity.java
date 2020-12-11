package com.miki.practicacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText CAMPO1, CAMPO2;
    TextView resultado;
    int num1, num2;
    String fraseConts = "El resultado es: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        CAMPO1 = findViewById(R.id.num1); // el R.id.num1 es el nº que se introduce, PERO ES UN TIPO
        //EDITTEXT, par evitar confuciones lo he tratado como CAMPO aqui
        CAMPO2 = findViewById(R.id.num2);
        resultado = findViewById(R.id.resultado);
    }

    public void onClick(View view) {

        try {
            num1 = Integer.parseInt(CAMPO1.getText().toString());
            num2 = Integer.parseInt(CAMPO2.getText().toString());
        } catch ( Exception e){
            num1 = 0;
            num2 =0;
            Toast.makeText(getApplicationContext(), "ha habido un error", Toast.LENGTH_SHORT).show();
            return;
        }

        switch (view.getId()) {
            case R.id.btnSumar:
                sumar();
                break;
            case R.id.btnRestar:
                restar();
                break;
            case R.id.btnProducto:
                producto();
                break;
            case R.id.btnDividir:
                dividir();
                break;

        }

    }

    private void dividir() {
        if (num2 == 0) {
            resultado.setText("¿Por qué quieres dividir por 0? ¿tienes algún problema?");
        } else {
            resultado.setText(fraseConts + (num1 / num2));
        }
    }

    private void producto() {
        resultado.setText(fraseConts + (num1 * num2));
    }

    private void restar() {
        resultado.setText(fraseConts + (num1 - num2));
    }

    private void sumar() {
        resultado.setText(fraseConts + (num1 + num2));
    }
}