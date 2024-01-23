package problem12_3_extra;

public class Dog extends Animal {
    //コンストラクタ
    public Dog(String name) {
        super(name);
    }
    //メソッド
    //スーパークラスのmoveをオーバーライドして表示させる文章を変える
    @Override
    public void move(int length) {
        System.out.println(name + "は、" + length + "メートル走りました。");  
    }
}