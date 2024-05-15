// date : 7-5-24


// # object
/*
# types of object creation: priviously we have seen the 5 types and now we will see the remaning once

    6) by using anonymous way
        - in java anonymous object also known as an unreferenced object
        - here unreferences object means the object that dosent reference to anyone 
        - unreferenced object can be used to accessed single elements of the class
        - Note: in java garbage collecter destroyes unreferenced object first

     
    7) by using singleton pattern
        - in java singleton pattern allow to create single object only
        - to prevent new object creation we can declare constructor as private
        - create static method which returns static object, and static object is common for all users
        -Note : singleton pattern can be used to share common resource to all like database connection etc.

    8) by using shallow copy
        - in java shallow copy means 2 object having same values and same values
        - in shallow copy if we make changes in one object, impact can be seen in other object too
        - shellow copy is faster 
        - in java shellow copy can be achive by using reference and singleton pattern

    9) by using deep copy
        - in java deap copy means 2 objects having same values and different memories
        - if we make changes in one object impact cannot be seen in other object 
        - deap copy is slower
        - in java deap copy can be achive by using clonning and copy constructor

    10) by using serialization
        - in java serialization is a concept where object converted into bytestream.
        - reverse operation of serialization considered as deserialization
        - to perform serelization we can implement class with seralizable interface



 */







// // program 1 : by using anonymous way example 1 
// public class Program2 {
//     public static void main(String[] args) {
//         DemoProgram1 d1 = new DemoProgram1();   // here we have given the reference of DemoProgram1() to the d1 
//         System.out.println(d1);     // here d1 is referenced to DemoProgram1()
//         System.out.println(new DemoProgram1());  // but if you see here we are not referencing the DemoProgram1() to anyone so it will be called as anonymous object
//     }




// // program 1 : by using anonymous way example 2 
// public class Program2 {
//     public static void main(String[] args) {
//         //by reference
//         DemoProgram1 d1 = new DemoProgram1();
//         d1.a = 10;
//         d1.b = 20;
//         d1.display();

//         // without reference means anonymous way
//         new DemoProgram1().a = 10;  //anonymous object
//         new DemoProgram1().b = 10;  //anonymous object
//         new DemoProgram1().display();   //anonymous object
//     }
// }
// // output:
// // a = 10, b = 20
// // a = 0, b = 0     //as you can see we did not get the values because unreference meance you are creating new object for each step and by java unreferenced object get destroyed first




// program 2 :  by using singleton pattern
public class Program2 {
    public static void main(String[] args) {

        DemoProgram2 d1 = DemoProgram2.getObject(); // here if you see closely we have not created the object by new DemoProgram2() insted we have used DemoProgram2.getObject()
        DemoProgram2 d2 = DemoProgram2.getObject();
        //by doing this we will get single information to all


        d1.a = 10;
        d1.b = 20;

        d1.display();
        d2.display();

        System.out.println(d1 == d2);
    }
}
// output:
// a = 10, b = 20
// a = 10, b = 20
// true