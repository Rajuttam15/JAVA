import java.util.*;

public class substring {
    public static String sub_string(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=substr.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="HElloWorld";
        System.out.println(sub_string(str,0,6));
    }
}
