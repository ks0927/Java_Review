package java_chapter.chapter9.abstractGame;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프 못해");
    }

    @Override
    public void turn() {
        System.out.println("못돌아");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("*****초보자레벨*****");
    }
}
