package movie.discount;

import team3.mtms.MyInformation;

public class Membership extends DiscountDecorator {

    private double discountRate;
    private String customerGrade = MyInformation.getInsetance().getCustomerGrade();
    
    public Membership(DiscountedTicket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String getDiscountType() {
        return ticket.getDiscountType() + customerGrade +"등급 멤버쉽 할인\n";
    }

    @Override
    public double cost() {
        if(customerGrade.equals("S")) {
            discountRate = 0.8;
        }
        else if(customerGrade.equals("A")) {
            discountRate = 0.85;
        }
        else if(customerGrade.equals("B")) {
            discountRate = 0.9;
        }
        else if(customerGrade.equals("C")) {
            discountRate = 0.95;
        }
        else {
            discountRate = 1;
        }
        return ticket.cost() * discountRate;
    }
}
