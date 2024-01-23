package problem12_3_extra;

class Animal {
    String name;
    int length;

    //コンストラクタ
    public Animal(String name) {
        this.name = name;
    }

    //メソッド
    //継承先で文章をオーバーライドするから中身がなくてもよい？
    public void move(int length) {
        System.out.println("何かがどれくらい動いたか");
    }
}
