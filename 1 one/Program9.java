// Date: 27-4-24
/*
# method (function):
    - in java method is also considered as the function or behavior of a class
    - in java method is a block of statement which can be used to execute redundence statement
    - due to method we dont have to write repeted statement
    - by using method we can remove code complexity
    - in java method name shoud be identical or decapitalized
    - syntax:
        return_type method_name(para1, para2,...paraN){
            //statements
        }

# types of method:

    1 no argument no return
        - if method dosent return any value return type shoud be declared with void keyword
        - if method dont contain any argument then we shoud not pass the argument to invoke method
    
    2 with argument no return
        - if methods contains any argument we can pass matching or supportive number of parameter
        - if method dosent returnany value return type shoud be declared with void keyword
    
    3 no argument with return value
        - if method does not contain any argument then we shoud not pass the argument to invoke method 
        - if method return any value value can be return by return keyword
        - return value and return type shoud be matching and supportive
        - method can return one value at a time 
    4 with argument with return type
        - if method contains any argument we shoud pass matching or supportive number of parameters
        - if method returns any value value can be return by using return keyword
        - return type an return value shoud be matching or supportive
        - method can return one value at a time 

//imp: java does not have default parameter concept like when we do in other programming language we can set the default values to the parameters but not in java

 */

public class Program9 {
    public static void main(String[] args) {


        DemoProgram9 d4 = new DemoProgram9();
        //with argument with return type
        System.out.println(d4.add(5,4));    //9
        System.out.println(d4.add('A',4));  // 69
    }
}

//homework:
/*
    wap to find last digit of the given number
    wap to find second last digit of the given number
    to find first digit of given number
    to find sum of a digit
    to find simple interest
    to replace last digit at first of given number  // input: 12345  // output: 51234
    to replace first digit at last of the given number 

 */