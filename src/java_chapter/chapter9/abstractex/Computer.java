package java_chapter.chapter9.abstractex;

public abstract class Computer {
    //abstract 메서드를 가지면 추상클래스가됨
    //왜씀? 상속하려고. 하위클래스에서 구현함 .인스턴스화 안됨
    //하위 클래스에 위임시켰고, 하위클래스들은 책임이있다.
    public abstract void display();
    public abstract void typing();

    public void turnon(){
        System.out.println("전원을 켭니다.");
    }
    public void turnoff(){
        System.out.println("전원을 끕니다.");
    }

}
