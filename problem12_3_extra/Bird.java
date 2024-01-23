package problem12_3_extra;

public class Bird extends Animal {
    //コンストラクタ
    public Bird(String name) {
        super(name);
    }
    //メソッド
    //スーパークラスのmoveをオーバーライドして表示させる文章を変える
    @Override
    public void move(int length) {
        System.out.println(name + "は、" + length + "キロメートル飛びました。");  
    }
}