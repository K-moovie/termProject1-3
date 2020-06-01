package movie.discount;

public abstract class DiscountDecorator extends DiscountedTicket {

    protected DiscountedTicket ticket;
    
    @Override
    public abstract String getDiscountType();
}