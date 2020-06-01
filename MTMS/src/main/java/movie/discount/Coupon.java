package movie.discount;

public class Coupon extends DiscountDecorator {

    private double discountRate = 0.1;
    
    public Coupon(DiscountedTicket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String getDiscountType() {
        return ticket.getDiscountType() + "10% 쿠폰 할인\n";
    }

    @Override
    public double cost() {
        return ticket.cost() * (1 - discountRate);
    }
}
