//import edu.mx.uttt.listasSimples.Lista;
//
//import javax.swing.*;
//
//public class TestLista {
//    static Lista miLista = new Lista();
//
//    public static void main(String[] args) {
//        MenuPrincipal();
//    }
//
//    public static void MenuPrincipal() {
//        String menu = "===== MENU DE LISTAS =====\n" +
//                "1) Listas Simples\n" +
//                "2) Listas Dobles\n" +
//                "3) Listas Simples Circulares\n" +
//                "4) Listas Dobles Circulares\n" +
//                "5) Salir\n" +
//                "Elegir Opción";
//        String opcion = "";
//        boolean Sentinel = true;
//        do {
//            opcion = JOptionPane.showInputDialog(menu);
//            switch (opcion) {
//                case "1":
//                    MenuListasSimples();
//                    break;
//                case "2":
//                    JOptionPane.showMessageDialog(null, "Listas dobles");
//                    break;
//                case "3":
//                    JOptionPane.showMessageDialog(null, "Listas Circulares");
//                    break;
//                case "4":
//                    JOptionPane.showMessageDialog(null, "Listas Dobles Circulares");
//                    break;
//                case "5":
//                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
//                    Sentinel = false;
//                    break;
//                default:
//                    JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo.");
//            }
//        } while (Sentinel);
//    }
//
//    public static void MenuListasSimples() {
//        String menu = "===== MENU DE LISTAS SIMPLES =====\n" +
//                "1) Insertar al Frente\n" +
//                "2) Insertar al Final\n" +
//                "3) Eliminar del Frente\n" +
//                "4) Eliminar del Final\n" +
//                "5) Insertar en Posición\n" +
//                "6) Eliminar en Posición\n" +
//                "7) Buscar\n" +
//                "8) Ordenar\n" +
//                "9) Imprimir\n" +
//                "10) Regresar\n" +
//                "Elegir Opción";
//        String opcion = "";
//        boolean Sentinel = true;
//        do {
//            opcion = JOptionPane.showInputDialog(menu);
//            switch (opcion) {
//                case "1":
//                    InsertarAlFrente();
//                    break;
//                case "2":
//                    InsertarAlFinal();
//                    break;
//                case "3":
//                    EliminarAlFrente();
//                    break;
//                case "4":
//                    EliminarAlFinal();
//                    break;
//                case "5":
//                    InsertarEnPosicion();
//                    break;
//                case "6":
//                    EliminarEnPosicion();
//                    break;
//                case "7":
//                    Buscar();
//                    break;
//                case "8":
//                    Ordenar();
//                    break;
//                case "9":
//                    Imprimir();
//                    break;
//                case "10":
//                    JOptionPane.showMessageDialog(null, "Regresando al menú principal...");
//                    Sentinel = false;
//                    break;
//                default:
//                    JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo.");
//            }
//        } while (Sentinel);
//    }
//
//    public static void InsertarAlFrente() {
//        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
//        miLista.insertarAlFrente(numero);
//    }
//
//    public static void InsertarAlFinal() {
//        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
//        miLista.insertarAlFinal(numero);
//    }
//
//    public static void EliminarAlFrente() {
//        int eliminado = miLista.eliminarDelFrente();
//        if (eliminado != 0) {
//            JOptionPane.showMessageDialog(null, "Número eliminado del frente: " + eliminado);
//        } else {
//            JOptionPane.showMessageDialog(null, "La lista está vacía.");
//        }
//    }
//
//    public static void EliminarAlFinal() {
//        int eliminado = miLista.eliminarAlFinal();
//        if (eliminado != 0) {
//            JOptionPane.showMessageDialog(null, "Número eliminado del final: " + eliminado);
//        } else {
//            JOptionPane.showMessageDialog(null, "La lista está vacía.");
//        }
//    }
//
//    public static void InsertarEnPosicion() {
//        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
//        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición:"));
//        miLista.insertarEnPosicion(numero, posicion);
//    }
//
//    public static void EliminarEnPosicion() {
//        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición a eliminar:"));
//        int eliminado = miLista.eliminarEnPosicion(posicion);
//        if (eliminado != 0) {
//            JOptionPane.showMessageDialog(null, "Número eliminado de la posición " + posicion + ": " + eliminado);
//        } else {
//            JOptionPane.showMessageDialog(null, "Posición no válida o lista vacía.");
//        }
//    }
//
//    public static void Buscar() {
//        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número a buscar:"));
//        boolean encontrado = miLista.buscar(numero);
//        if (encontrado) {
//            JOptionPane.showMessageDialog(null, "El número " + numero + " está en la lista.");
//        } else {
//            JOptionPane.showMessageDialog(null, "El número " + numero + " no está en la lista.");
//        }
//    }
//
//    public static void Ordenar() {
//        miLista.ordenarBurbuja();
//        JOptionPane.showMessageDialog(null, "La lista ha sido ordenada.");
//    }
//
//    public static void Imprimir() {
//        miLista.imprimir();
//    }
//
//}
