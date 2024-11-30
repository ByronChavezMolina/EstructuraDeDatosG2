package edu.mx.uttt.listasdobles;

public class NodoListaDoble {
    public int dato;
    NodoListaDoble sigNodo;
    NodoListaDoble anteriorNodo;

    // Constructor con solo dato
    public NodoListaDoble(int dato) {
        this.dato = dato;
        this.sigNodo = null;
        this.anteriorNodo = null;
    }

    // Constructor con los tres punteros
    public NodoListaDoble(NodoListaDoble anteriorNodo, int dato, NodoListaDoble sigNodo) {
        this.dato = dato;
        this.sigNodo = sigNodo;
        this.anteriorNodo = anteriorNodo;
    }
}


