package java_chapter.chapter8.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {

        Customer customerLee = new Customer();
        customerLee.setCustomerID(10100);
        customerLee.setCustomerName("Lee");
        // 결국 업캐스팅을 하는 이유는 다 같은 타입으로 배열에 때려넣을수있다는거
        Customer customerKim = new VIPCustomer(10101,"Kim",213);
        //하위클래스가 생성될때 상위클래스가 먼저 생성됨

        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());
    }
}
