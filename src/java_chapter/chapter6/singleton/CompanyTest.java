package java_chapter.chapter6.singleton;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args){

        Company company1 = Company.getInstanace();
        Company company2 = Company.getInstanace();

        System.out.println(company1);
        System.out.println(company2);
        // 여러개 만들어지면 곤란할때 쓰는 패턴
        Calendar calendar =Calendar.getInstance(); // 이거도 singleton 예시
    }
}
