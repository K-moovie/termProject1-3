package payment;
import java.util.Scanner;

public class SelectMobileCorp implements SelectBehavior{
    Scanner sc = new Scanner(System.in);
    private int selectNum;
    private String corp;
    private String [] corpList = {"SKT", "KT", "LG U+"};
    
    @Override
    public void select(){
        int i = 1; 
        
        System.out.println("Select a card company");
        for(String corp : corpList){
            System.out.println(i + "." + corp);
            i++;
        }
        selectNum = sc.nextInt();
        corp = corpList[selectNum-1];
    }
}
