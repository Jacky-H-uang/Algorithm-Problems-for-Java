package AlgorithmicAssociation.No38th.Problem1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int a , b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        int ans = a >= b? (a - b) / (b - 1) + 1 + a : a;
        System.out.println(ans);
    }
}