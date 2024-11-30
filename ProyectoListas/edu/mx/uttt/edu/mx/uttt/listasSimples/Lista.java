package edu.mx.uttt.listasSimples;
import edu.mx.uttt.listasSimples.NodoLista ;
public class Lista {
 // variables de instancia
 private String nombreLista;
 private NodoLista primerNodo;
 private NodoLista ultimoNodo;


 
 public NodoLista getPrimerNodo() {
    return primerNodo;
}
public NodoLista getUltimoNodo() {
    return ultimoNodo;
}
//Constructor vacio (sin parametros)
 public Lista (){
    this("Lista Simple");
 }
 // Constructor con parametros
 public Lista (String nombreLista){
    this.nombreLista=nombreLista;
    primerNodo = ultimoNodo=null;
 }
 //Metodo para verificar si la lista esta vacia
 public boolean estaVacia(){
    return primerNodo == null;
 }
//Metodo para insertar al Frentre
 public void insertarAlFrente(int dato){
    if (estaVacia()) {
       primerNodo =ultimoNodo= new NodoLista(dato);
    }else{
       primerNodo =new NodoLista(dato,primerNodo);
    }
 }
//Metodo para insertar al final
 public void insertarAlFinal(int dato){
    if(estaVacia()){
        ultimoNodo =primerNodo= new NodoLista(dato);
    }else{
       ultimoNodo= ultimoNodo.sigNodo= new NodoLista(dato);
    }
 }
 //Metodo para Imprimir
 public void imprimir(){
    if (estaVacia()) {
        System.out.println("La lista esta vacia");
    } else {
        NodoLista aux = primerNodo;
        while (aux!=null) {
            System.out.print(aux.dato+"->");
            aux=aux.sigNodo;
        }
    }
    
 }
  
  //Metodo Para eliminar del Final
 public void  eliminarDelFrente(){
   int datoAEliminar= 0;
   if(estaVacia()){
      System.out.println("La lista esta vacia");
      datoAEliminar=-999;
   }else{
      datoAEliminar=primerNodo.dato;
      if (primerNodo==ultimoNodo) {
         primerNodo=ultimoNodo=null;
      }else{
         primerNodo=primerNodo.sigNodo;
      }
      //return datoAEliminar;
   }
  }
   
  //Metodo para eliminar del Final
  public void eliminarDelFinal(){
   int datoAEliminar =0;
   if (estaVacia()) {
      System.out.println("La lista esta vacia");
      if (primerNodo==ultimoNodo) {
         datoAEliminar=ultimoNodo.dato;
         primerNodo=ultimoNodo=null;
      }
   }else{
      datoAEliminar=ultimoNodo.dato;
     NodoLista aux=primerNodo;
     while (aux.sigNodo!=ultimoNodo) {
      aux=aux.sigNodo;
     }
     aux.sigNodo=null;
     ultimoNodo=aux;
     //return datoAEliminar;
   }
  } 
   
  // Método para insertar en cualquier posición
  public void insertarEnCualquierPosicion(int dato, int posicion) {
   NodoLista nuevoNodo = new NodoLista(dato);
   if (posicion <= 0 || estaVacia()) {
       nuevoNodo.sigNodo = primerNodo;
       primerNodo = nuevoNodo;
       if (ultimoNodo == null) {
           ultimoNodo = nuevoNodo;
       }
   } else {
       NodoLista actual = primerNodo;
       int contador = 0;
       while (actual != null && contador < posicion - 1) {
           actual = actual.sigNodo;
           contador++;
       }
       if (actual != null) {
           nuevoNodo.sigNodo = actual.sigNodo;
           actual.sigNodo = nuevoNodo;
           if (nuevoNodo.sigNodo == null) {
               ultimoNodo = nuevoNodo;
           }
       }
   }
}

  // Método para eliminar en cualquier posición
  public int eliminarEnCualquierPosicion(int posicion) {
   int dataEliminada = -1;
   if (estaVacia() || posicion < 0) {
       System.out.println("La lista esta vacia o la posición no es valida");
       return dataEliminada;
   }
   if (posicion == 0) {
       dataEliminada = primerNodo.dato;
       primerNodo = primerNodo.sigNodo;
       if (primerNodo == null) {
           ultimoNodo = null;
       }
   } else {
       NodoLista actual = primerNodo;
       NodoLista previo = null;
       int contador = 0;
       while (actual != null && contador < posicion) {
           previo = actual;
           actual = actual.sigNodo;
           contador++;
       }
       if (actual != null) {
           dataEliminada = actual.dato;
           previo.sigNodo = actual.sigNodo;
           if (actual.sigNodo == null) {
               ultimoNodo = previo;
           }
       }
   }
   return dataEliminada;
}

// Método de búsqueda en secuencia
public boolean buscar(int dato) {
   NodoLista actual = primerNodo;
   while (actual != null) {
       if (actual.dato == dato) {
           return true;
       }
       actual = actual.sigNodo;
   }
   return false;
}
 
public void ordenamientoBurbuja() {
    if (estaVacia()) {
        System.out.println("La lista está vacía");
        return;
    }
    boolean huboCambio;
    do {
        NodoLista actual = primerNodo;
        NodoLista siguiente = actual.sigNodo;
        huboCambio = false;
        while (siguiente != null) {
            if (actual.dato > siguiente.dato) {
                int temp = actual.dato;
                actual.dato = siguiente.dato;
                siguiente.dato = temp;
                huboCambio = true;
            }
            actual = siguiente;
            siguiente = siguiente.sigNodo;
        }
   } while (huboCambio);
}

}
