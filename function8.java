import java.util.*;


public class function8 {
    public static boolean isPalindrome(int num ){
        int number=num;   
        int reverse=0;
           while(num>0){
            int digit=num%10;
            reverse=(reverse*10) + digit;
            num=num/10;
            
            }
            if(num==reverse){
                return true;
           }
           return false;
          
    }

       
    

    public static void main(String args[]){
        int number=121;
        
        if(isPalindrome(number)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
