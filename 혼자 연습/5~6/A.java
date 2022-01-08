class A{
    public static void main(String[] args){
        boolean ste=true;
        int num1=11;
        System.out.println("case1 : " + num1);
        if (ste){
            // int num1=22;                                         // java에서는 안됨 c는 가능
            num1++;
            System.out.println("case2 : " + num1);
        }
        System.out.println("case3 : " + num1);

        // for (int num1=0;num1<10;num1++)                             // 위에 상황과 같은 경우
        //         System.out.println(num1);
        
        
        {
            int num2=33;
            num2++;
            System.out.println(num2);
        }
        // System.out.println(num2);
        a();
    }
    public static void a(){
        int num1=13;
        System.out.println("different method function : " + num1);
    }
}

// 정리하면 c 애서는 함수가 종료할 때까지 전체 메모리가 남아있다.
// 중괄호가 만들어지면 메인 함수 메모리 영역에 새로운 메모리 영역이 생기는데 
// 변수를 찾을 때 안과 밖을 자유롭게 다닐 수 있지만 
// (변수를 불러올 때) 현재 있는 중괄호에서 변수를 먼저 찾음

// java 에서는 메인 메모리의 영역과 중괄호의 메모리 영역이 구별되지 않지만
// 중괄호 영역이 종료되면 중괄호에서 생성된 변수들은 삭제된다.