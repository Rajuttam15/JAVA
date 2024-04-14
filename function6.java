import java.util.*;

public class function6 {
    public static void BinarytoDecimal(int n){
         int pow=0;
         int dec=0;
              while(n>0){
            int lt=n%10;
            dec=dec + (lt*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
         }
          System.out.println("bin to dec: "+dec);
    }
   
    
    
    
    public static void main(String args[]){
    BinarytoDecimal(1111);
    }
}
