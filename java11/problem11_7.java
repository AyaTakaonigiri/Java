class Student{
    // フィールド
    String name;
    String studentnumber;
    int japanese;
    int math;
    int english;

    //コンストラクタ（クラス名と同一の名前にすること）（クラスをインストラクタしたときに一回だけはいるもの）
    Student(String new_name, String new_studentnumber, int new_japanese, int new_math, int new_english) {
        name = new_name;
        studentnumber = new_studentnumber;
        japanese = new_japanese;
        math = new_math;
        english = new_english;
    }

    // メソッド
    public double Sum3() {
        return japanese + math + english;
    }

    public double Avg(double total) {
        return ((float)(total)/3);
    }

}

class problem11_7 {
    public static void main(String[] args) {
    Student StuA = new Student("Aさん", "001", 89, 65, 88);
    Student StuB = new Student("Bさん", "002", 80, 95, 64);
    Student StuC = new Student("Cさん", "003", 70, 80, 98);

        System.err.println(StuA.studentnumber + "番 " + StuA.name + " 平均点 " + Math.floor(StuA.Avg(StuA.Sum3())*100)/100);
        System.err.println(StuB.studentnumber + "番 " + StuB.name + " 平均点 " + Math.floor(StuB.Avg(StuB.Sum3())*100)/100);
        System.err.println(StuC.studentnumber + "番 " + StuC.name + " 平均点 " + Math.floor(StuC.Avg(StuC.Sum3())*100)/100);

    }

}
