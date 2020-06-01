package movie.manage;

public class Movie {
    private String id; // 아이디
    private String title; // 제목
    private String category; // 장르
    private String summary; // 설명
    private String director; // 감독
    private String rating; // 관람가
    
    public boolean equals(Object movie){
       Movie m = (Movie) movie;
       return getTitle().equals(m.getTitle());
    }
    
    public int hashCode(){
        return title.hashCode();
    }
    
    public Movie(){
        
    }

    public Movie(String id, String title, String category, String summary, String director, String rating){
        this.id = id;
        this.title = title;
        this.category = category;
        this.summary = summary;
        this.director = director;
        this.rating = rating;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getSummary() {
        return summary;
    }

    public String getDirector() {
        return director;
    }

    public String getRating() {
        return rating;
    }
    
    
}
