
// // programe-1
// class DemoProgram2 {
//     int a,b;
    
//     void display(){
//         System.out.println("a = "+a+", b = "+b);
//     }

//     public boolean equals(DemoProgram1 d1)
//     {  
//         if(d1.a == a)
//             if(d1.b == b)
//                 return true;
//             return false;
//     }
// }









// programe-2: by using singleton pattern
class DemoProgram2 {

    private static DemoProgram2 d1 = new DemoProgram2();    // here we have created the static object that we will pass by static method getObject()

    int a,b;
    
    void display(){
        System.out.println("a = "+a+", b = "+b);
    }

    public boolean equals(DemoProgram2 d1)
    {  
        if(d1.a == a)
            if(d1.b == b)
                return true;
            return false;
    }

    private DemoProgram2(){}    //here we have stoped the user from creating the object by new keyword 

    public static DemoProgram2 getObject(){ 
        return d1;  // here inside the getObject we will pass the static object that we have created user can create object by this and every time he will get the same object
    }
}