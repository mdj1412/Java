class A{
    public static void main(String[] args){

        Typetester test = new Typetester();

        System.out.println("< Case 01 >");
        long n1=10, n2=20;
        int result=(int)(n1+n2);                                        // long 끼리 더할 때는 int형으로 자동형 변환 안됨 (ppt오타 추측)
        System.out.println(result);

        System.out.println("\n< Case 02 >");
        long num1=3000000000L, num2=323;                                // 정수 나오면 int 그러므로 뒤에 l이나 L붙여야됨
        long k=num1+num2;
        System.out.println(k);

        System.out.println("\n< Case 03 >");
        int o1=100, o2=3;
        double o3, o4;
        o3=(double)o1/o2;
        o4=o1/o2;
        System.out.println(o3+"\n"+o4);

        System.out.println("\n< Case 04 >");
        int a=(int)3000000000L, b=323;                                  // L과 (long) 의 차이점 --> literal (long), explicit conversion(int)
        long v=a+b;
        System.out.println(v);
        
        System.out.println("\n< Case 05 >");
        System.out.println(3147483647L+3147483647L);                    // L과 (long) 의 차이점
        // System.out.println((long)3147483647+(long)3147483647);

        System.out.println("\n< Case 06 >");
        float q1=3.1f, q2=4.2f;
        float q3=q1+q2;
        double q4=q1+q2;                                                // implicit conversion
        System.out.println(q3);
        System.out.println(q4);

        System.out.println("\n< Case 07 >");
        float c1=3.0004999f+2.0004999f;                                // 연산을 할 경우 int 밑으로는 int로 계산 그 이후는 자료형의 큰 방향으로 implicit conversion
        // float c2=(3.0004999+2.0004999);
        System.out.println(c1);
        System.out.println(3.0004999f+2.0004999f);
        float e=(float)(3.0004999+2.0004999);                           // explicit conversion
        System.out.println(3.0004999+2.0004999);                        // double type
        System.out.println(e);
        System.out.println(3.0004999121323123121233f+2.000491231231231231299f);     // float type libteral

        System.out.println("\n< Case 08 >");
        short k1=5;                                                     // int type literal ???
        System.out.println(k1);
        short k2=5+4;
        System.out.println(k2);
        short k3;                                                       // int를 short type variable에 저장 ???
        k3=(int)(5+4);                                                  // literal을 대입 vs variable 대입 ???
        // k3=(long)(5+4);
        // k3=3L;
        k3+=3L;
        System.out.println(k3);

        System.out.println("\n< Case 09 >");
        short k4 = 32767;
        k4 += (int)1;                                                   // short 범위에 벗어남 but...
        System.out.println(k4);
        short k5;
        // k5=k4+(int)1;
        short k6;
        // short k6 = (32767+1);
        short k7=0;
        k7+=32768;                                                      // 복합 대입 연산자는 type conversion을 해줌(explicit, implicit)
        System.out.println(k7);
        // short k8 = 32768;


        System.out.println("\n< Case 10 >");
        char o=50_000;                                                  // implicit conversion ====> char->int (유니코드)
        char o6=54_621;
        char o7=5;
        char o8='a';
        System.out.println(o);
        System.out.println(o6);
        System.out.println(o7);
        System.out.println((int)o8);
        


        System.out.println("\n< Case 11 >");
        char u1='한', u2='글';                                           // 아스키 코드 --> 유니코드
        int u3=5;
        int u4=u1+u2+u3;
        System.out.println(u1+u2+u3);
        System.out.println((int)u1);
        System.out.println((int)u2);
        System.out.println((int)u3);
        System.out.println(u4);


        System.out.println("\n< Case 12 >");
        float m=4_000_000_000_000L;                                     // implicit conversion ====> long->float
        System.out.println(m);
        // int mm=1L;


        System.out.println("\n< Case 13 >");
        // float n=3.1415;                                              // ???
        float l0=3;
        System.out.println(l0);
        short l1=1, l2=2;
        short res=(short)(l1+l2);                                       // 변수에서의 대입
        short l3=45;                                                    // literal에서의 대입       ???
        long l4=45;                                                     // literal에서의 대입

        System.out.println("\n< Case 14 >");
        int a0=5;
        short a1=5;                                                     // ???
        float a2=10;
        short a3=a1++;                                                  // 증가 감소 연산자는 복합 대입 연산자로 생각하자
        float a4=a2++;
        // short a5=a0++;
        short a6=32767;
        short a7=++a6;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a7);

        System.out.println("\n< Case 15 >");
        System.out.println("1\t0");
        System.out.println("12\t0");
        System.out.println("123\t0");
        System.out.println("1234\t0");
        System.out.println("12345\t0");
        System.out.println("123456\t0");
        System.out.println("1234567\t0");
        System.out.println("12345678\t0");


        System.out.println("\n< Case 16 >");
        int p3=100, p4=3;                                               // 연산 순서
        double p1=(double)p3/p4;
        double p2=(double)(p3/p4);
        System.out.println("100/3 = " + p1);
        System.out.println("100/3 = " + p2);


        System.out.println("\n< Case 17 >");
        String str=" a bc";
        System.out.println(str);
        System.out.println(str.isEmpty());
        System.out.println(str.trim());
        System.out.println(str.length());
        System.out.println(str.getBytes());
        System.out.println(" abc".isBlank());                           // 빈 문자열이거나 공백만으로 이루어진 문자열의 경우 true
        System.out.println(str.getBytes().length);

        System.out.println("\n< Case 18 >");
        String str1="abc", str2="한글ab";
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str1.getBytes().length);
        System.out.println(str2.getBytes().length);



        System.out.println("\n< Case 19 >");
        String str3=null, str4="";
        System.out.println(str3==str4);


        System.out.println("\n< Case 20 >");
        char ab1='한';
        String ab2="한";
        short ab3=7;
        int ab4=7;
        char ab5='7';
        System.out.println(ab1+ab2);
        System.out.println(ab3+ab5);
        System.out.println(ab4+ab5);
        test.printType(ab3+ab5);
        test.printType(ab4+ab5);


        System.out.println("\n< Case 21 >");
        char d1='a';
        test.printType(d1);
        d1++;                                       // d1+=1 (assignment operator) ? d1=d1+1 ?
        test.printType(d1);

        int d2=1;
        // System.out.println(!d2);
        
    }
}


// 1	:
// 12	:
// 1234	:
// 123124	:

/* literal 결론
    long -> 범위가 벗어날 때 L or l을 붙이다
    float -> 항상 꼭 붙인다
    double -> 붙여도 되고 안붙여도 된다


    복합 대입 연산
    implicit conversion
    explicit conversion
*/