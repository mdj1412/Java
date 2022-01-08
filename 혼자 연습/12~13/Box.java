public class Box {
    private String conts;
    Box(String cont) { this.conts = cont; }
    public String toString() {
        return conts;
    }
}

class ToString {
    public static void main(String[] args){
        StringBuilder stb = new StringBuilder("12");
        stb.append(34);
        System.out.println(stb.toString());
        System.out.println(stb);

        Box box = new Box("Camera");
        System.out.println(box.toString());
        System.out.println(box);
    }
}
// XXX 인스턴스의 참조 값이 전달되면 참조하는 인스턴스의 toString method가 반환
// XXX 즉, 참조 변수 == 참조 변수.toString()