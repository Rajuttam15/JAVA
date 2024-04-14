
import java.util.*;

public class thirdsorting {

    public static void insertion_sort(int[] arr){
           for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out the current element is smaller than the previous element
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];//shifting the greater element to the right side
                prev--;
            }//insertion
            arr[prev+1]=curr;

           }
    }
    public static void print_array(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        insertion_sort(arr);
        print_array(arr);
    }
}
