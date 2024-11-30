package edu.mx.uttt.listasSimples;

public class NodoLista {
    //variables de instancia
    public int dato;
    public NodoLista sigNodo;

    public NodoLista(int dato){
    this(dato,null);
    }
    public NodoLista (int dato,NodoLista sigNodo){
        this.dato=dato;
        this.sigNodo=sigNodo;
    }

    
}
