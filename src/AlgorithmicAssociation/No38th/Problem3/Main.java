package AlgorithmicAssociation.No38th.Problem3;

import java.util.*;

public class Main
{
    public static int bfs(int[][] mat , int N , int x , int y) {
        int tmp = Integer.MAX_VALUE;
        for(int i = 0; i < N; ++i)
        {
            for(int j = 0; j < N; ++j)
            {
                if(mat[i][j] == '#')
                {
                    tmp = Math.min(tmp , Math.abs(i - x) + Math.abs(j - y));
                }
            }
        }

        return tmp == Integer.MAX_VALUE? -1 : tmp;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] mat = new int[N][N];
        for(int i = 0; i < N; ++i)
        {
            String a = new String(in.next());
            mat[i] = new int[N];
            for(int j = 0; j < N; ++j)
            {
                mat[i][j] = a.charAt(j);
            }
        }

        int ans = -1;
        for(int i = 0; i < N; ++i)
        {
            for(int j = 0; j < N; ++j)
            {
                if(mat[i][j] == '.')
                {
                    ans = Math.max(ans, bfs(mat , N , i , j));
                }
            }
        }

        System.out.println(ans);
    }
}