package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address=new ImmutableAddress("서울");

        MemberV2 memberA=new MemberV2("회원A",address);
        MemberV2 memberB=new MemberV2("회원B",address);

        System.out.println("memberA= "+memberA);
        System.out.println("memberB= "+memberB);

        //회원 B의 주소를 부산으로 옮기고 싶음
        ImmutableAddress newAddress=new ImmutableAddress("부산");
        memberB.setAddress(newAddress);
        System.out.println("부산-> memberB.address");
        System.out.println("memberA= "+memberA);
        System.out.println("memberB= "+memberB);

    }
}
