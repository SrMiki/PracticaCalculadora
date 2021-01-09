    package com.miki.practicacalculadora;

public class Expression {

    private static char[] operations = {'+', '-', '*', '/', '%'};

    public static double evaluate(String exp) {

        int index = getMainOperator(exp);
        //case base
        if (index == -1) {
            return Double.parseDouble(exp);
        } else { // there are another operation
            switch (exp.charAt(index)) {
                case '+':
                    return evaluate(exp.substring(0, index)) + evaluate(exp.substring(index + 1));
                case '-':
                    return evaluate(exp.substring(0, index)) - evaluate(exp.substring(index + 1));
                case '*':
                    return evaluate(exp.substring(0, index)) * evaluate(exp.substring(index + 1));
                case '/':
                    return evaluate(exp.substring(0, index)) / evaluate(exp.substring(index + 1));
                case '%':
                    return evaluate(exp.substring(0, index)) % evaluate(exp.substring(index + 1));
                case 'n': //negativos
                    return evaluate(exp.substring(0, index)) * (-1);
            }
        }
        return 0; //error ?
    }

    /**
     * get the index to make substring
     *
     * @param exp
     * @return the index of the main Operator, -1 if it's not found
     */
    public static int getMainOperator(String exp) {
        int index;
        for (int i = 0; i < operations.length; i++) {
            index = exp.indexOf(operations[i]);
            if (index != -1) {
                return index;
            }
        }
        return -1;
    }
}