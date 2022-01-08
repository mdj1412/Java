public class Ex3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");

        sb.append(" is pencil."); 
        System.out.println(sb);

        sb.replace(7, 8, " my ");
        System.out.println(sb);

        sb.replace(8, 10, "your");
        System.out.println(sb);

        sb.delete(7, 12);
        System.out.println(sb);

        sb.delete(4, 15);
        System.out.println(sb);
    }
}
