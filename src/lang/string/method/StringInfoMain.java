package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str1 = "hello, Java!";
        System.out.println("문자열의 길이: " + str1.length());
        System.out.println("문자열의 비어있는지: " + str1.isEmpty());
        System.out.println("문자열이 공백인지: " + str1.isBlank());
        System.out.println("문자열이 비어있거나 공백인지: " + "       ".isBlank());

        char c= str1.charAt(7);
        System.out.println("7번째 인덱스 문자: "+c);


    }
}
