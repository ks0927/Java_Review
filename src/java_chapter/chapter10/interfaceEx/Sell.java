package java_chapter.chapter10.interfaceEx;

public interface Sell {
    void sell();
    default void order() {
        System.out.println("판매주문");
    }
}
