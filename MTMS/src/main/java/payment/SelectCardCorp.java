package payment;
import java.util.Scanner;

public class SelectCardCorp implements SelectBehavior{
    Scanner sc = new Scanner(System.in);
    private String card;
    private int selectNum;
    private String [] cardList = {"삼성카드","국민카드","신한카드","하나카드","비씨카드","롯데카드"};
    
    @Override
    public void select(){
        int i = 1;
        
        System.out.println("Select a card company");
        for(String card : cardList){
            System.out.println(i + "." + card);
            i++;
        }
        selectNum = sc.nextInt();
        card = cardList[selectNum-1];
    }
}
