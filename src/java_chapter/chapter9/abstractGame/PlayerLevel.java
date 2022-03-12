package java_chapter.chapter9.abstractGame;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    final public void go(int count) { //이게 시나리오. template 메소드
        run();
        for(int i=0; i<count; i++) {
            jump();
        }
        turn();
    }
}
