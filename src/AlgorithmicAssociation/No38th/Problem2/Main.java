package AlgorithmicAssociation.No38th.Problem2;
import java.util.*;


public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; ++i)      arr[i] = in.nextInt();

        Arrays.sort(arr);

        int L = arr[0];
        int R = arr[N-1];
        int ans = Integer.MAX_VALUE;
        for(int i = L; i <= R; ++i)
        {
            int sum = 0;
            for(int j = 0; j < N; ++j)
            {
                sum += Math.abs(arr[j] - i);
            }
            ans = Math.min(ans , sum);
        }

        System.out.println(ans);
    }
}