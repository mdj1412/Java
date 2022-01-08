class Ex05{
    public static void main(String[] args){
        for (int i=0;i<6;i++)
            System.out.println("f(" + i + ") = " + ReculFunc(i));
    }
    
    public static int ReculFunc(int n){
        if (n==0)
            return 1;
        return 2 * ReculFunc(n-1) + 1;
    }
}
