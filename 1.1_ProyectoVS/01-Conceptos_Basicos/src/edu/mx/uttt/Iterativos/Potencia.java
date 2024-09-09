package edu.mx.uttt.Iterativos;

public class Potencia {

    private double n;
    private double base;
    
    public Potencia() {
        this.n = 1;
    }
    
    public Potencia(int n) {
        this.n = (n >= 0)? n:1;
    }
    
    
    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public double calcularPotencia() {
        double r = 0.0;
        for (int i = 1; i <= n; i++) {
            r*= base;
        }
        return r;
    }
    
    public double calcularPotenciaWhile(){
        double r = 0.0;
        int i = 1;
        while(i <= n){
            r *= base;
            i++;
        }
        return r;
    }
    public double calcularPotenciaDoWhile(){
        double r = 0.0;
        int i = 1;
        do {
            r *= base;
            i++;
        } while(i <= n);
        return r;
    }

 
}