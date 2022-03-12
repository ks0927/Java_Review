package java_chapter.chapter9.abstractGame;

public class MainBoard {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);

/*      Player player2 = new Player();
        player2.play(1);
        player2.upgradeLevel(new AdvancedLevel());  // 해보려고 살짝 테스트. 잘되네
        player2.play(2);*/
    }
}
