class AAA {
    int num = 0;
    // static void addNum(int n){ num+=n; }
}

// XXX Cannot make a static reference to the non-static field num
// 특정 객체와 결합하지 않으므로, 정적 멤버 변수밖에 사용할 수 없습니다.