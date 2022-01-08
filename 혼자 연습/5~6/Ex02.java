class Ex02{
    public static void main(String[] args){
        for (int i=2;i<10;i++){
            for (int j=1;j<=i;j++)
                System.out.print(i + "X" + j + "=" + (i*j) + '\t');
            System.out.println();
        }
    }
}
