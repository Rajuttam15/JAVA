import java.util.*;

public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int rev=0;
            for(int i=0;i<n;i++){
                int digit=n%10;
                
                rev=(rev*10)+digit;
                n=n/10;
            

            }
            System.out.print(rev);
       
        }
    
    

}