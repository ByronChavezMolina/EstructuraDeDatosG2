package edu.mx.uttt.ColasListas;
import javax.swing.JOptionPane;

public class TestColas {
    private static ColasListas cola = new ColasListas("Cola");
public static void main(String[] args) {
   
    menuColas();
}

public static void menuColas() {
    boolean sentinel = true;
    String menu = "===========Menu==========\n" +
            "1)Encolar\n" +
            "2)DesEncolar\n" +
            "3)Front\n" +
            "4)Imprimir\n" +
            "5)Desencolar Varios\n"+
            "6)Empty\n"+
            "7)Regresar\n" +
            "Elegir Opción:";
    String op = "";

    do {
        op = JOptionPane.showInputDialog(menu);
        switch (op) {
            case "1":
               Encolar();
                break;
            case "2":
                Desencolar();
                break;
                case "3":
                Front();
                break;
                case "4":
                imprimir();
                break;
            case "5":
            DesencolarVarios();
            break;
            case"6":
            Empty();
            break;
            case "7":
                sentinel = false;
                JOptionPane.showMessageDialog(null, "Hasta luego");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción no valida");
                break;
        }
    } while (sentinel);
}
public static void Encolar(){
    int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor: "));
    cola.Encolar(valor);
}
public static void Desencolar(){
    cola.Desencolar();
}
public static void Front(){
   
    JOptionPane.showMessageDialog(null, cola.front());
   
}
public static void imprimir(){
    System.out.println();
    cola.imprimir();
    System.out.println();
}
public static void DesencolarVarios(){
    int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Las posiciones "));
    cola.Desencolar(valor);
}
 public static void Empty(){
    System.out.println();
    cola.Empty();
    System.out.println();
 }
}
