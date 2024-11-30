package edu.mx.uttt.listasdobles;

import edu.mx.uttt.listasSimples.NodoLista;

public class ListaDato {
    private NodoListaDoble primerNodo;
    private NodoListaDoble ultimonodo;
    private String nombre;

    public ListaDato(){
        this("mi Lista");
    }

    public ListaDato (String nombre){
        this.nombre = nombre;
        primerNodo = ultimonodo=null;
    }

    public boolean estaVacia(){
        return primerNodo==null;
    }

    public void insertarAlFrente(int dato) {
        NodoListaDoble nuevoNodo = new NodoListaDoble(dato);

        if (estaVacia()) {
            primerNodo = ultimonodo = nuevoNodo;
        } else {
            nuevoNodo.sigNodo = primerNodo;
            primerNodo.anteriorNodo = nuevoNodo;
            primerNodo = nuevoNodo;
        }
    }


    public void insertarAlFinal(int dato) {
        NodoListaDoble nuevoNodo = new NodoListaDoble(ultimonodo, dato, null);

        if (estaVacia()) {
            primerNodo = ultimonodo = nuevoNodo;
        } else {
            ultimonodo.sigNodo = nuevoNodo;
            ultimonodo = nuevoNodo;
        }
    }


    public void imprimir() {
        if (estaVacia()) {
            System.out.println("La lista está vacía");
        } else {
            NodoListaDoble aux = primerNodo;
            while (aux != null) {
                System.out.print(aux.dato + " <-> ");
                aux = aux.sigNodo;
            }
            System.out.println("null");
        }
    }


    public int eliminarDelFrente() {
        if (estaVacia()) {
            throw new RuntimeException("La lista está vacía, no se puede eliminar.");
        }

        int datoEliminado = primerNodo.dato;

        if (primerNodo == ultimonodo) {
            primerNodo = ultimonodo = null;
        } else {
            primerNodo = primerNodo.sigNodo;
            primerNodo.anteriorNodo = null;
        }

        return datoEliminado;
    }

    public int eliminarDelFinal() {
        if (estaVacia()) {
            throw new RuntimeException("La lista está vacía, no se puede eliminar.");
        }

        int datoEliminado = ultimonodo.dato;

        if (primerNodo == ultimonodo) {
            primerNodo = ultimonodo = null;
        } else {
            ultimonodo = ultimonodo.anteriorNodo;
            ultimonodo.sigNodo = null;
        }

        return datoEliminado;
    }



}
