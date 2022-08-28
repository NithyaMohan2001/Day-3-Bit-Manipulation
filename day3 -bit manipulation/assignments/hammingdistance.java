class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        for(int i=0;i<Integer.SIZE;i++){
            if((x&(1<<i)^y&(1<<i))!=0){
                count++;
            }
        }
        return count;
    }
}
