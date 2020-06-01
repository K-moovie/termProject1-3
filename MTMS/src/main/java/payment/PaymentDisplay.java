package payment;
import java.util.Scanner;

public class PaymentDisplay {
    Scanner sc = new Scanner(System.in);
    Payment payment;
    public void paymentDisplay(){
        int selectNum;
        
        System.out.println("Select payment method"
                + "\n1. Credit card"
                + "\n2. Mobile payment"
                + "\n3. Kakao pay"
                + "\n4. Payco");
        selectNum = sc.nextInt();
        switch (selectNum) {
            case 1 :
                payment = new PayForCard(10000);
                break;
            case 2 :
                payment = new PayForPhone(10000);
                break;
            case 3:
                payment = new PayForKakao(10000);
                break;
            case 4:
                payment = new PayForPayco(10000);
                break;
        }        
        payment.display();
        try{
        System.out.println("Loading...");
        Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("The payment is complete. Enjoy the movie.");
    }
}
