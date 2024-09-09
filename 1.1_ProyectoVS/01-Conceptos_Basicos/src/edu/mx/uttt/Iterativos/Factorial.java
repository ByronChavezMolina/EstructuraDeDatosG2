package edu.mx.uttt.Iterativos;
// ::: PROGRAMA PARA CALCULAR EL FACTORIAL DE UN NUMERO ENTERO :::

// 1. realizar la validacion para que la variable de instancia nunca sea 0
// 2. realizar un metodo que calcule el factorial, utilizando un ciclo for 
// Ejemplo del factorial
// 3. realice un metodo que calcule el factorial, de forma inversa usando un ciclo while
// f(1)=1
// f(2)=1*2
// f(3)=1*2*3
// f(n)=1*2*...n

// f(1)=1
// f(2)=2*1
//     f(3)=3*2*1
//     f(n)=n*...1
public class Factorial {

    private int n;

    public Factorial() {
        this.n=1;
    }

    public Factorial(int n){
        this.n = (n<=0)?1:n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n<=0)?1:n;
    }

    public long CalcularFactorial() {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    public long CalcularFactorialInverso() {
        long resultado = 1;
        int i = n;
        while (i >= 1) {
            resultado *= i;
            i--;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "El Factorial(" + this.n+ ") =" +this.CalcularFactorial();
    }

    


}
