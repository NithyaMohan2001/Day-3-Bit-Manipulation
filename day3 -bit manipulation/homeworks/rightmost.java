import java.util.*;
import java.io.*;
public class rightmost {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int rmb= n&~n;
    System.out.println(rmb);
}
