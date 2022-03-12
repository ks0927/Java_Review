package java_chapter.chapter10.interfaceEx;

public interface Buy {

    void buy();

    default void order() {
        System.out.println("구매주문");
    }
}
