class AAA4 {
    public static void main(String[] args){
        String birth = "<양>" + 7 + '.' + 16;
        String birth2 = (new StringBuilder("<양>")).append(7).append('.').append(16).toString();
        System.out.println(birth);
        System.out.println(birth2);
    }    
}
