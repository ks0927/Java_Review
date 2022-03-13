package java_chapter.chapter11.object;
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title+", "+author;
    }
}
public class ToStringEx {
    public static void main(String[] args) {

        Book book = new Book ("두잇자바","은종님");
        System.out.println(book); //toString 손보기전엔 참조값이 출력되지만
                                    // toString을 object클래스에서 오버라이딩하면 제목하고 저자가 나옴

        String str = new String("test");
        System.out.println(str); // 왜 너는 test가 나옴? String의 toString이 자기 문자열 출력하도록 되어있어서..
                                // ~~.toString이 자동호출 되는중

    }
}
