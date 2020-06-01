package payment;
import java.util.Scanner;

public class InputPersonalInfo implements InputInfoBehavior{
    Scanner sc = new Scanner(System.in);
    private String name;
    private String phone;
    private String regident;
    
    @Override
    public void inputInfo(){
        System.out.println("Input your name (이름)");
        name = sc.nextLine();        
        System.out.println("Input phone number (전화번호)");
        phone = sc.nextLine();
        System.out.println("Input 6 digits before of your resident registration number (주민등록번호 앞 6자리)");
        regident = sc.nextLine();
    }
}
