class Ex03{
    public static void main(String[] args){
        char a = 'e';
        for (char i=a;i>='a';i--){
            for (char j='a';j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
