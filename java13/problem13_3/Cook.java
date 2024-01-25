package java13.problem13_3;

public class Cook implements Person{
    //フィールド
    String name;
    String job;
    String specialties;


    //コンストラクタ
    Cook(String name, String job, String specialties) {
        this.name = name;
        this.job = job;
        this.specialties = specialties;
    }

    //オーバーライド
    @Override
    //必ずpublicをつける
    public void introduce() {
        System.out.println("氏名："+name);
        System.out.println("職種："+job);
        System.out.println("担当科目："+specialties);
    }
    
}