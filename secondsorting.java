import java.util.*;

public class secondsorting {
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minterm=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minterm] > arr[j]){
                    minterm=j;
                }
            }
            int temp=arr[minterm];
            arr[minterm]=arr[i];
            arr[i]=temp;
        }
    }
    public static void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,3,1,2};
        selection_sort(arr);
        print_array(arr);

    }
}
