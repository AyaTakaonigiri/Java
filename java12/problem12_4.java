//別のフォルダを見てるから要改善！

package java12;

//スーパークラスAnimal
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
    public void eat(String food) {
        System.out.println("何が何を食べるのか");
    }
}

class Dog extends Animal {
    //コンストラクタ
    public Dog(String name) {
        super(name);
    }
    //メソッド
    //スーパークラスのmoveをオーバーライドして表示させる文章を変える
    @Override
    public void move(int length) {
        System.out.println(name + "は、" + length + "メートル走りました！");  
    }
}

class Bird extends Animal {
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


class Whale extends Animal {
    //コンストラクタ
    public Whale(String name) {
        super(name);
    }
    //メソッド
    //スーパークラスのmoveをオーバーライドして表示させる文章を変える
    @Override
    public void move(int length) {
        System.out.println(name + "は、" + length + "キロメートル泳ぎました。");  
    }
}

class problem12_4 {
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