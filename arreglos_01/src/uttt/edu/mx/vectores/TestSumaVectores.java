package uttt.edu.mx.vectores;

import javax.swing.*;

public class TestSumaVectores {
    public static void main(String[] args) {
        String[] opciones = {"Sumar Vectores", "Producto Escalar", "Invertir Vector","Multiplicar Vectores", "Salir"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Elige una operación", "Operaciones con Vectores",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    SumaVectores();
                    break;
                case 1:
                    VectorEntero();
                    break;
                case 2:
                    VectoresInvertido();
                    break;
                case 3:
                    Multiplicacion();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 4);
    }

    public static void SumaVectores() {
        String inputTamanio = JOptionPane.showInputDialog("Introduce el tamaño de los vectores:");
        int tamanio = Integer.parseInt(inputTamanio);

        VectoresEnteros vectores = new VectoresEnteros(tamanio);

        int[] vector1 = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            String valor = JOptionPane.showInputDialog("Introduce el valor[" + (i + 1) + "] del primer vector:");
            vector1[i] = Integer.parseInt(valor);
        }
        vectores.setV1(vector1);

        int[] vector2 = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            String valor = JOptionPane.showInputDialog("Introduce el valor[" + (i + 1) + "] del segundo vector:");
            vector2[i] = Integer.parseInt(valor);
        }
        vectores.setV2(vector2);

        int[] resultado = vectores.sumarVectores();

        String output = "La suma de los vectores es: ";
        for (int i : resultado) {
            output += i + " ";
        }
        JOptionPane.showMessageDialog(null, output);
    }

    public static void VectorEntero() {
        String inputTamanio = JOptionPane.showInputDialog("Introduce el tamaño de los vectores:");
        int tamanio = Integer.parseInt(inputTamanio);

        Operaciones vectores = new Operaciones(tamanio);

        int[] vector1 = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            String valor = JOptionPane.showInputDialog("Introduce el valor[" + (i + 1) + "]");
            vector1[i] = Integer.parseInt(valor);
        }
        vectores.setV1(vector1);

        int[] vector2 = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            String valor = JOptionPane.showInputDialog("Introduce el valor [" + (i + 1) + "] del vector 2:");
            vector2[i] = Integer.parseInt(valor);
        }
        vectores.setV2(vector2);

        int productoEscalar = vectores.calcularProductoEscalar();
        JOptionPane.showMessageDialog(null, "El producto escalar de los vectores es: " + productoEscalar);
    }

    public static void VectoresInvertido() {
        String inputTamanio = JOptionPane.showInputDialog("Introduce el tamaño del vector:");
        int tamanio = Integer.parseInt(inputTamanio);

        vectorInvertido ve = new vectorInvertido(tamanio);

        int[] v1 = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            String valor = JOptionPane.showInputDialog("Introduce el valor[" + (i + 1) + "]");
            v1[i] = Integer.parseInt(valor);
        }
        ve.setV1(v1);

        int[] resultado = ve.invertirVector();

        String output = "El vector invertido es: ";
        for (int i = 0; i < resultado.length; i++) {
            output += resultado[i] + "|";
        }
        JOptionPane.showMessageDialog(null, output);
    }
    public static void Multiplicacion(){
        String inputTamanio = JOptionPane.showInputDialog("Introduce el tamaño del vector:");
        int tamanio = Integer.parseInt(inputTamanio);

       MultiplicarVectores m1 = new MultiplicarVectores(tamanio);

        int[] vector = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            String valor = JOptionPane.showInputDialog("Introduce el valor[" + (i + 1) + "]");
            vector[i] = Integer.parseInt(valor);
        }
       m1.setV1(vector);

        String inputEscalar = JOptionPane.showInputDialog("Introduce el número escalar:");
        int escalar = Integer.parseInt(inputEscalar);

        int[] resultado =m1.multiplicarPorEscalar(escalar);

        String output = "El vector resultante es: ";
        for (int i : resultado) {
            output += i + "|";
        }
        JOptionPane.showMessageDialog(null, output);

    }

}
