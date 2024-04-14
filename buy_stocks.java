import java.util.*;

public class buy_stocks {
    public static  int buy_stock(int prices[]){
         int bp=Integer.MAX_VALUE;
         int maxprofit=0;
         for(int i=0;i<prices.length;i++){
            if(bp < prices[i]){
                int profit=prices[i]-bp;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                bp=prices[i];
            }
         }
         return maxprofit;
    }
    public static void main(String args[]){
         int prices[]={7,5,3,6,3,5,8};
         System.out.println(buy_stock(prices));
    }
}
