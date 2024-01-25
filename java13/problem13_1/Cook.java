package java13.problem13_1;

class Cook extends Person {
    String name;
    String job;
    String favorite_cuisine;

    //コンストラクタ
    Cook(String favorite_cuisine) {
        this.favorite_cuisine = favorite_cuisine;
    }

    //抽象クラスPersonの抽象メソッドをオーバライドする
    
    //introduceのオーバーライド
    @Override void introduce() {
        System.out.println("担当科目："+favorite_cuisine);
    }

    //constructのオーバーライド
    @Override void construct(String name, String job) {
        System.out.println("氏名："+name);
        System.out.println("職種："+job);
    }
}
