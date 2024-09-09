package edu.mx.uttt.Iterativos;

public class Serie2 {
    private int n;
    private Factorial factorial;

    public Serie2(){
        this.n = 1;
        this.factorial = new Factorial();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n<0)?n:1;
    }

    public double Calcular(){
        double r = 0.0;
        
        for(int i=0; i<=n; i++){
            factorial.setN(i);
            r += i/factorial.CalcularFactorial();
        }
        return r;
    }
    
    
}
