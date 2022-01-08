import java.util.Scanner;

public class Ex93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        MonthSchedule1 ms = new MonthSchedule1(30); 
        System.out.println("이번달 스케쥴 관리 프로그램."); 
        while (true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>"); 
            int menu = scanner.nextInt();
            switch (menu) {
            case 1: ms.input(); break;
            case 2: ms.view(); break;
            case 3: ms.finish(); scanner.close(); return;
            default: System.out.println("잘못입력하였습니다."); }
            System.out.println();
        }
    }
}

class MonthSchedule1 {
    private Day1[] month;
    private int Day;
    private Scanner sc = new Scanner(System.in);

    public MonthSchedule1(int Day) {
        this.Day = Day;
        month = new Day1[Day];
        for (int i=0;i<Day;i++) { month[i] = new Day1();}
    }
    public void input() {
        System.out.print("날짜(1~" + Day + ")?");
        int num = sc.nextInt();
        if (--num<0||num>Day) { System.out.println("날짜를 잘못 입력하였습니다."); return; }
        if (month[num].get() != null) { System.out.println("할 일이 이미 있습니다."); }
        else {
            System.out.print("할일(빈칸없이입력)?");
            sc.nextLine();
            String work = sc.nextLine();
            month[num].set(work);
        }
    }
    public void view() {
        System.out.print("날짜(1~" + Day + ")?");
        int num = sc.nextInt();
        if (--num<0||num>Day) { System.out.println("날짜를 잘못 입력하였습니다."); return; }
        month[num].show();
    }
    public void finish() { System.out.println("프로그램을 종료합니다."); }
}

class Day1 {
    private String work; // 하루의 할 일을 나타내는 문자열 
    public void set(String work) { this.work = work; } 
    public String get() { return work; }
    public void show() {
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다."); 
    }
}
