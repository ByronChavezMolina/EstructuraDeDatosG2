package edu.mx.uttt.PilasListas;
import edu.mx.uttt.listasSimples.*;
public class PilasListas extends Lista{
    public PilasListas(String nombre){
        super(nombre);
    }
    public void push(int dato){
        super.insertarAlFrente(dato);
    }
    public String peek(){
        String result ="";
        return estaVacia() ? "La pila esta vacia" : "El valor de la pila es: " + String.valueOf(getPrimerNodo().dato);
    }
    public void pop(){
    super.eliminarDelFrente();
    }
    public void pop(int posiciones){
    for (int i=1;i<=posiciones;i++) {
        super.eliminarDelFrente();
    }
    }
    public boolean isEmpty(){
    return estaVacia();
    }
}
