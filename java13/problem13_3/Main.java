package java13.problem13_3;

public class Main {
    public static void main(String[] args) {
        //ポリモフィズム
        Person a[] = new Person[2];
        
        //それぞれの配列にインスタンス化したクラスを入れる
        a[0] = new Teacher("竹井一馬", "教員", "情報処理");
        a[1] = new Cook("大原太郎", "シェフ", "オムライス");

        //配列の中身を順番にすべて出力する処理
        for (Person insutansu : a) {
            insutansu.introduce();
            //２回目の出力時には改行しない
            if (insutansu != a[1]){
                System.out.println();
            }
        }
    }
}
