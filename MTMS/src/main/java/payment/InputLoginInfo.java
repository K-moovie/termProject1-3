package payment;
import java.util.Scanner;

public class InputLoginInfo implements InputInfoBehavior{
    Scanner sc = new Scanner(System.in);
    private String id;
    private String passwd;
    
    @Override
    public void inputInfo(){
        System.out.println("Input your account id(계정 ID)"); // 계정 id입력
        id = sc.nextLine();
        System.out.println("Input your account password(계정 비밀먼호)"); // 계정 패스워드 입력
        passwd = sc.nextLine();
    }
}
