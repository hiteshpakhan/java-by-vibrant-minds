// # toString():

/* 
If you want to represent any object as a string, toString() method comes into existence.
The toString() method returns the String representation of the object.
*/

/*
A toString() is an in-built method in Java that returns the value given to it in string format. 
Hence, any object that this method is applied on, will then be returned as a string object
*/


// without toString() method
class Student{  
 int rollno;  
 String name;  
 String city;  
  
 Student(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
  
 public static void main(String args[]){  
   Student s1=new Student(101,"Raj","lucknow");  
   Student s2=new Student(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);//output : Student@1fee6fc  
   System.out.println(s2);//output : Student@1eed786  
 }  
} 


// with toString() method
class Student{  
 int rollno;  
 String name;  
 String city;  
  
 Student(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
   
 public String toString(){//overriding the toString() method  
  return rollno+" "+name+" "+city;  
 }  
 public static void main(String args[]){  
   Student s1=new Student(101,"Raj","lucknow");  
   Student s2=new Student(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);//output: 101 Raj lucknow  
   System.out.println(s2);//output: 102 Vijay ghaziabad  
 }  
}  