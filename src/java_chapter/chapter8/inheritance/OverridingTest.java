package java_chapter.chapter8.inheritance;

public class OverridingTest {
    public static void main(String[] args) {


        Customer customerwho = new VIPCustomer(10000,"who",100);
        int price = customerwho.calcPrice(10000);//묵시적 형변환과 재정의된 메서드 호출 ,자바는 다 가상메서드임
        //어떤 객체의 변수나 메서드의 참조는 타입을 따라가지만
        //가상메서드는 타입과 관계없이 인스턴스의 메서드를 따라감
        System.out.println("지불금액은 "+price+  "이고, "+ customerwho.showCustomerInfo());
    }
}
