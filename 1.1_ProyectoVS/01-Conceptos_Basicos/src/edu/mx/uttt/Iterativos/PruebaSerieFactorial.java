package edu.mx.uttt.Iterativos;
import javax.swing.JOptionPane;
public class PruebaSerieFactorial {
    public static void main(String[] args) {
        // SerieFactorial sf1 = new SerieFactorial();
        // sf1.setN(2);
        // JOptionPane.showMessageDialog(null, sf1.Calcular());

        // Serie2 s2 = new Serie2();
        // s2.setN(3);
        // JOptionPane.showMessageDialog(null, s2.Calcular());

        Potencia p1 = new Potencia();
        p1.setN(4);
        p1.setBase(3);
        JOptionPane.showMessageDialog(null, p1.calcularPotencia());
    }


    
}
