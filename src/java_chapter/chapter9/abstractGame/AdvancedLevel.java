package java_chapter.chapter9.abstractGame;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 점프함");
    }

    @Override
    public void turn() {
        System.out.println("잘못돔");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("*****중급자레벨*****");
    }
}
