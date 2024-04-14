import java.util.*;


public class function7 {
    public static void DectoBin(int n){
       int  mynum=n;
         int pow=0;
         int bin=0;
         while(n>0){
            int rem=n%2;
            bin=bin +(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;

            System.out.println("bin to dec:"+mynum+ " "+bin);
         }
         
    }

public static void main(String args[]){
    DectoBin(15);
}
}
