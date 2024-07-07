// DATE: 23-4-24

// - before we see OOP we first know about the difference between OOPs (Object Oriented Programming structure) and POPs (Procedure oriented Programming structure)

/* 
# POPs Concept:-
    - POPs stands for procedure oriented programming structure
    - POPs uses trop to bottom approach 
    - in pop there is no security in our code
    - there can be code complexicity in pop
    - in pop we can not execute code as per requirement
    - by using POP we can create application but we can not achive any requirement of end user
    
# OOPs Concept:-
    - OOPs Stands for object oriented programming structure
    - OOP uses bottom to top approach
    - in OOP we can remove code complixity
    - in oop we can provide security to our code 
    - we can execute code as per requirement
    - by using oop we can create application easily we can achive any requirement of end user 
    oop things: class, object, inheritance, encapsulation, abstraction, polymorphism  


#JDK vs #JRE vs #JVM

#JDK
    - JDK stands for java development kit
    - JDK contains development tool 
    - JDK contains development tools 
    - development tools is a set of keywords(52 keywords), java commands(java, javac, javap) and JRE
    - JDK is responsioble to build java application

#JRE
    - JRE stads for Java Runtime Enviroment
    - JRE is a set of java libraries
    - JRE is Responsible to execute java application
    
#JVM
    - JVM stands for Java Virtual Machine
    - Jvm is a virtual machine physically not available 
    - is a set of classes and interfaces which is responsible to execute our class file
    - JVM is actually responsible for executing java application  

*/


public class Program7 {
    public static void main(String[] args) {

        //here to see how OOPS work we have created a file named DemoPrograme7.java and we will create the object of that file here
        DemoProgram7 d1 = new DemoProgram7();
        
        //here as you can see we can call the methods from the DemoProgram7 class to here by the object name d1 that we have created just now
        d1.m1();  //here we will get output: hello m1 from DemoProgram7
        


    }
}


//Date 24-4-24
/*
    default value of int, byte, short, long is 0
    float, double = 0.0
    char = " "
    boolean = false
    non-primative like String,  default value is = null

 */

