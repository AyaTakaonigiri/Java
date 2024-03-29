
package java12;

//スーパークラスAnimal
class Animal2 {
    String name;

    //コンストラクタ
    public Animal2(String name) {
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

class Dog2 extends Animal2 {
    //コンストラクタ
    public Dog2(String name) {
        super(name);
    }
    //メソッド
    //スーパークラスのmoveをオーバーライドして表示させる文章を変える
    @Override
    public void move(int length) {
        System.out.println(name + "は、" + length + "メートル走りました。");  
    }

    @Override
    public void eat(String food) {
        System.out.println(name + "は、" + food + "を食べました。");
    }
}

class Bird2 extends Animal2 {
    //コンストラクタ
    public Bird2(String name) {
        super(name);
    }
    //メソッド
    //スーパークラスのmoveをオーバーライドして表示させる文章を変える
    @Override
    public void move(int length) {
        System.out.println(name + "は、" + length + "キロメートル飛びました。");  
    }
    @Override
    public void eat(String food) {
        System.out.println(name + "は、" + food + "を食べました。");
    }
}


class Whale2 extends Animal2 {
    //コンストラクタ
    public Whale2(String name) {
        super(name);
    }
    //メソッド
    //スーパークラスのmoveをオーバーライドして表示させる文章を変える
    @Override
    public void move(int length) {
        System.out.println(name + "は、" + length + "キロメートル泳ぎました。");  
    }
    @Override
    public void eat(String food) {
        System.out.println(name + "は、" + food + "を食べました。");
    }
}

class problem12_4 {
    public static void main(String[] args) {
        //インスタンス化
        Dog2 DG2 = new Dog2("犬");
        //DG2のmoveメソッド
        DG2.move(10);
        //DG2のeatメソッド
        DG2.eat("お肉");

        //インスタンス化
        Bird2 BD2 = new Bird2("鳥");
        //BD2のmoveメソッド
        BD2.move(1000);
        //BD2のeatメソッド
        BD2.eat("虫");


        //インスタンス化
        Whale2 WL2 = new Whale2("鯨");
        //WL2のmoveメソッド
        WL2.move(50);
        //WL2のeatメソッド
        WL2.eat("オキアミ");
    }
    
}