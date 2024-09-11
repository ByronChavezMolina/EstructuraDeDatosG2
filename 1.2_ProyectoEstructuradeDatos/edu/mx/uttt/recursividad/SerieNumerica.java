package edu.mx.uttt.recursividad;

public class SerieNumerica {
    private int n;

    public SerieNumerica(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int calcularSerie() {
        // Caso base
        if (this.n == 0) {
            return 0;
        }
        
        // Caso recursivo
        return this.n + calcularSerie(this.n - 1);
        for (int i = 0; i <=this.n; i++) {
                   
            System.out.println("Hola Mundo");

        }


}
}
