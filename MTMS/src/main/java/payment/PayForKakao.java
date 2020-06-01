package payment;

public class PayForKakao extends Payment{
    public PayForKakao(float cost){
        this.cost = (float)cost;
        selectBehavior = new SelectNothing();
        inputInfoBehavior = new InputLoginInfo();
    }
}
