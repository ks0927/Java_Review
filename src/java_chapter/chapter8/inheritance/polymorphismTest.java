package java_chapter.chapter8.inheritance;
import java.util.ArrayList;

class Animal{
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
class Human extends Animal{
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
    public void readBook(){
        System.out.println("사람이 책을 읽습니다");
    }

}
class Tiger extends Animal{
    public void move() {
        System.out.println("호랑이가 네발로뜁니다.");
    }
}
class Eagle extends Animal{
    public void move() {
        System.out.println("독수리가 납니다.");
    }
}
public class polymorphismTest {
    public static void main(String[] args) {

        polymorphismTest test = new polymorphismTest();
        test.moveAnimal(new Human());//Animal animal = new Human(); 같은거임
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());

		/* 뭐 이런것도 있음
		Animal[] animalList = new Animal[3];
		animalList[0] new Human();

		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
		*/


    }

    public void moveAnimal(Animal animal) {
        animal.move(); //코드는 한줄인데 코드에대한 결과가 다양함 이게 다형성

        if(animal instanceof Human){  //instanceof 원래의 인스턴스 타입을 체크하는 예약어
            Human human = (Human)animal; // 다운캐스팅
            human.readBook();
        }
    }

}
