package edu.mx.uttt.recursividad;

import javax.swing.JOptionPane;

public class testRecursividad {
    public static void main(String[] args) {
        ejecutar();
    }

    public static String menu() {
        String menu = "Menu principal\n" +
                "1)Metodo Iterativo\n" +
                "2)Metodo Recursivo\n" +
                "3)Salir\n" +
                "Elige una opcion";
        return JOptionPane.showInputDialog(null, menu);

    }

    public static void ejecutar() {
        boolean sentinel = true;
        String opcion = "";
        Operaciones op = new Operaciones(0);
        int n = 0;
        do {
            opcion = menu();
            switch (opcion) {
                case "1":
                    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numer de veces a imprimir"));
                    op.setN(n);
                    op.imprimir(op.getN());
                    break;
                case "2":
                    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numer de veces a imprimir"));
                    op.setN(n);
                    op.imprimir(op.getN());
                    break;
                case "3":// Salir
                JOptionPane.showConfirmDialog(null, "Gracias Por usar el programa");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida");
                    break;
            }// Cierra El Switch
        } while (sentinel);

    }
}
