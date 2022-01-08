public class ExB {
    public static void main(String[] args) { 
        
        Box box1 = new Box();
        PaperBox box2 = new PaperBox(); 
        GoldPaperBox box3 = new GoldPaperBox();

        System.out.println("box1");
        wrapBox(box1); 
        System.out.println("\nbox2");
        wrapBox(box2); 
        System.out.println("\nbox3");
        wrapBox(box3);

        System.out.println("\n다른 예제");
        System.out.println("box1");
        wrap(box1); 
        System.out.println("\nbox2");
        wrap(box2); 
        System.out.println("\nbox3");
        wrap(box3);
    }

    public static void wrapBox(Box box) { 
        if (box instanceof GoldPaperBox) { 
            ((GoldPaperBox)box).goldWrap();
        }
        if (box instanceof PaperBox) {
            ((PaperBox)box).paperWrap();
        }
        if (box instanceof Box) {
            box.simpleWrap();
        }
    }

    public static void wrap(Box box) { 
        if (box instanceof GoldPaperBox) { 
            ((GoldPaperBox)box).wrap();
        }
        if (box instanceof PaperBox) {
            ((PaperBox)box).wrap();
        }
        if (box instanceof Box) {
            box.wrap();
        }
    }
}

class Box {
    public void simpleWrap() {
        System.out.println("Simple Wrapping"); 
    }
    public void wrap() {
        System.out.println("Simple Wrapping"); 
    }
}

class PaperBox extends Box {
    public void paperWrap() {
        System.out.println("Paper Wrapping");
    }
    public void wrap() {
        System.out.println("Paper Wrapping");
    }
}

 class GoldPaperBox extends PaperBox { 
    public void goldWrap() {
        System.out.println("Gold Wrapping"); 
    }
    public void wrap() {
        System.out.println("Gold Wrapping"); 
    }
 }