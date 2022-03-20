package java_chapter.chapter12.collection.hashmap;

import java_chapter.chapter12.collection.Member;

public class MemberHashMapTest {

    public static void main(String[] args) {
        MemberHashMap m= new MemberHashMap();
        Member memberLee = new Member(102,"이순신");
        Member memberKim = new Member(101,"김유신");
        Member memberShin = new Member(103,"신사임당");

        m.addMember(memberLee);
        m.addMember(memberKim);
        m.addMember(memberShin);

        m.showAllMember();
        System.out.println();

        m.removeMember(102);
        m.showAllMember();

    }

}
