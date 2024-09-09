package edu.mx.uttt.Iterativos;

import javax.swing.JOptionPane;

public class PruebaSerie {
    public static void main(String[] args) {
        // Creacion del primer Objeto
        Serie serie1 = new Serie();
        JOptionPane.showMessageDialog(null, serie1.calcularSerie());

        Factorial factorial1=new Factorial();
        JOptionPane.showMessageDialog(null, factorial1.toString());
    }
}
