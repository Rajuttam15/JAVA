import java.util.*;

public class function5 {
    public static boolean isPrime(int num){
        boolean isPrime =true;
      if(num==2){
        return isPrime;
     } 
     else{
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
            }
        }
     }
      return isPrime;   
}

public static void primeinrange(int n ){
     for(int i=2;i<=n;i++){
         if(isPrime(i)){
            System.out.println(i+ " ");
         }

     }
     System.out.println();
}
public static void main(String args[]){
        primeinrange(100);
}


 }
