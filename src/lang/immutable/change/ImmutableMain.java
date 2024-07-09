package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObject immutableObj1=new ImmutableObject(10);
        immutableObj1.add(20);
        System.out.println(immutableObj1.add(20).getValue());

    }
}
