class ImmutableInstance {
    public static void main(String[] args){
        String str1 = "Simple String";
        String str2 = str1;

        String str3 = new String("Simple String");

        // ??? str2와 str3는 어떤 차이점일까?
    }    
}
