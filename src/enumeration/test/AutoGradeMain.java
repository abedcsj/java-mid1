package enumeration.test;

public class AutoGradeMain {

    public static void main(String[] args) {
        AutoGrade[]values=AutoGrade.values();
        for (AutoGrade value : values) {
            System.out.println("name: "+value.name()+" level: "+value.getLevel()+" description: "+value.getDescription());

        }


    }
}
