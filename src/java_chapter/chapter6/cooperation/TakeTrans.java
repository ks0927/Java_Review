package java_chapter.chapter6.cooperation;

public class TakeTrans {
    public static void main(String[] args){
        Student james = new Student("james",5000);
        Student tomes = new Student("tomes",10000);

        Bus bus100 = new Bus(100);
        james.takeBus(bus100);
        james.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway(2);
        tomes.takeSubway(subwayGreen);
        tomes.showInfo();
        subwayGreen.showInfo();

    }
}
