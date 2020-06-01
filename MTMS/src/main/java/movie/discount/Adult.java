package movie.discount;

public class Adult extends DiscountedTicket {

    public Adult() {
        type = "성인 요금\n";
    }

    @Override
    public double cost() {
        return 12000;
    }
}