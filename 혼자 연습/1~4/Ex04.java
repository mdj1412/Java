class Ex04{
    public static void main(String[] args){
        int money = 65367;

        System.out.println("오만원\t:"+(money/50_000));
        money%=50_000;
        System.out.println("만원\t:"+(money/10_000));
        money%=10_000;
        System.out.println("오천원\t:"+(money/5_000));
        money%=5_000;
        System.out.println("천원\t:"+(money/1_000));
        money%=1_000;
        System.out.println("오백원\t:"+(money/500));
        money%=500;
        System.out.println("백원\t:"+(money/100));
        money%=100;
        System.out.println("오십원\t:"+(money/50));
        money%=50;
        System.out.println("십원\t:"+(money/10));
        money%=10;
        System.out.println("일원\t:"+money);
    }
}
