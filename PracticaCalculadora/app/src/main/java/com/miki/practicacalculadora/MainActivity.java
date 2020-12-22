package com.miki.practicacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText operationField;
    TextView resultView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        operationField = findViewById(R.id.operation); // editText
        resultView = findViewById(R.id.result);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1: insertOperation("1"); break;
            case R.id.btn2: insertOperation("2"); break;
            case R.id.btn3: insertOperation("3"); break;
            case R.id.btn4: insertOperation("4"); break;
            case R.id.btn5: insertOperation("5"); break;
            case R.id.btn6: insertOperation("6"); break;
            case R.id.btn7: insertOperation("7"); break;
            case R.id.btn8: insertOperation("8"); break;
            case R.id.btn9: insertOperation("9"); break;
            case R.id.btn0: insertOperation("0"); break;

            case R.id.btnSumar: insertOperation("+"); break;
            case R.id.btnRestar: insertOperation("-"); break;
            case R.id.btnProducto: insertOperation("*"); break;
            case R.id.btnDividir: insertOperation("/"); break;

            //case R.id.btnNegative: insertOperation("0"); break;

            case R.id.btnResult:

                try{
                    resultView.setText(Expresion.evaluate(operationField.getText().toString()) +"");
                }  catch (ArithmeticException e){
                    resultView.setText("Arithmetic Exception");
                }
                break;
        }
    }

    private void insertOperation(String newElement) {
        operationField.setText(operationField.getText() + newElement);
    }

}
