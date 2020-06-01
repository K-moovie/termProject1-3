package movie.discount;

import java.util.Scanner;
import team3.mtms.MyInformation;

public class Discount {
    private DiscountedTicket dt;
    private double cost;
    private boolean flag = false;
    private Scanner sc = new Scanner(System.in);
    
    public void discount() {
        if (MyInformation.getInsetance().getAge() <= 7) {
            dt = new Child();
        } 
        else if (MyInformation.getInsetance().getAge() <= 19) {
            dt = new Student();
        }
        else if(MyInformation.getInsetance().getAge() >19){
            dt = new Adult();
        }
        int select;
        while(true) {
            System.out.println("할인 방법을 선택하세요. 중복 할인 가능합니다.");
            System.out.println("1. 쿠폰 할인 2. 멤버쉽 할인 3. 없음 4.할인 수단 선택 완료");
            select = sc.nextInt();
            switch(select) {
                case 1: //
                    dt = new Coupon(dt);
                    break;
                case 2:
                    dt = new Membership(dt);
                    break;
                case 3:
                case 4:
                    flag = true;
                    break;
                default:
                    break;
            }
            if(flag) {
                System.out.println(dt.getDiscountType());
                System.out.println("결제 총액: " + dt.cost());
                cost = dt.cost();
                break;
            }
        }
    }
}
