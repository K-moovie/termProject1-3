package movie.manage;

import team3.mtms.DatabaseConnector;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnrollMovie {
    
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private String query;
    ResultSet rs = null;
    
    
    
    public Movie enrollMovie() throws IOException{
        
        String tmpId;
        String tmpTitle;
        String tmpCategory;
        String tmpSummary;
        String tmpDirector;
        String tmpRating;
        int select;
        String jenr1="코미디,액션,스릴러,SF,판타지,로맨스";
        String [] jenr2= jenr1.split(",");
        String rating1 ="A,B,C,D";
        String [] rating2 =rating1.split(",");
        
        tmpId = "105";
        
        System.out.println("영화를 등록합니다.");
        System.out.println("영화 제목을 입력해주세요");
        tmpTitle = br.readLine();
        System.out.println(tmpTitle);
        System.out.println("영화 장르를 선택해주세요\n"  // 사용자 입력시 오타가나면 곤란하기 때문에 숫자로 선택
                + "1. 코미디  2. 액션  3. 스릴러  4. SF  5. 판타지  6. 로맨스");
        select = sc.nextInt();
        tmpCategory = jenr2[select-1];
        System.out.println("영화 설명을 입력해주세요");
        sc.nextLine();
        tmpSummary = sc.nextLine();
        System.out.println("영화 감독을 입력해주세요");
        tmpDirector = sc.nextLine();
        System.out.println("영화 시청 연령을 선택해주세요"
                + "1. 전체관람가   2.12세   3.15세   4.19세");
        select = sc.nextInt();
        tmpRating = rating2[select-1];
        
        Movie tmpMovie = new Movie(tmpId,tmpTitle,tmpCategory,tmpSummary,tmpDirector,tmpRating);
        query = "INSERT INTO movie VALUES ('" + tmpId + "','" + tmpTitle + "','" + tmpRating + "','"
                + tmpCategory + "','" + tmpSummary + "','" + tmpDirector + "')";
        try{
            DatabaseConnector.getInstance().getStatement().executeUpdate(query);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return tmpMovie;
    }
}
