package java_chapter.chapter11.classex;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {

        //클래스의 정보를 알아와서하는 프로그램/ reflection 프로그램 ,이런거 쓸때 class 클래스를씀
        //클래스 클래스는 컴파일된 클래스 파일에서 객체의 정보를 가져올수있음
        Person person = new Person();

        Class pClass1 = person.getClass(); //getclass는 object메서드임
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("java_chapter.chapter11.classex.Person");//문자열을 써서 이 이름의 클래스가 있으면 메모리에 로딩시키는거임
        //이런놈들을 동적로딩이라고 함
        //컴파일시 데이터타입이 모두 binding되어 자료형로딩되는것은 static로딩
        //실행중에 데이터타입을 알고 binding하는게 동적로딩인거
        System.out.println(pClass3.getName());
    }
}
