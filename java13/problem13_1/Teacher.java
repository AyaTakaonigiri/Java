package java13.problem13_1;

class Teacher extends Person {
    //フィールド
    String name;
    String job;
    String subject;

    //コンストラクタ
    Teacher(String subject) {
        this.subject = subject;
    }


    //抽象クラスPersonの抽象メソッドをオーバライドする
    
    //introduceのオーバーライド
    @Override void introduce() {
        System.out.println("担当科目："+subject);
    }

    //constructのオーバーライド
    @Override void construct(String name, String job) {
        System.out.println("氏名："+name);
        System.out.println("職種："+job);
    }
}
