 package edu.mx.uttt.recursividad;

public class Operaciones {

    private int n;
    
    public Operaciones(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
    }

    //Metodo Iterativo
    public void imprimir(){
        int i=1;
        while(i<=n){
            System.out.println("Hola Mundo");
            i++;
        }
    }

    public void imprimir(int n){
        //Caso Base
        if (n==1) {
            
            System.out.println("Hola Mundo");
           
        }else{
            //Caso Recursivo
            System.out.println("Hola Mundo");
            imprimir(n-1);
        }

    }


    

    

    
}