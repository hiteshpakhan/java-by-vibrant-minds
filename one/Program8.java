
// date : 25-4-24

/*


 */


//for this programe example we have created the DemoProgram8.java file in the outside folder

class Program8 {
    public static void main(String[] args) {
        System.out.println("c = " + DemoProgram8.c);    //this will print the value of c 
        //even though we have not created the object of the class DemoPrograme8.java we can still access the c variable because its a static variable

        // DemoProgram8.display();     //this will give us error because display is non-primative
        // System.out.println("a="+DemoProgram8.a);    //thjis will give us error because a is non premative
        //this will give us an error because we can not use the non-Static veriable or method before creating the object of that class

    }    
}
