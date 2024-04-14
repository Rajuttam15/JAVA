import java.util.*;

public class array2 {

    public static int getlargest(int numbers[]){
         int largest=Integer.MIN_VALUE;

         for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest=numbers[i];
            }
         }
         return largest;
    }
    public static void main(String args[]){
         int  numbers[]=new int[10];
         Scanner sc=new Scanner(System.in);


         numbers[0]= sc.nextInt();
         numbers[1]= sc.nextInt();
         numbers[2]= sc.nextInt();
         numbers[3]= sc.nextInt();
         numbers[4]= sc.nextInt();
         numbers[5]= sc.nextInt();

         System.out.println("1st: " +numbers[0]);
         System.out.println("2nd: " +numbers[1]);
         System.out.println("3rd: " +numbers[2]);
         System.out.println("4th: " +numbers[3]);
         System.out.println("5th: " +numbers[4]);
         System.out.println("6th: " +numbers[5]);
         System.out.println("largest number: "+getlargest(numbers) );
    }
    
}
