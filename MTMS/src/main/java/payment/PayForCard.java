package payment;

public class PayForCard extends Payment{
    public PayForCard(float cost){
        this.cost = (float)cost;
        selectBehavior = new SelectCardCorp();
        inputInfoBehavior = new InputCardInfo();
    }
}
