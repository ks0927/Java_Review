package java_chapter.chapter12.collection.hashset;

import java_chapter.chapter12.collection.Member;

public class MemberHashSetTest {

    public static void main(String[] args) {

        MemberHashSet m= new MemberHashSet();
        Member memberLee = new Member(101,"이순신");
        Member memberKim = new Member(102,"김유신");
        Member memberShin = new Member(103,"신사임당");

        m.addMember(memberLee);
        m.addMember(memberKim);
        m.addMember(memberShin);

        m.showAll();//들어가는 순서와 나오는순서는 같지않다.

        Member memberLee2 = new Member(101,"이몽룡");
        m.addMember(memberLee2);
        m.showAll(); //왜 들어감? 이순신하고 같은 101인데?
        //hashcode하고 equals 건드리니까 안드감. 같은아이디일때 안된다고 재정의함
        //String은 알아서 구현되어있을텐데 Member는 내가 구현한거라 재정의해야됨

    }

}
