public class Member {

    private int memberId;
    private String memberName;

    // Constructor
    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    // Getters
    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    @Override
    public String toString() {
        return "Member ID : " + memberId +
               "\nMember Name : " + memberName;
    }
}