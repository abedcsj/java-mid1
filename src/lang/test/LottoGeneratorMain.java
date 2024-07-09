package lang.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator=new LottoGenerator();
        int[] number=lottoGenerator.generate();
        for(int i=0;i<lottoGenerator.generate().length;i++){
            System.out.print(number[i]+" ");
        }
    }
}
