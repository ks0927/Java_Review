package java_chapter.chapter13.innerclass;

class OutClass{

    private int num =10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }
    class InClass{ //인스턴스 이너 클래스
        int inNum = 200;
        //static sInNum =100; static은 인스턴스와 상관없이 생성되는데 내부클래스가 맘대로만들어지는게 아니니까 안됨
        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }

    }
    public void usingInTest() {
        inClass.inTest();
    }
    static class InStaticClass{ //스태틱 이너 클래스
        int iNum = 100;
        static int sInNum = 200;
        void inTest() {
            //num += 10;
            sNum += 10;
            System.out.println(sNum);
            System.out.println(iNum);
            System.out.println(sInNum);
        }

        static void sTest() {
            System.out.println(sNum);
            System.out.println(sInNum);
        }
    }
}

public class instance_static_innerclass {

    public static void main(String[] args) {

        OutClass outClass = new OutClass();
        //outClass.inClass.inTest(); //private가 아닐때

		/*
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();          //private일때 쓰는법
		*/

        outClass.usingInTest(); //이게 무난하게쓰는방법

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        OutClass.InStaticClass.sTest();
    }

}