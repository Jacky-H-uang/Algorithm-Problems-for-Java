package AlgorithmicAssociation.No38th.Problem4;

import java.util.*;


public class Main
{
    public static int N;
    public static int K;

    // 判断是否满足 K 个用户需求关系
    public static boolean checked(int[] Hi , int[] Wi , int x) {
        if(x == 0)      return true;
        int cnt = 0;
        for(int i = 0; i < N; ++i)      cnt += (Hi[i] / x) * (Wi[i] / x);

        return cnt  >= K;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();
        int[] Hi = new int[N];
        int[] Wi = new int[N];

        int maxVal = 0;

        for(int i = 0; i < N; ++i)
        {
            Hi[i] = in.nextInt();
            Wi[i] = in.nextInt();
            maxVal = Math.max(maxVal , Math.max(Hi[i] , Wi[i]));
        }

        // 二分范围是 0 ~ 最大的边
        int L = 0;
        int R = maxVal;
        while(L < R)
        {
            int mid = (L + R + 1) / 2;
            if (checked(Hi , Wi , mid))        L = mid;
            else                                R = mid-1;
        }

        System.out.println(R);
    }
}