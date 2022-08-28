import java.util.*;
public class oddoreven {
    public static boolean oodoreven(int n){
        return (n&1)!=0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(oddoreven(n)==true?"Odd":"Even");
    }
}
