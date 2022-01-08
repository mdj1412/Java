public class Ex03{
    public static void main(String[] args){
        Rectangle r = new Rectangle(2, 2, 8, 7);                // 참조변수 r 선언 후 인스턴스 생성
        Rectangle s = new Rectangle(5, 5, 6, 6);                // 참조변수 s 선언 후 인스턴스 생성
        Rectangle t = new Rectangle(1, 1, 10, 10);              // 참조변수 t 선언 후 인스턴스 생성
        r.show();
        System.out.println("s의 면적은 " + s.square());
        if (t.contains(r))
            System.out.println("t는 r을 포함합니다.");
        if (t.contains(s))
            System.out.println("t는 s를 포함합니다.");
    }
}

class Rectangle{
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int a, int b, int w, int h){
        x = a;
        y = b;
        width = w;
        height = h;
    }
    public int square(){ return width * height; }
    public void show(){
        System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }
    public boolean contains(Rectangle r){
        int x1 = x - r.x;
        int y1 = y - r.y;
        int x2 = (x + width) - (r.x + r.width);
        int y2 = (y + height) - (r.y + r.height);
        return (x1<0) && (y1<0) && (x2>0) && (y2>0);
    }
}
