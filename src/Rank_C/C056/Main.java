package Rank_C.C056;

import java.util.ArrayList;
import java.util.Scanner;

/* C056:テストの採点
* あなたは PAIZA 大学の講義を受講した学生の評価をしています。
* 学生の成績はテストの点数から 欠席回数 × 5 点 を引いた点数とすることにしました。
* 成績がマイナスとなった場合は 0 とします。

* 学生のテストと欠席回数のデータが学籍番号順に与えられたとき、成績が合格点以上になっている学生の学籍番号を順に出力するプログラムを作成してください。
* 学籍番号は 1 から順に与えられます。
*
* 入力例
* 5 25
* 80 11
* 20 1
* 50 2
* 70 0
* 25 1
*
* 出力例
* 1
* 3
* 4
* */

public class Main {
    public static void main(String[] args) {

        Scanner bk = new Scanner(System.in);

        int nannin = bk.nextInt();
        int heikin = bk.nextInt();
        int keka=0;

        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> al2 = null;

        if(1<=nannin && nannin <= 100 && 0<= heikin && heikin <= 100) {
            for(int i=0;i<nannin;i++) {
                int seiseki = bk.nextInt();
                int tuseiki = bk.nextInt();
                al2 = new ArrayList<>();

                al2.add(seiseki);
                al2.add(tuseiki);
                al.add(al2);
            }

            for(int i=0;i<nannin;i++) {
                keka = al.get(i).get(0) - (al.get(i).get(1)*5);
                if(keka < 0) {
                    keka = 0;
                }

                if(keka >= heikin) {
                    System.out.println(i+1);
                }
            }
        }
    }
}
