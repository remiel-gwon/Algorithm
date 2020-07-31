package Rank_C.C019;

import java.util.Scanner;

/* C019:完全数とほぼ完全数
* N を 2 以上の整数とし、N の約数のうち N 自身を除いたものの和を S とします。 このとき
* ・N = S となるような N を完全数
* ・|N-S| = 1 となるような N をほぼ完全数
* と言うことにしましょう。ここで、|N-S| は N-S の絶対値を意味します。
* たとえば、N = 28 のとき、28 の約数は 1, 2, 4, 7, 14, 28 なので、S = 1+2+4+7+14 = 28 となります。従って、28 は完全数です。
* また、N = 16 のときには S = 1+2+4+8 = 15 となるので、16 はほぼ完全数です。
* 入力された整数が完全数かほぼ完全数かそのいずれでもないかを判定するプログラムを作成してください。
*
* 入力例
* 3
* 28
* 16
* 777
* 出力例
* perfect
* nearly
* neither
* */
public class Main {
    public static void main(String[] args) {

        Scanner bk = new Scanner(System.in);

        int a = bk.nextInt();
        int[] b = new int[a];

        for (int i = 0; i < a; i++) {
            b[i] = bk.nextInt();
        }

        int num2 = 0;
        for (int i = 0; i < b.length; i++) {
            num2 = 0;
            for (int k = 1; k < b[i]; k++) {
                if (b[i] % k == 0) {
                    num2 += k;
                }
            }
            if (num2 == b[i]) {
                System.out.println("perfect");
            } else if (Math.abs(b[i] - num2) == 1) {
                System.out.println("nearly");
            } else {
                System.out.println("neither");
            }

        }
    }
}
