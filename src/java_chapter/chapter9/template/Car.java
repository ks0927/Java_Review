package java_chapter.chapter9.template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void washCar() {}; //필요에 의해서 재정의해서 씀 , 훅 메서드

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }
    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    public final void run() {  //final . 시나리오 고정 이게  template 메소드
        startCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff();
    }
}
