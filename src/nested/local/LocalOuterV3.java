package nested.local;

public class LocalOuterV3 {

    private int outInstanceVar=3;


    public Printer process(int paramVar){

        int localVar=1;

        class LocalPrinter implements Printer{
            int value=0;

            @Override
            public void print(){
                System.out.println("Values= "+value);


                System.out.println("localVar= "+localVar);
                System.out.println("paramVar= "+paramVar);
                System.out.println("outInstanceVar= "+outInstanceVar);
            }


        }
        LocalPrinter localPrinter=new LocalPrinter();
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter=new LocalOuterV3();
        Printer printer=localOuter.process(2);
        printer.print();
    }
}
