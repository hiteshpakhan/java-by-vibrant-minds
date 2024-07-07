// date: 17-5-24


/*
// # String
    - in java string is a class which is located in java.lang package
    - String class can be used to represent a group of character
    - to reperesent the group of character, string class initially uses char[] array
    - String class always start with 0 and ends with the length-1
    - by using charAt() method we can get 
    - if we try to access the index of a string which is not present we will get StringOutOfBoundsException
    - to determined size of a string object we can use length() method

imp: string is immutable

// method of strings
    - other methods check it here: https://www.javatpoint.com/java-string


// how to create string object
    1) by litral way
        - eg: 
            String s = "hitesh";
            System.out.println(s);
    
    2) by using new keyword
        -eg: 
            String s = new String("hitesh");
            System.out.println(s);

    3) by using char[] array        (this question offen asked in interview that which array can be printed directly the answer is char array)
        -eg:
            char c[] = {'H','I','T','E','S','H'};
            String S1 = new String(c);
            System.out.print(s1);   //output: HITESH
            System.out.print(c);    //output: HITESH

    4) by using anonimus way
        -eg: 
            System.out.print("India".length());                     //output:  5 
            System.out.print(new String("India").toUpperCase());    //output:  INDIA

    5) by using intern() method
        -eg:

// String is immutable?         (if we can not make changes into any object that means it is immutable)
    - in java String is immmutable, here immutable means we can not change into String object
    - String is immutable because it follows StringConstantPool
    - due to StringConstantPool String saves a lot of memory
    - due to StringConstantPool String object shoud be compared by using .equals() method not == operator
    - note : here .equals() method of object class can be used to comapare 2 objects on the basic of values, == is a relational operator which compares 2 objhects on the basic of memeory
    - due to SrtringConstantPool String considered as an immutable we can not make changes into String objects
    
// mutable classes:
    1) StringBuffer 
        - StringBuffer is a class which is located in java.lang package
        - StringBuffer does not follow the String Constant Pool hence it is considered as a mutable class
        - StringBuffer does not contain concat() method insted it we can use the append() method to perform concatnation
        - StringBuffer is a thread safe of synchronized implementation 
        - StringBuffer is a slower class  
        - StringBuffer introduced in java 1.0 versions
        - eg:
            StringBuffer sb = new StringBuffer("India");
            sb.append(Digital);
            system.out.println(sb);

    2) StringBuilder
        - StringBuilder is a class, which is located in java.lang package 
        - StringBuilder does not follow StringConstantPool hence it is considered as mutable class 
        - string builder also not support the concat method insted it uses append() method
        - StringBuilder is non-synchronized or thread-unsafe implementation
        - StringBuilder is faster than StringBuffer
        - StringBuilder is introduced in java 1.5 versiong
        eg: 
            StringBulder sb = new StringBuilder("India");
            sb.append("Digital");
            System.out.println(sb);

example:
    String s1 = "India";
    String s2 = new String("Bharat");
    String s3 = new String("Bharat");
    String s4 = new String("India");
    String s5 = "India";
    System,out,println(s1 == s4);       //output: false
    System,out,println(s1.equals(s4));  //output: true

    
 */


//#imp
// code1
class Program10 {
    public static void main(String[] args) {
        char c = 'a';   //it is very important to understand that we can not use the "" for storing the char we only can use '' for this in java 
        System.out.println("char c = "+c);
        
        String s = "hitesh";    //it is very important to understand that we can not use the '' for storing the String we only can use "" for this in java
        System.out.println("String s = "+s);
    }    
}
