package java13.problem13_3;

public class Teacher implements Person{
    //フィールド
    String name;
    String job;
    String subject;


    //コンストラクタ
    Teacher(String name, String job, String subject) {
        this.name = name;
        this.job = job;
        this.subject = subject;
    }

    //オーバーライド
    @Override
    //必ずpublicをつける
    public void introduce() {
        System.out.println("氏名："+name);
        System.out.println("職種："+job);
        System.out.println("担当科目："+subject);
    }
    
}
