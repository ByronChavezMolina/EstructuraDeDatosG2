package edu.mx.uttt.ColasListas;
import edu.mx.uttt.listasSimples.Lista;

public class ColasListas extends Lista {
    public ColasListas(String nombre){
        super(nombre);
    }
    //Encolar insertar al final 
    public void Encolar (int dato){
    super.insertarAlFinal(dato);
    }
    //Desencolar Eliminar al final
    public void Desencolar (){
        super.eliminarDelFrente();
    }
    public void Desencolar(int posiciones){
        for (int i=1;i<=posiciones;i++) {
            super.eliminarDelFrente();
        }
        }
    //front = peek
    public String front(){
        String result ="";
        return estaVacia() ? "La Cola esta vacia" : "El valor de la cola es: " + String.valueOf(getPrimerNodo().dato);
    }
    public boolean Empty(){
        System.out.println("No hay nada");
        return estaVacia();
        }
}
