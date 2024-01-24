package java13;

public class Main {
    public static void main(String[] args) {
        //インスタンス化
        Teacher TC = new Teacher("情報処理");
        //TCのconstructとintroduceメソッドを呼び出す
        TC.construct("竹井一馬", "教員");
        TC.introduce();

        //改行
        System.out.println();

        //インスタンス化
        Cook CK = new Cook("オムライス");
        //CKのconstructとintroduceメソッドを呼び出す
        CK.construct("大原太郎", "シェフ");
        CK.introduce();
    }
}
