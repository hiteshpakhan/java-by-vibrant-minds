class Demo3 {
    int a = 1000, b = 2000;

    Demo3(){
        // this();  //error   //here as you can see if you call only this() as itis means you are calling the default constructor of the class and you are already inside means its going to be a loop so now we will pass parameters into this() so the Parameterised constructor that we have created after default will get called
        this(10, 20);   //#imp:- so it will give us output:-   parameterized constructor of Demo3
        System.out.println("default constructor of Demo3"); //output:- default constructor of Demo3
    }

    Demo3(int a, int b){
        System.out.println("parameterized constructor of Demo3");
    }

    void m1(){
        int a = 10, b = 20;
        System.out.println("a = "+a+", b = "+b);                        //output: a = 10, b = 20
        
        System.out.println("this.a = "+this.a+", this.b = "+this.b);    // this.a = 1000, this.b = 2000
        
        System.out.println("this = "+this);
    }
}
