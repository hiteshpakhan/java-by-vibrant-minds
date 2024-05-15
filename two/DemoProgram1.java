// //program1
// public class DemoProgram1 {
//     void example(){
//         System.out.println("hi there this is method");
//     }

//     DemoProgram1(){
//         System.out.println("constructor called");
//     }

//     {
//         System.out.println("instance block called");
//     }
// }



// //program2
// public class DemoProgram1 {
//     void example(){
//         System.out.println("hi there this is method");
//     }

//     DemoProgram1(){
//         System.out.println("constructor called");
//     }

//     {
//         System.out.println("instance block called");
//     }

//     {
//         System.out.println("second instance block called"); 
//     }
// }






// //program3
// public class DemoProgram1 {
//     void example(){
//         System.out.println("hi there this is method");
//     }

//     DemoProgram1(){
//         System.out.println("constructor called");
//     }

//     {
//         System.out.println("instance block called");
//     }

//     {
//         System.out.println("second instance block called"); 
//     }

//     static{
//         System.out.println("static block called");
//     }
// }










// //program4
// public class DemoProgram1 {
//     void example(){
//         System.out.println("hi there this is method");
//     }
// }





// //program5
// public class DemoProgram1 {
//     void example(){
//         System.out.println("hi there this is method");
//     }
// }


// //program6 : by using new keyword object creation example
// public class DemoProgram1 {
//     void example(){
//         System.out.println("hi there this is method");
//     }
// }





// //program7: by using reference : object creation
// public class DemoProgram1 {
//     int a,b;
//     void display(){
//         System.out.println("a = "+a+", b = "+b);
//     }
// }





// //program8: by using method
// public class DemoProgram1 {
//     int a,b;
//     void display(){
//         System.out.println("a = "+a+", b = "+b);
//     }
// }





// //program9: by using copy constructor
// public class DemoProgram1 {
//     int a,b;
    
//     void display(){
//         System.out.println("a = "+a+", b = "+b);
//     }

//     DemoProgram1(DemoProgram1 d1){  //this is copy constructor
//         a = d1.a;
//         b = d1.b;
//     }

//     DemoProgram1(){ // default constructor      // it is suggest that we shoud always create default constructor with the creation of copy constructor because most users create first object by using default constructor that can be passed into the copy constructor
//         System.out.println(" ");
//     }
// }





//program10: by using clonning process
class DemoProgram1 implements Cloneable {
    int a,b;
    
    void display(){
        System.out.println("a = "+a+", b = "+b);
    }

    public boolean equals(DemoProgram1 d1)
    {  
        if(d1.a == a)
            if(d1.b == b)
                return true;
            return false;
    }

    public DemoProgram1 clone(){ 
        DemoProgram1 d1 = null;
        try {
            d1 = (DemoProgram1)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        return d1;
    }
}
