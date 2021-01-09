package com.miki.practicacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView operationField, resultView;
    private static String operations = "+-/*%\\.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        operationField = findViewById(R.id.operation); // editText
        resultView = findViewById(R.id.result);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1: insertNumber("1"); break;
            case R.id.btn2: insertNumber("2"); break;
            case R.id.btn3: insertNumber("3"); break;
            case R.id.btn4: insertNumber("4"); break;
            case R.id.btn5: insertNumber("5"); break;
            case R.id.btn6: insertNumber("6"); break;
            case R.id.btn7: insertNumber("7"); break;
            case R.id.btn8: insertNumber("8"); break;
            case R.id.btn9: insertNumber("9"); break;
            case R.id.btn0: insertNumber("0"); break;

            case R.id.btnAdd: insertOperator("+"); break;
            case R.id.btnMinus: insertOperator("-"); break;
            case R.id.btnProduct: insertOperator("*"); break;
            case R.id.btnDivide: insertOperator("/"); break;
            case R.id.btnPorcent: insertOperator("%"); break;
            case R.id.btnDouble: insertOperator("."); break;

            case R.id.btnClear: clearExpression(); break;
            case R.id.btnRemove: removeOperator(); break;

            case R.id.btnNegative:  resultView.setText("-" + resolvOperation()); break;

            case R.id.btnResult: resultView.setText(resolvOperation()); break;

        }
    }

    private String resolvOperation() {
        try{
            return Expression.evaluate(operationField.getText().toString()) +"";

        }  catch (ArithmeticException e ){
            System.out.println(e);
            Toast.makeText(getApplicationContext(),
                    "Arithmetic exception", Toast.LENGTH_LONG).show();
        } catch ( Exception e){
            System.out.println(e);
            Toast.makeText(getApplicationContext(),
                    "Invalid format used", Toast.LENGTH_LONG).show();
        }
        return"";
    }

    private void removeOperator() {
        String mathExp = operationField.getText().toString();
        if(!mathExp.isEmpty()){
            operationField.setText( mathExp.substring(0,mathExp.length()-1));
        }
    }

    /**
     * Insert a new number
     * @param number
     */

    private void insertNumber(String number) {
        operationField.setText(operationField.getText() + number);
    }

    /**
     * Insert a new operator (+,-, /, *, %,.)
     * @param newOperator
     * You can't put two operator in a row
     */
    private void insertOperator(String newOperator) {
        String mathExp = operationField.getText().toString();
        char lastOperator = mathExp.charAt(mathExp.length()-1);
        if(! operations.contains(lastOperator+"")) {
            operationField.setText( mathExp + newOperator);
        } else {
            operationField.setText( mathExp.substring(0,mathExp.length()-1) + newOperator);
        }
    }

    private void clearExpression() {
        operationField.setText("");
        resultView.setText("");
    }


}
