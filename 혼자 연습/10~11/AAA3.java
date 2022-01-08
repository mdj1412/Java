class AAA3 {
    void simple(int p1,int p2){
        System.out.println(p1+p2);
    }
    void simple(int p1,double p2){
        System.out.println(p1+p2);
    }




    public static void main(String[] args){
        AAA3 inst = new AAA3();
        inst.simple(7, 'k');            // XXX 오버로딩 관련 피해야할 애매한 상황
    }
}
