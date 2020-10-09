package AlgorithmicAssociation.No34th.Interview_0804;
import java.util.*;


public class Solution
{
    private List<List<Integer>> ans = new ArrayList<List<Integer>>();;
    private List<Integer> aux = new ArrayList<>();

    private void dfs(int[] nums,int start)
    {
        ans.add(new ArrayList<>(aux));
        for(int i = start; i < nums.length; ++i)
        {
            aux.add(nums[i]);
            dfs(nums,i+1);
            aux.remove(aux.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums,0);
        return ans;
    }
}
