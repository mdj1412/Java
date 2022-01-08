

public class E03 {
    public static void main(String[] args){
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);
        r.show();
        System.out.println("s의 면적은 " + s.square());
        if (t.contains(r))
            System.out.println("t는 r을 포함합니다.");
        if (t.contains(s))
            System.out.println("t는 s을 포함합니다.");
    }
}

class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        width = w;
        height = h;
    }
    public int square(){
        return width*height;
    }
    public void show(){
        System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "X" + height + "인 사각형");
    }
    public boolean contains(Rectangle r){
        if ((x>=r.x)||(y>=r.y))
            return false;
        if ((x+width<=r.x+r.width)||(y+height<=r.y+r.height))
            return false;
        return true;
    }
}