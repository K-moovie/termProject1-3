package movie.discount;

public class Child extends DiscountedTicket {

    public Child() {
        type = "유아 요금\n";
    }
    
    @Override
    public double cost() {
        return 8000;
    }
}