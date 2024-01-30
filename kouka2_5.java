import java.util.Scanner;

class kouka2_5 {
    public static void main(String[] args) {
        
        //入力できるようにするためにスキャナークラスをインスタンス化
        Scanner stdIn = new Scanner(System.in);

        //StringBuilderクラスで処理するので、StringBuilderクラスをインスタンス化する
        StringBuilder SB = new StringBuilder();
        
        //パスワードの入力
        System.out.print("現在のパスワードを入力してください：");
        
        //文字列として変数passwordに代入する
        String password = stdIn.next(); 

        //セキュリティ上の問題がある事を表示する
        System.out.println("セキュリティ上の問題を発見しました。");
        System.out.println("セキュリティを強化したパスワードを作成しました。");
        System.out.println("こちらをお使いください");

        //パスワードを逆順にする
        //StringBuilderのappendメソッドを使って、StringBuilderオブジェクトに文字列を追加する
        SB.append(password);
        //追加した文字列を逆順にする
        SB.reverse();
        //逆順にしたパスワードを表示する
        System.out.println("あたらしいパスワードは\""+SB.toString()+"\"です。");
    }    
}
