package java_chapter.chapter12.collection.treeset;

import java_chapter.chapter12.collection.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private java.util.TreeSet<Member> TreeSet;

    public MemberTreeSet() {
        TreeSet = new TreeSet<Member>(new Member());//new쓴거는 comparator의 compare보여주려고
    }
    public void addMember(Member member) {
        TreeSet.add(member);
    }
    public boolean removeMember(int memberId) {

        Iterator<Member> iterator = TreeSet.iterator();
        while(iterator.hasNext()) {
            Member member =iterator.next();
            int tempId = member.getMemberId();
            if(memberId == tempId) {
                TreeSet.remove(member);
                return true;
            }

        }
        System.out.println(memberId+"가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        for(Member member : TreeSet) {
            System.out.println(member);
        }
        System.out.println();

    }
}
