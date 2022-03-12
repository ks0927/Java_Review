package java_chapter.chapter10.bookshelf;

public class BookShelfTest {

    public static void main(String[] args) {

        Queue shelfQueue = new Bookshelf();
        shelfQueue.enQueue("태백산맥1");
        shelfQueue.enQueue("태백산맥2");
        shelfQueue.enQueue("태백산맥3");

        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());

    }
}
