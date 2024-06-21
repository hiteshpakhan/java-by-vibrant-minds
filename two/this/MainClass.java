class MainClass {
    public static void main(String[] args) {
        Demo3 d1 = new Demo3();
        d1.m1();
        System.out.println("d1 = "+d1);
    }
}


//output:
// parameterized constructor of Demo3
// default constructor of Demo3
// a = 10, b = 20                   // here if you take simple values it will give you nearest values
// this.a = 1000, this.b = 2000     //here if you use this then it will take the value from the class
// this = Demo3@2f177a4b            //here as you can see the class is the same
// d1 = Demo3@2f177a4b              //here as you can see the class is the same