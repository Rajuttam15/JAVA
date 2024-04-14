import java.util.*;

public class pairs_in_array {
    public static void pairsinarray(int number[]){
        int total=0;
        for(int i=0;i<number.length;i++){
            int curr=number[i];
            for(int j=i+1;j<number.length;j++){
                   System.out.print("(" + curr + "," + number[j]+ ")");
                   total++;
            }
            System.out.println();
        }
        System.out.println("total_pairs: "+total);
    }

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        pairsinarray(numbers);
    }
}
