import java.util.*;

public class max_subarray_sum {
    public static void max_subarray(int numbers[]){
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                curr_sum=0;
                for(int k=start;k<=end;k++){
                   curr_sum +=numbers[k];
                   System.out.println(curr_sum);
                }
                if(max_sum<curr_sum){
                    max_sum=curr_sum;
                }
            }
            
        }
        System.out.println("max sum: "+max_sum);
    }
    public static void main(String args[]){
        int number[]={5,6,7,8,9};
        max_subarray(number);
    }
    
}
