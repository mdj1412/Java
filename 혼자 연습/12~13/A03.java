public class A03 {
    public static void main(String[] args){
        String[] sr = new String[7];
        sr[0] = new String("Java");//4
        sr[1] = new String("System");//6
        sr[2] = new String("Compiler");//8
        sr[3] = new String("Park");//4
        sr[4] = new String("Tree");//4
        sr[5] = new String("Dinner");//6
        sr[6] = new String("Brunch Cafe");//11

        int cnum = 0;
        for (int i=0;i<sr.length;i++)
            cnum += sr[i].length();
        System.out.println("총 문자의 수: " + cnum);
    }
}
