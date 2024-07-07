//date : 25-5-24

//#imp
// upcasting vs downcasting
/*
    # Upcasting     //go see the upcasting folder
        -in java upcasting is a concept where object of child class reference to parent class
        - upcasting also known as a widennining or generalization 
        - in java upcasting is permissible
        eg: 
            Demo1 d1 = new Demo2();
            Demo1 d2 = new Demo3();
            Demo1 d1 = new Demo3();

    # downcasting
        - in java downcasting is a concept where object of parent class reference to child class 
        - downcasting also known as narrowing or degeneralization
        - downcasting is not-permissible
        - Note: if we try to perform downcasting explicitly, we will get ClassCastException 
        eg: 
            Demo2 d1 = new Demo1();     //error
            Demo3 d1 = new Demo2();     //error
            Demo3 d1 = new Demo1();     //error

            note : method will be called of the object that you have created, and the variables are considered of the referenced one
            
        Note: during upcasting common method from child and parent will invoked
        // method will be execute as per object
        // variable will be execute as per reference
 */


 //-----------------------------------------------------------------------------------------------------------------------------------


//# this        
/*
    - this keyword can be used to reperesent to current class or its elements
    - this keyword can ber use with vbariable, constructor and object
    - by using this keyword we cvan differentiate between local vs non-local variable
    - by using this keyword we can invoke user defined constructor from default constructor and vice-versa
    - by using this keyword we can reperesent current class object 
    eg: go see the this folder

 */


public class Program16 {
    public static void main(String[] args) {
    }
}
