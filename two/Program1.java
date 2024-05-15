//date: 3-5-24 & Date: 6-5-24

// initializers
/*
    - in java initializers can be used to initialized properties of class
    - initializers can be used, if there is no use of constructor
    - types of initializers: instance block

# instance block:
    - there is no keyword to defined instance block
    - syntax:
        {

        }
    - instance block invoke implicitely during object creation before constructor
    - instance block can be used to initialized instance and static variable with default values only

# static block:
    - to create static blockwe can use static keyword
    - syntax
        static{

        }
    -static block invoked implicitely once at class loading process
    - static block can be used to initialized static variablewith default value only

 */



// // programe1 : example for instance block
// public class Program1 {
//     public static void main(String[] args) {
//         DemoProgram1 d1 = new DemoProgram1();
//         DemoProgram1 d2 = new DemoProgram1();
//         DemoProgram1 d3 = new DemoProgram1();
        
//     }
// }
// // here you will see that the instance block will get called even before constructor
// //output:
// // instance block called
// // constructor called
// // instance block called
// // constructor called
// // instance block called






// // programe2 
// public class Program1 {
//     public static void main(String[] args) {
//         DemoProgram1 d1 = new DemoProgram1();
//         DemoProgram1 d2 = new DemoProgram1();
//         DemoProgram1 d3 = new DemoProgram1();
        
//     }
// }
// //output:
// // instance block called
// //  second instance block called
// // constructor called
// // instance block called
// //  second instance block called
// // constructor called
// // instance block called
// //  second instance block called
// // constructor called






// // programe3: static block example
// public class Program1 {
//     public static void main(String[] args) {
//         DemoProgram1 d1 = new DemoProgram1();
//         DemoProgram1 d2 = new DemoProgram1();
//         DemoProgram1 d3 = new DemoProgram1();
        
//     }
// }
// // as you will see the static block only get called at once at the first and it will not repete with the creation of new object
// //output:
// // static block called
// // instance block called
// // second instance block called
// // constructor called
// // instance block called
// // second instance block called
// // constructor called
// // instance block called
// // second instance block called
// // constructor called








// // programe4
// public class Program1 {
//     public static void main(String[] args) {
//         DemoProgram1 d1 = new DemoProgram1();
//         System.out.println(d1.hashCode());
        
//     }
// }
// //output: 
// // 351028485

//-----------------------------------------------------------
//Date: 6-5-24






//#object
/*

object
    - object is a classwhich is located in java.lang.package
    - in java object class is a parent of all classes
    - hence it is considered as a super class in java 
    
# methods of object class:

1 getClass()
    - getClass() method of object can be used to represent the source of object

2 toString()
    - toString() method of object class can be used to represent the object in the string form

3 hashCode()
    - hashCode() method of object class can be used to represent hashcode of object

4 clone()
    - clone() method of object class can be used to copy object

5 equals()
    - equals() method of object class can be used to compare 2 objects

6 finalize()
    - finilize() method of object class used by garbage collecter implicitely to destroy unrefrenced object from application

7 wait()
    - wait() method of object class can be used to put thread object into non-runnable state until notify() or notifyAll() method invoked

8 notify()
    - notify() method of object class can be used to free thread object from non-runnable state

9 notifyAll()
    - notifyAll() method of object class can be used to free all thread object from non-runnable state



# object 
    -in java object is an instance of class
    - by using object we can access elements of class

types of object creation:
    
    // not understand this part currectly watch again

    1) by using new keyword:
        - in java new is a keyword which returns new memory
        -  new object will be stored in seprate memory hence object shoud be compair by using .equals() method not by == operator
        note: == is a relational operator, which compares 2 object on the basic of memory
        - where .equals() is a method of object class which compares 2 object on the basic of values

    2) by using referance
        - in java we can create object by reference old object to new one
    
    3) by using method
        - in java we can create object by method also 
        - for that java provides forName() and forInstance() method of Class class
        - forName() is a static method of Class class, which can be used to load mention class file 
        - forName() can throws with ClassNotFoundException, hence to invoke this method,we have to handle this exception in try-catch block
        - newInstance() method of Class class, which can be used to create object of class file
        - newInstance() method can be rows with InstantiationException and IllegalAccessException, hence we have to also handle this exception in try-catch block 
        - Note: this approach can be used to create object of external class file   
    
   4) by using copy constructor
        - in java we can create project by using copy constructor also 
        - copy constructor is one type of user defined constructor which contains same class type parameter
        - by using copy constructor we can copy complete or partial object
    5) by using clonning process
        -  in java we can create object by using clonnning process also
        - in clonning process we can use the clone() method of object class
        - clone() method throws with CloneNotSupportedException, hence to invoke this method we have to handle exception
        - to perform clonning process class shoud be implemented with the Cloneable interface
        - Note : clonning process can be used if complete copy require but if you want to use only some part then you better choose the copy constructor method
    
    6) by using anonymous way
     
    7) by using singleton pattern

    8)shallow copy

    9) deep copy

    10) serialization


*/

