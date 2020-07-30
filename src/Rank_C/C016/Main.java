package Rank_C.C016;
import java.util.Scanner;
/* Leet文字列
* Leet と呼ばれるインターネットスラングがあります。
* Leet ではいくつかのアルファベットをよく似た形の他の文字に置き換えて表記します。
* Leet の置き換え規則はたくさんありますが、ここでは次の置き換え規則のみを考えましょう。
* 入力例：PAIZA
* 出力例：P4124
* */

public class Main {
    public static void main(String[] args){
        Scanner bk = new Scanner(System.in);
        String str = bk.nextLine();

        str = str.replaceAll("A","4");
        str = str.replaceAll("E","3");
        str = str.replaceAll("G","6");
        str = str.replaceAll("I","1");
        str = str.replaceAll("O","0");
        str = str.replaceAll("S","5");
        str = str.replaceAll("Z","2");

        System.out.println(str);
    }
}
