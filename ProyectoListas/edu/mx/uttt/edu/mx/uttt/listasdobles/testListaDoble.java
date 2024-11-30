package edu.mx.uttt.listasdobles;

import javax.swing.*;

public class testListaDoble {
    public static void main(String[] args) {
        ListaDato lista = new ListaDato("Mi Lista Doble");

        // Insertar datos
        lista.insertarAlFinal(10);
        lista.insertarAlFrente(20);
        lista.insertarAlFinal(30);
        lista.insertarAlFinal(40);

        // Imprimir lista en orden
        lista.imprimir();



        // Eliminar elementos
        System.out.println("Eliminando del frente: " + lista.eliminarDelFrente());
        lista.imprimir();

        System.out.println("Eliminando del final: " + lista.eliminarDelFinal());
        lista.imprimir();
    }
}
