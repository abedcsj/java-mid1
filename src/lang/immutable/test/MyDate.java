package lang.immutable.test;

public class MyDate {
    private final int year;
    private int month;
    private int day;
    public MyDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public int getYear() {
        return year;
    }
    public MyDate setYear(int year) {
        return new MyDate(year,month,day);
    }

    @Override
    public String toString() {
        return
                 year +"-"+ month + "-"+ day ;

    }
}
