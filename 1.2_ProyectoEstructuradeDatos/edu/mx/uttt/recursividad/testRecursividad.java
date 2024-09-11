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
                "3)Factorial Iterativo\n" +
                "4)Factorial Recursivo\n" +
                "5)Salir\n" +
                "Elige una opcion";
        return JOptionPane.showInputDialog(null, menu);

    }

    public static void ejecutar() {
        boolean sentinel = true;
        String opcion = "";
        Operaciones op = new Operaciones(0);
        Factorial fact = null;
        long r=0;
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
                case "3":
                    // Factorial
                    opcion = JOptionPane.showInputDialog(Menus.menuFactorial());
                    fact = new Factorial(n);
                    n= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del factorial a calcular"));
                    fact.setN(n);
                    r= fact.factorialRecursivo(fact.getN());
                    JOptionPane.showMessageDialog(null, "f("+fact.getN()+")="+r);
                    break;
                    case "4":
                    fact = new Factorial(n);
                    n= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del factorial a calcular"));
                    fact.setN(n);
                    r= fact.factorialRecursivo(fact.getN());
                    JOptionPane.showMessageDialog(null, "f("+fact.getN()+")="+r);
                    break;
                case "5":
                // Salir
                    sentinel = false;
                    JOptionPane.showConfirmDialog(null, "Gracias Por usar el programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida");
                    break;
            }// Cierra El Switch
        } while (sentinel);
    }
}
