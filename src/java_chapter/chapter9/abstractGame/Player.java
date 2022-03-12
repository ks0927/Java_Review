package java_chapter.chapter9.abstractGame;

public class Player {
    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }
    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage(); //인스턴스가 달라져서 오버라이딩되어서 다른 레벨이나옴
    }

    public void play(int count) {
        level.go(count);
    }
}
