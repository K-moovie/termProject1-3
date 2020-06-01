package payment;
import java.util.Scanner;

public class InputPasswdInfo implements InputInfoBehavior{
    Scanner sc = new Scanner(System.in);
    private String passwd;
    
    @Override
    public void inputInfo(){
        System.out.println("Input payment password(결제 비밀번호)");
        passwd = sc.nextLine();
    }
}
