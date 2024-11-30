//package edu.mx.uttt.listasSimples;
//
//public class GestionNavegacionWeb extends Lista {
//    // Constructor que hereda el nombre de la lista
//    public GestionNavegacionWeb(String nombreLista) {
//        super(nombreLista);
//    }
//
//    // Método para insertar al frente (sobrescribe el método original)
//    public void insertarEnFrente(String url) {
//
//    }
//
//    private boolean estaVacia() {
//    }
//
//    // Método para imprimir las URLs almacenadas
//    public void imprimirWeb() {
//        if (estaVacia()) {
//            System.out.println("La lista está vacía.");
//        } else {
//            NodoLista aux = primerNodo;
//            while (aux != null) {
//                System.out.println(aux.dato); // Imprime cada URL almacenada
//                aux = aux.sigNodo;
//            }
//        }
//    }
//
//    // Método para eliminar automáticamente el nodo del frente
//    public String eliminarAutomaticamente() {
//        String datoAEliminar = null; // Almacena el dato eliminado
//        if (!estaVacia()) {
//            datoAEliminar = primerNodo.dato;
//            if (primerNodo == ultimoNodo) {
//                primerNodo = ultimoNodo = null; // Lista vacía
//            } else {
//                primerNodo = primerNodo.sigNodo; // Elimina el nodo del frente
//            }
//        }
//        return datoAEliminar;
//    }
//
//    // Método para buscar una URL en la lista
//    public boolean buscar(String url) {
//        NodoLista actual = primerNodo;
//        while (actual != null) {
//            if (actual.dato.equals(url)) {
//                return true; // URL encontrada
//            }
//            actual = actual.sigNodo;
//        }
//        return false; // URL no encontrada
//    }
//}
