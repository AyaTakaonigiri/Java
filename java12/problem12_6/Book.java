package java12.problem12_6;


class Book {
    private static int counter = 0;
    String title;
    String auther;
    int price;
    int id;

    //コンストラクタ
    //Bookクラスがインスタンス化されつ旅にカウントする
    Book(String title, String auther, int price, int id){
        this.title = title;
        this.auther = auther;
        this.price = price;
        this.id = id;
        counter += 1;
    }

    //メソッド
    void construct(String title, String auther, int price) {
        System.out.println("書名："+title);
        System.out.println("著者名："+auther);
        System.out.println("価格："+price+"円");
        
    }

    void dispInfo() {
        //中身無し
    }

    //インスタンス化された回数をゲッタで取得できるようにする
    public static int getCounter() {
        return counter;
    }
}
