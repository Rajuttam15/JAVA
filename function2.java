import java.util.*;

public class function2 {
    public static void swap(int a,int b){
       
        int temp=a;
        a=b;
        b=temp;
        System.out.println("new a: "+a);
        System.out.println("new b: "+b);
      
    }

public static void main(String args[]){
 
    int a=10;
    int b=15;
    swap(a,b);
}
    
}
