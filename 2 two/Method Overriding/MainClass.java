class MainClass {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.m1();    //m1() method of Demo1

        Demo1 d2 = new Demo2();
        d2.m1();    //m1() method of Demo2
    }    
}
// output:
// this is inside the m1 inside demo1 class
// this is inside the m1 inside demo2 class










// to use parent class things as it is is inheritance but if you use them by change then it is overriding 
// it has 3 types

/*
    // 1) overriding with single inheritance 
    Demo1 m1()
        |
        |
        |
    Demo2 m1()

    // 2) overriding with hirarchy inheritance 

            Demo1 m1()
    
    Demo2 m1()      Demo3 m1()

    // 3) overriding with multiple inheritance 
 
    Demo1 m1()
        |
        |
        |
    Demo2 m1()
        |
        |
        |
    Demo3 m1()

*/