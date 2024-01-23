
//階層が違うファイルをインポートする

import problem12_3_extra.Bird;
import problem12_3_extra.Dog;
import problem12_3_extra.Whale;

public class problem12_3_5 {
    public static void main(String[] args) {
        //インスタンス化
        Dog DG = new Dog("犬");
        //DGのmoveメソッド
        DG.move(10);

        //インスタンス化
        Bird BD = new Bird("鳥");
        //BDのmoveメソッド
        BD.move(1000);

        //インスタンス化
        Whale WL = new Whale("鯨");
        //WLのmoveメソッド
        WL.move(50);
    }
}
