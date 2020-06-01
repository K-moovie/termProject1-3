package payment;

public class PayForPayco extends Payment{
    public PayForPayco(float cost){
        this.cost = (float)cost;
        selectBehavior = new SelectNothing();
        inputInfoBehavior = new InputLoginInfo();
    }
    
    @Override
    public void display(){
        super.display();
        InputPasswdInfo passwd = new InputPasswdInfo();
        setInputInfoBehavior(passwd);
        performInputInfo();
    }
}
