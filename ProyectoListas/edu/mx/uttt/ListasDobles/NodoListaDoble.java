package ListasDobles;

import edu.mx.uttt.listasSimples.NodoLista;

public class NodoListaDoble {
    int dato;
    NodoListaDoble sigNodo;
    NodoListaDoble AnteriorNodo;
    public NodoListaDoble(int dato){
        this(null,dato,null);
    }
    public NodoListaDoble(NodoListaDoble anterior,int dato, NodoListaDoble siguiente){
        this.dato=dato;
        this.AnteriorNodo= anterior;
        this.sigNodo = siguiente;
    }
}
