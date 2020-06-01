package payment;

public class PayForPhone extends Payment{
    public PayForPhone(float cost){
        this.cost = (float)cost;
        selectBehavior = new SelectMobileCorp();
        inputInfoBehavior = new InputPersonalInfo();
    }
}
