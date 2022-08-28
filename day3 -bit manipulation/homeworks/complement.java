import java.util.*;

public class changecases {
    public char tolower(char ch) {
        return (int) ch | (1 << 5);
    }

    public char toupper(char ch) {
        return (char) ch & (~(1 << 5));
    }

    public char totoggle(char ch) {
        return (char) ch ^ (1 << 5);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        tolower(ch);
        toupper(ch);
        totoggle(ch);

    }
}
