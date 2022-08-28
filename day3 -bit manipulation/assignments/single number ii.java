class Solution {
    public int singleNumber(int[] nums) {
        int ones=0,twos=0,not_three=0;
        for(int num:nums){
            twos|=(ones&num);
            ones^=num;
            not_three =~(ones&twos);
            ones&=not_three;
            twos&=not_three;
            System.out.println("ones "+ones +"twos "+twos);
        }
        return ones;
    }
}
