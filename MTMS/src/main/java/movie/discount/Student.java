package movie.discount;

public class Student extends DiscountedTicket {

    public Student() {
        type = "학생 요금\n";
    }
    
    @Override
    public double cost() {
        return 10000;
    }
}
