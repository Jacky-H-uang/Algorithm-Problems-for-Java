package AlgorithmicAssociation.No36th.LeetCode_46;
import java.util.*;


// dfs 回溯
public class Solution
{
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> cur = new ArrayList<>();
    private boolean[] marked;

    private void dfs(int[] nums) {
        if(cur.size() == nums.length)
        {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i = 0; i < nums.length; ++i)
        {
            if(!marked[i])
            {
                cur.add(nums[i]);
                marked[i] = true;
                dfs(nums);
                cur.remove(cur.size()-1);
                marked[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        marked = new boolean[nums.length];
        dfs(nums);

        return ans;
    }
}