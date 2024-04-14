import java.util.Arrays;
import java.util.Collections;


public class inbuiltsorting {
    public static void print_array(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Integer arr[]={5,1,6,4,3,2};
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        print_array(arr);

    }
}
