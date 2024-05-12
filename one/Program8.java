
// date : 25-4-24

/*
    instance variable / non-static will get store in heap area memory
    local variable are the variable are which get declared inside any method, loop, if else, constructor, etc like block 
    local variable need to assigned the value it will not automatically got default value like the variable that got declared inside class directly

 */


//for this programe example we have created the DemoProgram8.java file in the outside folder

// class Program8 {
//     public static void main(String[] args) {
//         System.out.println("c = " + DemoProgram8.c);    //this will print the value of c 
//         //even though we have not created the object of the class DemoPrograme8.java we can still access the c variable because its a static variable

//         // DemoProgram8.display();     //this will give us error because display is non-primative
//         // System.out.println("a="+DemoProgram8.a);    //thjis will give us error because a is non premative
//         //this will give us an error because we can not use the non-Static veriable or method before creating the object of that class

//     }    
// }



//#here is the example of the method overloading (means same name with different parameters) 
//#here we are tryng to look if we can use the method overloading with the main method
// public class Program8 {
//     public static void main(int[] args) {
//         System.out.println("this is inside the int[] args");
//     }
//     public static void main(String[] args) {
//         System.out.println("this is inside the String[] args");     //when you run this programe this String[] args will be called automatically not the int[] args
//     }
// }


// public class Program8 {
//     public static void main(String[] a1) {
//         System.out.println("here we put another variable name insted of the args but it will still work fine and it will not give us any error");
//     }   
// }



//------------------
//#imp

/**
 * Program8
 */
public class Program8 {

    public static void main(String[] args) {
        DemoProgram8 d1 = new DemoProgram8();
        DemoProgram8 d2 = new DemoProgram8();

        //here we weill assing the values to the d1 object
        d1.a = 10;
        d1.b = 20;
        d1.c = 30;

        d1.display();
        // output: a =10 b = 20 c = 30 d = 1000

        d2.display();
        // output: 
        // a =0 b = 0 c = 30 d = 1000
        //here if you see there is a change we did not assign the value of c by d2 object but still it has priented the value
        //this is because we have declared c as the static variable and it has get the value 30 that we assigned by d1 
        // and the if you change the value of the static then it will stores in meta space in heap area memory
    }
}