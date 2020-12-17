package LuoGu.P1106;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int K = in.nextInt();
        int len = n.length();
        int temp = len;
        boolean flag = false;

        char[] ch = n.toCharArray();
        // 枚举删除次数
        for(int i = 0; i < K; ++i) {
            // 枚举串
            for(int j = 0; j < len-1; ++j) {
                if(ch[j] > ch[j + 1]) {
                    // 交换位置
                    for(int k = j; k < len-1; ++k) {
                        ch[k] = ch[k+1];
                    }
                    break;
                }
            }
            len--;
        }

        for (int i = 0; i < len; ++i) {
            if (ch[i] != '0' || temp - K == 1) {
                flag = true;
            }
            if(flag){
                System.out.print(ch[i]);
            }
        }
    }
}