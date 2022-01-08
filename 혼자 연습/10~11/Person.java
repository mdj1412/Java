class Person {
    private int regiNum;
    private int passNum;
    
    Person(int rnum, int pnum){
        regiNum = rnum;
        passNum = pnum;
    }

    Person(int rnum){
        this(rnum, 0);      // rnum과 0을 인자로 받는 오버로딩 된 다른 생성자 호출
        // XXX this을 이용한 constructor 호출
        
        // regiNum = rnum;
        // passNum = 0;
    }

    void showPersonalInfo(){
        System.out.println(regiNum);
        System.out.println(passNum);
    }

    public static void main(String[] args){
        Person jung = new Person(335577, 112233);

        Person hong = new Person(775544);

        jung.showPersonalInfo();
        hong.showPersonalInfo();
    }
}
