package movie.customer;

import java.sql.SQLException;
import java.util.Scanner;
import movie.discount.*;
import team3.mtms.MyInformation;

public class CustomerMenu {

    private Scanner sc = new Scanner(System.in);
    private PromotionList pt;
    private PromotionDisplay pd;

    public CustomerMenu() throws SQLException {
        pt = new PromotionList();
        pt.setPromotionCount();
        pd = new PromotionDisplay(pt);
    }

    public void menu() throws SQLException {  // 관리자 메뉴
        int select;
        boolean flag = false;

        while (true) {
            pt.getPromotionCount();
            System.out.println("원하시는 기능을 선택해주세요\n"
                    + "1. 나의 알림 비활성화 "
                    + "2. 영화 예매\n"
                    + "3. 나의 정보 확인"
                    + "4. 로그아웃");
            select = sc.nextInt();
            switch (select) {
                case 1: // 나의 알림 비활성화
                    System.out.println("취소하고 싶은 알림을 선택하세요");
                    pt.removeObserver(pd);
                    break;
                case 2:
                    Discount d = new Discount();
                    d.discount();
                    break;
                case 3:

                    break;
                case 4:
                    flag = true;
                    System.out.println("로그아웃중...");
                    break;
            }
            if (flag) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
