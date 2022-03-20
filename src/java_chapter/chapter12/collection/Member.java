package java_chapter.chapter12.collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {

    private int memberId;
    private String memberName;

    public Member() {
    }

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String toString() {
        return memberName + "회원님의 아이디는" + memberId + "입니다.";
    }

    @Override
    public int hashCode() {

        return memberId;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.memberId == member.memberId) {
                return true;

            } else return false;
        }
        return false;

    }

    @Override
    public int compareTo(Member member) {//comparable

        return (this.memberId - member.memberId); //매개변수와 나를 비교해서 내가더 클때 리턴을양수로 = 오름차순 반대로하면(*-1) 내림차순
        //return (this.memberName.compareTo(member.memberName));// 이름으로 비교하려면?(String이면?) / String에는 compareto가 구현되어있음 오름차순으로
    }

    @Override
    public int compare(Member member1, Member member2) {//comparator
                                                        //1이 나고 2가 넘어온놈
        return (member1.memberId - member2.memberId);
    }

}