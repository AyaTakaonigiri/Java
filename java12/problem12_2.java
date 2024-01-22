package java12;

class Person {
    //フィールド
    public String name;
    public String job;

    //コンストラクタ
    Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    //メソッド
    void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
    }
}

//スーパークラスがPersonのサブクラスのTeacherを作る
class Teacher extends Person {
    String subject;

    //コンストラクタ
    Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    }

    //メソッド
    void introduce() {
        //オーバーライド
        super.introduce(); 
        System.out.println("担当科目；" + subject);
    }
}

class Cook extends Person {
    String favorite_cuisine;

    //コンストラクタ
    Cook(String name, String job, String favorite_cuisine) {
        super(name, job);
        this.favorite_cuisine = favorite_cuisine;
    }

    //メソッド
    void introduce() {
        //オーバーライド
        super.introduce(); 
        System.out.println("得意料理；" + favorite_cuisine);
    }
}


class problem12_2 {
    public static void main(String[] args) {
        Teacher TC = new Teacher("近藤勇", "教員", "Go言語");
        TC.introduce();
        System.out.println();
        Cook CK = new Cook("沖田総司", "シェフ", "オムライス");
        CK.introduce();
    }
}