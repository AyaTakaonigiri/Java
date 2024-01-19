import java.util.Scanner;

class problem9_1 {
    static void nameschool(String school, String name) {
        System.out.println("学校名："+school);
        System.out.println("名前："+name);
    }

        public static void main(String[] args) {
/*      String school = "北九州情報itクリエイター専門学校";
        String name = "髙橋彩斗";
        nameschool(school, name);
    }
*/
        Scanner stdIn = new Scanner(System.in);
        String school = stdIn.next();
        String name = stdIn.next();
        nameschool(school, name);
        }

}
