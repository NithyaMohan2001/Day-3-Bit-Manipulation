import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<Integer>());
        for(int x:nums){
            int n=res.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> r=new ArrayList(res.get(i));
                r.add(x);
                res.add(r);
            }
        }
        return res;
    }
}
