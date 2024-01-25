package java13.problem13_1;

//抽象クラスの作成
abstract class Person {
    //フィールド
    String name;
    String job;

    //メソッド
    //抽象メソッドを作る（抽象メソッドは中身を作らない代わりに継承先でオーバーライドする）
    abstract void introduce();
    abstract void construct(String name, String job);
}
