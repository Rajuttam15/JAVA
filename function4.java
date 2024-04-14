import java.util.*;

public class function4 {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            
        }
        return fact;
    }


    public static int bionomial(int n,int r){
      int fact_n=factorial(n);
      int fact_r=factorial(r);
      int fact_nr=factorial(n-r);

      int bino= fact_n/(fact_r*fact_nr);
      return bino;
    }
   public static void main(String args[]){
       System.out.println(bionomial(6,4));
   } 
}
