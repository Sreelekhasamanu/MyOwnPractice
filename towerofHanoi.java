import java.util.*;
public class towerofHanoi{
    public static void helper(int n, String s, String h, String d){
        if(n==1){
        System.out.println("from" + s + "to" + d + ":" +n);
            return;
    }
        helper(n-1,s,d,h);
        System.out.println("from" + s + "to" + d + ":" +n);
        helper(n-1,h,s,d);
    }
    public static void main(String [] args){
        int n = 2;
        helper(n,"s","h","d");
        return;

    }


}