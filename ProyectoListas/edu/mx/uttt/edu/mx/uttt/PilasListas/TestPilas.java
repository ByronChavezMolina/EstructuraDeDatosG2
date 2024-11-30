package edu.mx.uttt.PilasListas;

public class TestPilas {
    public static void main(String[] args) {
        PilasListas pila = new PilasListas("Pilas");
        pila.push(5);
        pila.push(9);
        pila.push(7);
        pila.peek();
        pila.imprimir();
        System.out.println();
        System.out.println(pila.peek());
        pila.pop();
        pila.imprimir();
        pila.push(40);
        System.out.println();
        System.out.println(pila.isEmpty());
        pila.pop(2);
        pila.imprimir();

    }

}
