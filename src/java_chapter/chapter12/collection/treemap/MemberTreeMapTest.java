package java_chapter.chapter12.collection.treemap;

import java_chapter.chapter12.collection.Member;

public class MemberTreeMapTest {

    public static void main(String[] args) {
        MemberTreeMap m= new MemberTreeMap();
        Member memberLee = new Member(102,"이순신");
        Member memberKim = new Member(101,"김유신");
        Member memberShin = new Member(103,"신사임당");

        m.addMember(memberLee);
        m.addMember(memberKim);
        m.addMember(memberShin);

        m.showAllMember(); //정렬이 되서 나옴 Integer내에서 comparable이 구현되어있어서 그럼
        //Integer가 아니면 Member에 만든거처럼 다시만들어야댐


    }

}
