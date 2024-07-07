// Date: 30-4-24
/*
#constructor
    - in java constructor is a special method which contains same name as of class
    - constructor invoked implicitly during object creation
    - constructor can not be static, because it involes during object creation
    - imp : constructor does not have return type, because it returns instansce of the class
    - constructor can be used to initializedinstance and static variable of a class
    - note : to prevent object creation we can declare constructor as private

# default constructor:
    - it dosent contains any argument hence it is called as default or no-argument constructor
    - java compiler provides default constructor by default, if you do not have custom constructor
    - default constructor invoked implicitely during object creation
    - default constructor can be used to initialized instance and static variable with default value

# user defined constructor
    - user defines constructor contains parameters hence it is called as default or parameterized constructor
    - java compiler dosent provide user defined constructor we have to create our own user defined constructor 
    - to invoke user defined constructor we have to pass number of matching or supportive parameters
    - user defined constructor can be used to initialized instance and static variable with user defines values

*/





// //program-1
// public class Program11 {
//     public static void main(String[] args) {
//         DemoProgram11 p = new DemoProgram11();
//         p.a = 10;
//         p.b = 20;
//         p.display();
//     }
// }
// // output:-
// //  const called
// //  a = 10 b = 20



// //program-2
// public class Program11 {
//     public static void main(String[] args) {
//         DemoProgram11 p = new DemoProgram11();
//         DemoProgram11 p2 = new DemoProgram11();
//         DemoProgram11 p3 = new DemoProgram11();
//     }
// }
// // output:
// // const called
// // const called
// // const called






// //program-3
// public class Program11 {
//     public static void main(String[] args) {
//         DemoProgram11 p = new DemoProgram11();
//         DemoProgram11 p2 = new DemoProgram11();
//         DemoProgram11 p3 = new DemoProgram11();
        
//         p.display();
//         p2.display();
//         p3.display();
//     }
// }
// // output:
// // const called
// // const called
// // const called
// // a = 10 b = 20
// // a = 10 b = 20
// // a = 10 b = 20






// //program-4
// public class Program11 {
//     public static void main(String[] args) {
//         DemoProgram11 p = new DemoProgram11();
//         DemoProgram11 p2 = new DemoProgram11();
//         DemoProgram11 p3 = new DemoProgram11();

//         p.display();
//         p2.display();
//         p3.display();
//     }
// }
// // output:
// // const called
// // const called
// // const called
// // a = 10 b = 20 c = 100
// // a = 10 b = 20 c = 100
// // a = 10 b = 20 c = 100






// //program-5
// public class Program11 {
//     public static void main(String[] args) {
//         DemoProgram11 p = new DemoProgram11();
//         DemoProgram11 p2 = new DemoProgram11();
//         DemoProgram11 p3 = new DemoProgram11();

//         p.display();
//         p2.display();
//         p3.display();
//     }
// }
// // output:
// // error : DemoProgram11() has private access in DemoProgram11







// //program-5
// public class Program11 {
//     public static void main(String[] args) {
//         DemoProgram11 p = new DemoProgram11();
//         DemoProgram11 p2 = new DemoProgram11(5, 6);
//         DemoProgram11 p3 = new DemoProgram11(65, 63);

//         p.display();
//         p2.display();
//         p3.display();
//     }
// }
// // output:
// // default constructor called
// // parametarize const called
// // parametarize const called
// // a = 0 b = 0
// // a = 5 b = 6
// // a = 65 b = 63