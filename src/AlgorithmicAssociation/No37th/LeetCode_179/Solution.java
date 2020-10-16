package AlgorithmicAssociation.No37th.LeetCode_179;
import java.util.*;


public class Solution
{
    public String largestNumber(int[] nums) {
        int n = nums.length;
        if(n == 0)      return "";

        // 辅助数组，将数字转字符串
        List<String> aux = new ArrayList<>();

        for(int num : nums)     aux.add(String.valueOf(num));

        // 优先队列来排序 (里面 lambda 表达式定义 Comparator )
        PriorityQueue<String> pq = new PriorityQueue<>(((o1,o2) -> {
            String s1 = o1 + o2;
            String s2 = o2 + o1;
            return s2.compareTo(s1);
        }));
        pq.addAll(aux);

        StringBuilder ans = new StringBuilder();

        while (!pq.isEmpty()) {
            ans.append(pq.remove());
        }

        // 如果只存在 0 就返回 0
        if(ans.toString().charAt(0) == '0')      return "0";

        return ans.toString();
    }
}