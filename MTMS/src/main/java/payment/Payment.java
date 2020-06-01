package payment;

public abstract class Payment {
    protected SelectBehavior selectBehavior;
    protected InputInfoBehavior inputInfoBehavior;
    protected float cost = 0.0f;
    
    public void performSelect(){
        selectBehavior.select();
    }
    
    public void performInputInfo(){
        inputInfoBehavior.inputInfo();
    }
    
    public void setSelectBehavior(SelectBehavior select){
        this.selectBehavior = select;
    }
    
    public void setInputInfoBehavior(InputInfoBehavior input){
        this.inputInfoBehavior = input;
    }    
    
    public void display(){
        System.out.println("Amount to be paid(최종 결제 금액) :" + cost);
        performSelect();
        performInputInfo();
    }
}
