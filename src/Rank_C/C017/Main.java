package Rank_C.C017;

import java.util.Scanner;

/* C017:ハイアンドロー・カードゲーム
* paizaカードゲームは、複数枚の子カードそれぞれが、1枚の親カードとの強弱関係で勝負するゲームです。
* どのカードにも2つの番号が書かれています。
* 1つ目の番号は1から10の整数、2つ目の番号は1から4の整数で表されます。
* また、2つの番号の各組み合わせは1枚だけカードの束に含まれています。(同じカードが2枚以上存在しません)
* 2枚のカードの強弱関係は、次のルールによって決まります。
* ・1つ目の番号が大きいカードのほうが強い
* ・1つ目の番号が同じ場合、2つ目の番号が小さいカードのほうが強い
* 親カードと子カードの情報が与えられるので、それらの強弱関係を調べるプログラムを作成してください。
*
* 入力例
* 5  1
* 2
* 7  2
* 1  4
* 出力例
* Low
* High
*/
public class Main {
    public static void main(String[] args) {

        Scanner bk = new Scanner(System.in);

        int num = bk.nextInt();
        int[][] arrayNum = new int[1][2];
        if(0 < num && num < 11) {
            int num2 = bk.nextInt();
            if(0 < num2 && num2 < 5) {
                arrayNum[0][0] = num;
                arrayNum[0][1] = num2;
            }
        }

        int count = bk.nextInt();
        int[][] arrayNum2 = new int[count][2];
        for(int b=0;b<count;b++) {
            for(int k=0;k<2;k++) {
                arrayNum2[b][k] = bk.nextInt();
            }
        }


        for(int b=0;b<count;b++) {
            for(int k=0;k<2;k++) {
                if(k == 0) {
                    if(arrayNum[0][k] > arrayNum2[b][k]) {
                        System.out.print("High");
                        break;
                    }else if(arrayNum[0][k] < arrayNum2[b][k]) {
                        System.out.print("Low");
                        break;
                    }

                }else {
                    if(arrayNum[0][k] < arrayNum2[b][k]) {
                        System.out.print("High");
                    }else if(arrayNum[0][k] > arrayNum2[b][k]) {
                        System.out.print("Low");
                    }

                }

            }
            System.out.println();
        }

    }
}
