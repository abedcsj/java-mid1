package enumeration.test;

import java.util.Scanner;

public class AutoGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("당신의 등급을 입력해주세요 [GUEST,LOGIN,ADMIN]");
        String grade=scanner.nextLine();

        AutoGrade autoGrade=AutoGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 = "+autoGrade.getDescription());

        System.out.println("당신의 레벨은 = "+autoGrade.getLevel());

    }
}
