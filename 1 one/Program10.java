//date: 29-4-24 

//its not complete you need to look for this again

// method overloading
/*
    - in java method overloading is a concept where one class contains 2 or more method with the same name but different parameters
    - method overloading is a concept where we can execute method on the basis of there parameter
    - in method overloading one method can be executed differently on the basic of there parameter 
    - hence they are also considered as a compile time polymorphism
    - method overloading is useful for end-user
    - we can not prevent method overloading

    note : method overloading can be done on the basic of parameter not return type due to method auto-promotion
 
*/


public class Program10 {
    // we have created the overloading methods in DemoProgram10.java file example go to see the file DemoPrograme10.java
    public static void main(String[] args) {
    
        DemoProgram10 d1 = new DemoProgram10();
        d1.m1();
        d1.m1(10);
        d1.m1(10, 10.05F);
    }

}




// method auto promotion
/*
    -in java method auto promotion is a concept wher if method (means parameter type checking) coudent find matching parameter, 
    method auto promotes their parameters to invoke supportive parameter method
    -due to auto promotion we do not have to overload method unnecessarily
    - due to method auto promotion we can not perform method overloading on basic of return types 

  
tip
    in primative double is at top
    in hole java object is at the top

 */


