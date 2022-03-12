package java_chapter.chapter10.interfaceEx;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();

        Buy buyer = customer; // customer를 Buy라는 타입에 대입
        buyer.buy();

        Sell seller = customer;
        seller.sell();
                            //가상메서드
        customer.order(); //인스턴스의 메소드가 불리는거임
        buyer.order(); //인스턴스의 메소드가 불리는거임
        seller.order(); //인스턴스의 메소드가 불리는거임

    }

}
