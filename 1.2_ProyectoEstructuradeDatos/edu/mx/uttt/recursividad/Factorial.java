package edu.mx.uttt.recursividad;

import javax.swing.JOptionPane;

public class Factorial {
    private int n;

    public Factorial(int n) {
        this.n = 1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    // Calcular Factorial Iterativo
    public long calcularFactorial (String opcion) {
        long r=0;
        switch (opcion) {
            case "1":
                r=factorialFor();
                break;
            case "2":
            r=factorialWhile();
            break;
            case "3":
            r=factorialDoWhile();
            break;
            default:
            JOptionPane.showMessageDialog(null, "Opcion No valida");
                break;
        }
        return r;
    }

    private long factorialFor() {
        long fact = 1;
        for (int i = 1; i <= this.n; i++) {
            fact *= i;
        }
        return fact;
    }

    private long factorialWhile() {
        long fact = 1;
        int i = 1;
        while (i <= this.n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    private long factorialDoWhile() {
        long fact = 1;
        int i = 1;
        do {
            fact *= i;            i++;
        } while (i <= this.n);
        return fact;
    }
    //Metodo Recursivo
    public long factorialRecursivo(int n) {
        if (n == 1) {
            return 1;
        } else {
            //Caso General
            return factorialRecursivo(n - 1)*n;
        }
    }
}
