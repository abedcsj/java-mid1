package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        Address a=new Address("서울");
        Address b=new Address("서울");
        System.out.println("a= "+a);
        System.out.println("b= "+b);


        b.setValue("부산");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }

}
