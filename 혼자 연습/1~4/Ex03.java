class Ex03{
    public static void main(String[] args){
        int n1=100, n2=3;
        double result;

        result=(double)n1/n2;                                                         // explicit conversion
        System.out.println("100/3 = " + result);
        System.out.println("100/3 : 몫 " + (int)result + ", 나머지 " + (n1%n2));        // explicit conversion
    }
}
