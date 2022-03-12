package java_chapter.chapter9.template;

public class AICar extends Car{
    @Override
    public void drive() {

        System.out.println("자율주행합니다.");
        System.out.println("자동차가 스스로 방향전환");
    }

    @Override
    public void stop() {
        System.out.println("자동차가 스스로멈춤");

    }

    @Override
    public void wiper() {
        System.out.println("와이퍼 자동조절");
    }

    @Override
    public void washCar() {
        System.out.println("자동세차");
    }
}
