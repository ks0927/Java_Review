package java_chapter.chapter9.abstractGame;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("엄청빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("엄청점프 잘해");
    }

    @Override
    public void turn() {
        System.out.println("개잘돔");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("*****상급자레벨*****");
    }
}
