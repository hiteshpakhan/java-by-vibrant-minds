class MainClass {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.m1();                    //output: this is the m1 method inside the Demo1 class
        System.out.println(d1.a);   //output: 100
        
        Demo1 d2 = new Demo2();         //child object is referenced to parent is upcasting
        d2.m1();                    //output: this is the m1 method inside the Demo2 class
        System.out.println(d2.a);   //output: 100
        
        Demo2 d3 = new Demo3();
        d3.m1();                    //output: this is the m1 method inside the Demo3 class
        System.out.println(d3.a);   // #imp    //output: 1000      //here the answer is different because the veriable are taken from the class which is taking the reference and methods are taken from the class which object is created
        
        // Demo2 d4 = new Demo1();     
        // d4.m1();    //output: this will give an error   //because here we tryed to refer the child the object of parent class which downcasting is not possible
    }    
}

// go to the upcasting once again there is another example that you need to understand