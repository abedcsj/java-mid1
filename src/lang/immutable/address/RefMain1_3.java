package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        Address a=new Address("서울");
        Address b=new Address("서울");

        System.out.println("a= "+a);
        System.out.println("b= "+b);



      change(b,"부산");
        System.out.println("a= "+a);
        System.out.println("b= "+b);



    }
    public static void change(Address address,String changeAddress){
        System.out.println("주소값을 변경합니다 -> "+changeAddress);
        address.setValue(changeAddress);
    }
}
