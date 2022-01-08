public class Ex01{
    public static void main(String[] args){
        TV myTV = new TV("LG", 2017, 32);           // 참조변수 myTV 선언 후 인스턴스 생성
        myTV.show();                                // LG에서 만든 2017년 32인치 TV
    }
}

class TV{
    private String company;
    private int year;
    private int inch;

    public TV(String x, int y, int z){
        company = x;
        year = y;
        inch = z;
    }

    public void show(){
        System.out.println(company + "에서 만든 " + year + "년형 " + inch + "인치 TV");
    }
}