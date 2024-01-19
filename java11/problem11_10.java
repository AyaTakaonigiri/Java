class BookInfo {
    //フィールド
    private String book_title;
    private String author;
    private String publication_year;
    private static int book_number = 0;

    //コンストラクタ
    public BookInfo(String new_book_title, String new_author, String new_publiction_year) {
        book_title =  new_book_title;
        author = new_author;
        publication_year = new_publiction_year;
        book_number += 1;
    }
    String getBook_title() {return book_title;}
    String getAuthor() {return author;}
    String getPublication_year() {return publication_year;}

    String setBook_title(String a) {return this.book_title = a;}
    String setAuthor(String b) {return this.author = b;}
    String setPublication_year(String c) {return this.publication_year = c;}

    //メソッド
    public int getBooknumbew() {
        return book_number;
    }
}

class problem11_10 {
    public static void main(String[] args) {
    BookInfo sangokusi = new BookInfo("三国志","吉川英治","1989");
    System.out.println("書    名：" + sangokusi.getBook_title());
    System.out.println("著 者 名：" + sangokusi.getAuthor());
    System.out.println("出 版 年：" + sangokusi.getPublication_year());
    System.out.println("書籍番号：" + sangokusi.getBooknumbew());

    BookInfo youreiden = new BookInfo("楊令伝","北方謙三","2011");
    System.out.println("書    名：" + youreiden.getBook_title());
    System.out.println("著 者 名：" + youreiden.getAuthor());
    System.out.println("出 版 年：" + youreiden.getPublication_year());
    System.out.println("書籍番号：" + youreiden.getBooknumbew());

    BookInfo ryouma = new BookInfo("竜馬がゆく","司馬遼太郎","1998");
    System.out.println("書    名：" + ryouma.getBook_title());
    System.out.println("著 者 名：" + ryouma.getAuthor());
    System.out.println("出 版 年：" + ryouma.getPublication_year());
    System.out.println("書籍番号：" + ryouma.getBooknumbew());
    
    BookInfo bottyan = new BookInfo("坊ちゃん","夏目漱石","1906");
    System.out.println("書    名：" + bottyan.getBook_title());
    System.out.println("著 者 名：" + bottyan.getAuthor());
    System.out.println("出 版 年：" + bottyan.getPublication_year());
    System.out.println("書籍番号：" + bottyan.getBooknumbew());

    BookInfo waganeko = new BookInfo("吾輩は猫である","夏目漱石","1905");
    System.out.println("書    名：" + waganeko.getBook_title());
    System.out.println("著 者 名：" + waganeko.getAuthor());
    System.out.println("出 版 年：" + waganeko.getPublication_year());
    System.out.println("書籍番号：" + waganeko.getBooknumbew());
    }
}