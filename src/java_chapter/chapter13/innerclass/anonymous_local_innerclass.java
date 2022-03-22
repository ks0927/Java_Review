package java_chapter.chapter13.innerclass;

class Outer{

    int outNum = 100;
    static int sNum = 200;

    Runnable runnable = new Runnable() {

        @Override
        public void run() {        //익명 innerclass  이걸 많이쓰긴함
            System.out.println("runnable");
        }

    };

    public Runnable getRunnable( int i) { //i  final     // local innerclass

        int localNum = 300;  //final
        return new Runnable() {
            @Override
            public void run() {
                //localNum += 100; 스택에 자리잡는데 메소드의 호출이 끝나면 없어짐

                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);//변화말고 그냥 쓰는 건 ok
                System.out.println(i); //변화말고 그냥 쓰는건 ok
            }

        };
    }
}


public class anonymous_local_innerclass {

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.getRunnable(4).run();//이걸 다르게 보면
        /*Runnable runnable = outer.getRunnable();
         * ~
         * ~
         * runnable.run(); 이놈이 호출되는 시점에 localNum과 같은 변수는 사라질수도있다는거
         * 그래서 그냥 final로걍 선언해버림 변화가 안됨
         */

        outer.runnable.run();

    }
}
