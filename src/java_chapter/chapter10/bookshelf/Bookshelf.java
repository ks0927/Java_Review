package java_chapter.chapter10.bookshelf;

public class Bookshelf extends Shelf implements Queue {

    @Override
    public void enQueue(String title) {
        shelf.add(title); //맨뒤로 들어감
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }

}
