import java.util.*;

public class counting_sort {
    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];//itreting in given array//
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //itreting after finding frequency of array//
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void print_array(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    
    public static void main(String args[]){
       int arr[]={1,4,1,3,2,4,3,7};
       countingsort(arr);
       print_array(arr);

    }
    
}
