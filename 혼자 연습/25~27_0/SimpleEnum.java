enum Scale {
    DO, RE, MI, FA, SO, RA, TI
    
    // public static final Scale DO = new Scale();
    // public static final Scale RE = new Scale();
    // public static final Scale MI = new Scale();
    // public static final Scale FA = new Scale();
    // public static final Scale SO = new Scale();
    // public static final Scale RA = new Scale();
    // public static final Scale TI = new Scale();
}

public class SimpleEnum {
    public static void main(String[] args) {
        Scale sc = Scale.DO;
        System.out.println(sc);

        switch (sc) {
            case DO:
                System.out.println("도~ ");
                break;
            case RE:
                System.out.println("레~ ");
                break;
            case MI:
                System.out.println("미~ ");
                break;
            case FA:
                System.out.println("파~ ");
                break;
            default:
                System.out.println("솔~ 라~ 시~ ");
        }

        Scale sc1 = Scale.DO;
        // System.out.println(sc + sc1);

        System.out.print("here : ");
        System.out.println(Scale.DO.DO.DO);
    }
}
