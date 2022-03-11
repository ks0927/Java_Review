package java_chapter.chapter8.witharraylist;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args){

        ArrayList<Customer> customerArrayList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10010,"이순신");
        Customer customerShin = new Customer(10011,"신사임당");
        GoldCustomer customerKim = new GoldCustomer(10012,"김성민");
        GoldCustomer customerken = new GoldCustomer(10013,"켄");
        VIPCustomer customermoon = new VIPCustomer(10014,"문",12345);

        customerArrayList.add(customerLee);
        customerArrayList.add(customerShin);
        customerArrayList.add(customerKim);
        customerArrayList.add(customerken);
        customerArrayList.add(customermoon);

        System.out.println("======고객정보 출력======");

        for (Customer customer : customerArrayList){
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("======할인율과 보너스 포인트 출력======");
        int price= 10000;
        for (Customer customer : customerArrayList){
            int cost = customer.calcPrice(price);

            System.out.println(customer.getCustomerName()+"님이 "+cost+"를 지불하셨습니다");
            System.out.println(customer.showCustomerInfo());
        }

    }
}
