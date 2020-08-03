package Rank_C.C030;

import java.util.Scanner;

/* C030:白にするか黒にするか
* あなたは拾った古いパソコンで画像を表示するため、
* グレースケールの画像を白黒の二値画像に変換する事にしました。
* グレースケールの画像では 255 (白) から 0 (黒) の 256 階調で画像を表現します。
* 0 に近いほど黒色に, 255 に近いほど白色に近い色になります。
* 二値画像では単純に 1 (白) から 0 (黒) の 2 階調で表現します。
* このため、グレーな画素値を白か黒にする必要があります。 (画素とは画像の最小単位の点を表します)
*
* 今回は単に表示するだけなので、単純に以下の条件を用いて二値画像に変換します。
* ・画素値が 128 以上 : 1 (白)
* ・画素値が 127 以下 : 0 (黒)
* 入力例
* 3 2
* 128 127
* 127 128
* 128 127
* 出力例
* 1 0
* 0 1
* 1 0
* */

public class Main {
    public static void main(String[] args) {

        Scanner bk = new Scanner(System.in);
        int line = bk.nextInt();
        int line2 = bk.nextInt();

        if(line2>1){
            int[][] num = new int[line][line2];
            for(int b=0;b<line;b++){
                for(int k=0;k<line2;k++){
                    int in = bk.nextInt();
                    if(in>127){
                        num[b][k]=1;
                    }else{
                        num[b][k]=0;
                    }
                }
            }

            for(int b=0;b<line;b++){
                for(int k=0;k<line2;k++){
                    if(k<line2-1){
                        System.out.print(num[b][k]+" ");
                    }else{
                        System.out.print(num[b][k]);
                    }
                }
                System.out.println();
            }


        }else{
            int[] num = new int[line];

            for(int b=0;b<line;b++){
                int in = bk.nextInt();
                if(in>127){
                    num[b]=1;
                }else{
                    num[b]=0;
                }
            }

            for(int b=0;b<line;b++){
                if(b<line-1){
                    System.out.print(num[b]+" ");
                }else{
                    System.out.print(num[b]);
                }
            }

        }
    }
}

