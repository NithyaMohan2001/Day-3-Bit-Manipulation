public class leastpow {
    public int leastpow1(int n) {
        int ctr = 0;
        while (n != 1) {
            n >>= 1;
            ctr++;
        }
        return 1;
    }
}
