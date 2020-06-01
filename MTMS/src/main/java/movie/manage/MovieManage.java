package movie.manage;

import java.util.Scanner;
import java.util.HashSet;

public class MovieManage {
    Scanner sc = new Scanner(System.in);
    private final HashSet<Movie> movieList = new HashSet<>();
    
    public void menu(){  // 관리자 메뉴
        int select;
        
        System.out.println("원하시는 기능을 선택해주세요\n"
                + "1. 영화 등록  "
                + "2. 영화 조회 (조회 후 수정 및 삭제 가능합니다)\n"
                + "3. 영화 개봉  "
                + "4. 로그아웃");    
        select = sc.nextInt();
        
        switch (select) {
            case 1 : // 영화 등록
                Movie addMovie = new Movie();
                EnrollMovie enroll = new EnrollMovie();
                addMovie = enroll.enrollMovie();
                movieList.add(addMovie); //movieList에 추가
                break;
            case 2 :
                SearchMovie search = new SearchMovie();
                break;
            case 3 :
                break;
            case 4 : 
                System.out.println("로그아웃중...");
                break;
        }  
    }    
}
