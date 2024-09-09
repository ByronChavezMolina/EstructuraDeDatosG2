package edu.mx.uttt.Iterativos;

public class SerieFactorial {
    private int n;
    
    public SerieFactorial() {
        this.n = 1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
    }

    //metodo
    public double Calcular(){
        double r=0.0;
        int i=1;
        do{
            r+= i/this.calcularFactorial(i);
            i++;
        }while(1<=this.n);
        return r;


    }
    public long calcularFactorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;   
    }
}
