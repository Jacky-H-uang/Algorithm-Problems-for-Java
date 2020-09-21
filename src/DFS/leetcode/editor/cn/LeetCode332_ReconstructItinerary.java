// 给定一个机票的字符串二维数组 [from, to]，子数组中的两个成员分别表示飞机出发和降落的机场地点，对该行程进行重新规划排序。所有这些机票都属于一个从
// JFK（肯尼迪国际机场）出发的先生，所以该行程必须从 JFK 开始。
//
// 说明:
// 如果存在多种有效的行程，你可以按字符自然排序返回最小的行程组合。例如，行程 ["JFK", "LGA"] 与 ["JFK", "LGB"] 相比就更小，排
// 序更靠前
// 所有的机场都用三个大写字母表示（机场代码）。 
// 假定所有机票至少存在一种合理的行程。 
// 
//
// 示例 1: 
//
// 输入: [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
// 输出: ["JFK", "MUC", "LHR", "SFO", "SJC"]
// 
//
// 示例 2: 
//
// 输入: [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
// 输出: ["JFK","ATL","JFK","SFO","ATL","SFO"]
// 解释: 另一种有效的行程是    ["JFK","SFO","ATL","JFK","ATL","SFO"]。但是它自然排序更大更靠后。
// Related Topics 深度优先搜索 图 
// 👍 203 👎 0


package DFS.leetcode.editor.cn;
import java.util.*;


public class LeetCode332_ReconstructItinerary
{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 深度遍历这个图
        private void dfs(Map<String,List<String>> Airports,String start,List<String> ans)
        {
            while (Airports.get(start) != null && Airports.get(start).size() > 0)
            {
                String a = Airports.get(start).remove(0);
                dfs(Airports,a,ans);
            }
            ans.add(0,start);
        }

        public List<String> findItinerary(List<List<String>> tickets)
        {
            List<String> ans = new ArrayList<>();
            Map<String,List<String>> Airports = new HashMap<>();

            // 建立哈希映射
            for (List<String> t : tickets)
            {
                String x = t.get(0);
                String y = t.get(1);

                if(Airports.containsKey(x))
                {
                    Airports.get(x).add(y);

                    // 对映射排序：因为要按字符顺序遍历
                    Collections.sort(Airports.get(x));
                }
                else
                {
                    List<String> tmp = new ArrayList<>();
                    tmp.add(y);
                    Airports.put(x,tmp);
                }
            }

            dfs(Airports,"JFK",ans);

            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) 
    {
        Solution solution = new LeetCode332_ReconstructItinerary().new Solution();
        List<List<String>> arr = new ArrayList<List<String>>();
        arr.add(Arrays.asList("MUC", "LHR"));
        arr.add(Arrays.asList("JFK", "MUC"));
        arr.add(Arrays.asList("SFO", "SJC"));
        arr.add(Arrays.asList("LHR", "SFO"));

        List<String> ans = solution.findItinerary(arr);

        for(String s : ans)
        {
            System.out.println(s);
        }
    }
}

