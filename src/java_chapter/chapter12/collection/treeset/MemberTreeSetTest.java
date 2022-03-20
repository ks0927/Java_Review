package java_chapter.chapter12.collection.treeset;

import java_chapter.chapter12.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet m= new MemberTreeSet();
        Member memberLee = new Member(102,"이순신");
        Member memberKim = new Member(101,"김유신");
        Member memberShin = new Member(103,"신사임당");

        m.addMember(memberLee);
        m.addMember(memberKim);
        m.addMember(memberShin);

        m.showAll();	//String에는 Comparable이 이미구현이 되어있어서 어떻게 구성되는지 정해져있고, 정렬됨


    }
}
