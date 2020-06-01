package movie.discount;

public class HandWritten extends DiscountDecorator {

    private double rate;
    public HandWritten(DiscountedTicket ticket, double rate) {
        this.ticket = ticket;
    }

    @Override
    public String getDiscountType() {
        return ticket.getDiscountType() + rate*100 +"% 특별 할인";
    }

    @Override
    public double cost() {
        return ticket.cost() * (1 - rate);
    }
}
