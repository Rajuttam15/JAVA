import java.util.*;

public class firstsorting {
    public static void sorting(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap element
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[]={5,4,1,3,2};
        sorting(arr);
        print_array(arr);
    }
}