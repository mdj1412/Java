class Ex01{
    public static void main(String[] args){
        int count_8 = 0, count_9 = 0;
        
        for (int i=1;i<101;i++){
            boolean n1=(i%8==0)?true:false;
            boolean n2=(i%9==0)?true:false;
            if (n1&&n2)
                break;
            if (n1)
                count_8++;
            else if (n2)
                count_9++;
        }
        System.out.println("8의 배수 :" + count_8 + "개");
        System.out.println("9의 배수 :" + count_9 + "개");
    }
}

/*


for (int i=1;i<101;i++){
    boolean n1=(i%8==0)?true:false;
    boolean n2=(i%9==0)?true:false;
    if (n1&&n2)
        break;
    if (n1)
        count_8++;
    else if (n2)
        count_9++;
}


for (int i=1;i<101;i++){
    if (i%72==0)
        break;
    if (i%8==0)
        count_8++;
    else if (i%9==0)
        count_9++;
}


*/