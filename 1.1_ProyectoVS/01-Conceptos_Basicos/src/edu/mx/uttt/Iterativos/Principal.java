package edu.mx.uttt.Iterativos;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
          double resultado = gestionarOperaciones(Menu());
    }
    public static String Menu(){
            String Menu = "Menu Principal" +"\n1)Serie"+
            "\n2)Serie2"
            +"\n3)Factorial"
            +"\n" 
            + "4)Serie"
            +"\n5)Serie3";
        return JOptionPane.showInputDialog(Menu);
    }

    public double gestionarOperaciones(String opcion){
        double resultado=0.0;
        int valor =0;
        switch(opcion){
            case "1":
                Serie  serie = new Serie();
                valor=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de n"));
                serie.setN(valor);
                resultado = serie.calcularSerie();
                break;
                //Se dejo de tarea la realizacion de la serie de potencia, factorial, terminar la implementacion
            case "2":
                Serie2 s2 = new Serie2();
                break;
            case "3":
                
            Factorial f1 = new Factorial();

                break;
            case "4":
                Serie3 serie3 = new Serie3();
                break;
            default:

                return 0;
        }
        return resultado;
    }
}



