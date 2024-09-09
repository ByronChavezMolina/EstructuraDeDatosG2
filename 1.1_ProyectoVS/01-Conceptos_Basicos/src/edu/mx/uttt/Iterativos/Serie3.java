package edu.mx.uttt.Iterativos;

public class Serie3 {
    private Factorial factorial ;
    private Potencia potencia ;
    public Serie3() {
        this.factorial = new Factorial();
        this.potencia = new Potencia();
    }
    public Factorial getFactorial() {
        return factorial;
    }
    public Potencia getPotencia() {
        return potencia;
    }
    
}
