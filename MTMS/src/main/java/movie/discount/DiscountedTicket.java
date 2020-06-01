package movie.discount;

public abstract class DiscountedTicket {

    public abstract double cost();

    protected String type = "아직 정해지지않았습니다.";

    public String getDiscountType() {
        return type;
    }
}