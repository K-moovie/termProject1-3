package movie.customer;

public class PromotionDisplay implements Observer {

    private PromotionList promotionList;
    public PromotionDisplay(PromotionList promotionList) {
        this.promotionList = promotionList;
        promotionList.registerObserver(this);
        
    }
    public void update(String content) {
        System.out.println("프로모션 알림 입니다.\n내용: " + content);
    }
}
