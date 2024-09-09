package edu.mx.uttt.iterativos;


public class Serie {
   private int n;
   
   public Serie(){
       this.n =1;
   }
   
   public Serie(int n){
       if (n<=0){
           this.n =1;
       }else{
           this.n = n;
       }
   }

    public int getN() {
        return n;
    }

    public void setN(int n) {
         if (n<=0){
           this.n =1;
       }else{
           this.n = n;
       }
    }
   
    public double Calcular(){
        double r = 0.0;
        for (int i = 1; i <= n; i++) {
            r+=1.0/i;
        }
        return r;
    }
    
   @Override
    public String toString(){
        return "El resultado de la serie es: " + this.Calcular();
    }
}
