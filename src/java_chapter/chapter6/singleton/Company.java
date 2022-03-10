package java_chapter.chapter6.singleton;

public class Company {

    private static Company instanace = new Company();

    private Company(){}

    public static Company getInstanace(){
        if(instanace==null){
            instanace = new Company();
        }
        return instanace;
    }
}
