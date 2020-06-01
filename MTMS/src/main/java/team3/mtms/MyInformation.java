package team3.mtms;

public class MyInformation {
    private static MyInformation myInfo = new MyInformation();
    private String id;
    private String name;
    private String customerGrade;
    private String phoneNum;
    private int age;
    
    private MyInformation() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public int getAge() {
        return age;
    }

    public void setMyInformation(String id, String name, String customerGrade, String phoneNum, int age) {
        this.id = id;
        this.name = name;
        this.customerGrade = customerGrade;
        this.phoneNum = phoneNum;
        this.age = age;
    }
    
    public static MyInformation getInsetance(){
        return myInfo;
    }
}
