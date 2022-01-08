import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        MonthSchedule ms = new MonthSchedule(30); 
        System.out.println("*** 이번달 스케쥴 관리 프로그램 ***"); 
        while (true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>"); 
            int menu = scanner.nextInt();
            switch (menu) {
            case 1: ms.input(); break;
            case 2: ms.view(); break;
            case 3: ms.finish(); return;
            default: System.out.println("잘못입력하였습니다."); 
            }
            System.out.println();
        } 
    }
}

class MonthSchedule {
    private Day[] arr;
    private int day;
    private Scanner sc = new Scanner(System.in);

    public MonthSchedule(int day) {
        this.day = day;
        arr = new Day[day];
        for (int i=0;i<day;i++) { arr[i] = new Day(); }
    }
    public void input() {
        System.out.print("날짜(1~" + day + ")?");
        int n = sc.nextInt();
        if (n>day || n<1) { System.out.println("잘못 입력하셨습니다."); return; }
        if (arr[n-1].get() != null) { System.out.print("할 일이 이미 있습니다."); return; }
        System.out.print("할일(빈칸없이입력)?");
        String word = sc.next();
        arr[n-1].set(word);
    }
    public void view() {
        System.out.print("날짜(1~" + day + ")?");
        int n = sc.nextInt();
        if ((n<1)||(n>day)) { System.out.println("날짜 잘못 입력하였습니다.!"); }
        else {
            System.out.print(n + "일의 할 일은 ");
            arr[--n].show();
        }
    }
    public void finish() { System.out.println("프로그램을 종료합니다."); }

}

class Day {
    private String work; // 하루의 할 일을 나타내는 문자열 
    public void set(String work) { this.work = work; } 
    public String get() { return work; }
    public void show() {
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다."); 
    }
}