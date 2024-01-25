package java12;

//スーパークラスAnimal
class Animal3 {
    String name;

    //コンストラクタ
    public Animal3(String name) {
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

class Dog3 extends Animal3 {
    //コンストラクタ
    public Dog3(String name) {
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

class Bird3 extends Animal3 {
    //コンストラクタ
    public Bird3(String name) {
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


class Whale3 extends Animal3 {
    //コンストラクタ
    public Whale3(String name) {
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

class Human extends Animal3 {
    //コンストラクタ
    public Human(String name) {
        super(name);
    }
    //メソッド
    //スーパークラスのmoveをオーバーライドして表示させる文章を変える
    @Override
    public void move(int length) {
        System.out.println(name + "は、" + length + "メートル歩きました。");  
    }
    @Override
    public void eat(String food) {
        System.out.println(name + "は、" + food + "を食べました。");
    }
}



class problem12_5 {
    public static void main(String[] args) {
        //インスタンス化
        Dog3 DG3 = new Dog3("犬");
        //DG3のmoveメソッド
        DG3.move(10);
        //DG3のeatメソッド
        DG3.eat("お肉");

        //インスタンス化
        Bird3 BD3 = new Bird3("鳥");
        //BD3のmoveメソッド
        BD3.move(1000);
        //BD3のeatメソッド
        BD3.eat("虫");


        //インスタンス化
        Whale3 WL3 = new Whale3("鯨");
        //WL3のmoveメソッド
        WL3.move(50);
        //WL3のeatメソッド
        WL3.eat("オキアミ");

        //インスタンス化
        Human HM = new Human("人");
        //HMのmoveメソッド
        HM.move(300);
        //HMのeatメソッド
        HM.eat("昼ご飯");
    }
    
}
