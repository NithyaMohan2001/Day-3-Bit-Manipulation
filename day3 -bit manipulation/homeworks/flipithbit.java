public class flipithbit {
    static int toggle(int n,int k){
        return(n^(1<<(k-1)));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(toggle(n,k));
    }
}