// // programe5
// public class Program1 {
//     public static void main(String[] args) {
//         DemoProgram1 d1 = new DemoProgram1();
//         System.out.println(d1);
        
//     }
// }
// // output: 
// // DemoProgram1@105fece7




// // programe6 : by using new keyword: object creation
// public class Program1 {
//     public static void main(String[] args) {
//         DemoProgram1 d1 = new DemoProgram1();
        
//     }
// }




// // programe7 : by using reference : object creation
// public class Program1 {
//     public static void main(String[] args) {
//         DemoProgram1 d1 = new DemoProgram1();
//         DemoProgram1 d2 = d1;   //this is how its done

//         d1.a = 10;
//         d1.b = 20;

//         d1.display();
//         d2.display();
        
//     }
// }
// // output:-
// // a = 10, b = 20
// // a = 10, b = 20






// // programe8 : by using method : part 1 for understand forName
// public class Program1 {
//     public static void main(String[] args) {
//         System.out.println("Program started");
//         try {
//             Class.forName("DemoProgram1");  //here if it find the class DemoProgram1 then it will not throw error but if this class dont exist then it will throw error that can be catch in try block
//         } catch (ClassNotFoundException e) {
//             System.out.println(e);
//         }        
//         System.out.println("Program ended");
//     }
// }
// // output:-
// // Program started
// // Program ended




//note this type of creating object is used when we have to create an object from an external class file 


// // programe8 : by using method : part 2
// public class Program1 {
//     public static void main(String[] args) {
//         System.out.println("Program started");
//         try {
//             Class c = Class.forName("DemoProgram1");  
//             DemoProgram1 d1 = (DemoProgram1)c.newInstance();
//             d1.display();
//         } catch (ClassNotFoundException|InstantiationException|IllegalAccessException e) {
//             System.out.println(e);
//         }        
//         System.out.println("Program ended");
//     }
// }
// // output:- //it will give us this output with some of warnings that you can ignore
// // Program started
// // a = 0, b = 0
// // Program ended









// // programe9 : by using copy constructor
// public class Program1 {
//     public static void main(String[] args) {
//         DemoProgram1 d1 = new DemoProgram1();
//         d1.a = 10;
//         d1.b = 20;
//         DemoProgram1 d2 = new DemoProgram1(d1);
//         d1.display();
//         d2.display();
//     }
// }
// // output:- 
// // a = 10, b = 20
// // a = 10, b = 20







// this is imp and difficult to understand so come back and watch again this topic
// programe10 : by using clonning process
public class Program1 {
    public static void main(String[] args) {
        DemoProgram1 d1 = new DemoProgram1();
        d1.a = 10;
        d1.b = 20;
        DemoProgram1 d2 = d1.clone();
        d1.display();
        d2.display();
    }
}
// output:- 
// a = 10, b = 20
// a = 10, b = 20





