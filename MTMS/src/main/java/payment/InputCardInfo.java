package payment;
import java.util.Scanner;

public class InputCardInfo implements InputInfoBehavior{
    Scanner sc = new Scanner(System.in);
    private String cardNumber;
    private String expiry;
    private String cvc;
    private String passwd;
    
    @Override
    public void inputInfo(){
        System.out.println("Input your card number (카드번호 / form : 0000-0000-0000-0000)"); // 계정 id입력
        cardNumber = sc.nextLine();
        System.out.println("Input card's expiry date (카드 유효기간 / form : MM/DD)"); // 계정 패스워드 입력
        expiry = sc.nextLine();
        System.out.println("Input card's cvc number (카드 CVC번호 / Three number)");
        cvc = sc.nextLine();
        System.out.println("Input the first two digits of the card password (카드 비밀번호 앞 2자리 / Two number)");
        passwd = sc.nextLine();
    }
    
}
