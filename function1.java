import java.util.*;

public class function1 {
   
   public static int printsum(int num1,int num2){
    int sum=num1+num2;
    return sum;
    
   }
   
   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         int sum= printsum(a,b);
         System.out.println("total sum: "+sum);
    }
}
