import java.util.*;
public class setIthBit {
    public static int ithbit(int n,int pos){
        return n|(1<<(pos-1));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        ithbit(n,pos);
    }
}
