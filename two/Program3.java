// date : 8-5-24
//Array
/*
    - in java array can be strore multiple values
    - array can store multiple index basis 
    - array index always starts with 0 and it ends with length - 1
    - by using index we can get or set elements from array
    - if we try to access index of an array, which is not present we will get ArrayIndexOutOfBoundsException 
    - to determine the size of an array we can use the length property

// in how many types you can create object of an array 
    
    1) by using new keyword
        int a[] = new int[5]; 

    2) by using reference 
        int a[] = new int[5]; 
        int b[] = a;
    
    3) by using static
        int a[] = {10,20,30,40,50}

    4) by using anonymous way
        int result = new int[]{10,20,30,40}[3];

    5) by coping an array
        
        //example1:
        int a[] = new int[]{10,20,30,40,50};
        int b[] = new int[a.length];

        for(int i=0; i < a.length; i++)
            b[i] = a[i];
        
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]+"\t"+b[i]);

        //------------------
        //example2:
        import java.util.Arrays;      
        class Program3 {
            public static void main(String args[]) {

                int a[] = new int[]{10,20,30,40,50};
                int b[] = Arrays.copyOf(a, a.length);
                
                for(int i = 0; i < a.length; i++)
                    System.out.println(a[i]+"\t"+b[i]);
    

 */

 
// // Example1
// class Program3 {
//     public static void main(String args[]) {
//         int a[] = new int[5];
//         for(int i=0; i<5; i++){
//             System.out.println(a[i]);
//         }
//         System.out.println("length of this array is = "+a.length);       //this length property can tell the length of an array
//     }    
// }
// // output
// // 0
// // 0
// // 0
// // 0
// // 0



 
// // Example2:  by using reference
// class Program3 {
//     public static void main(String args[]) {
//         int a[] = new int[2];
//         int b[] = a;

//         a[0] = 10;
//         a[1] = 20;

//         for(int i=0; i < a.length; i++)
//             System.out.println(a[i]+"\t"+b[i]);       
        
//     }    
// }
// // output 
// // 10      10
// // 20      20






// // Example3 : by using static
// class Program3 {
//     public static void main(String args[]) {

//         int a[] = {10,20,30,40,50};
//         int b[] = {10,20,30,40,50};

//         for(int i=0; i < a.length; i++)
//             System.out.println(a[i]+"\t"+b[i]);

//     }    
// }
// // output 
// // 10      10
// // 20      20
// // 30      30
// // 40      40
// // 50      50






// // Example4 : by using anonymous way
// class Program3 {
//     public static void main(String args[]) {

//         int result = new int[]{10,20,30,40}[3];

//         System.out.println(result);   // it will give you result = 40  

//     }    
// }
// // output:
// // 40






// // Example5 : by copying an array part1
// class Program3 {
//     public static void main(String args[]) {

//         int a[] = new int[]{10,20,30,40,50};
//         int b[] = new int[a.length];

//         for(int i=0; i < a.length; i++)
//             b[i] = a[i];
        
//         for(int i = 0; i < a.length; i++)
//             System.out.println(a[i]+"\t"+b[i]);
//     }    
// }
// // output 
// // 10      10
// // 20      20
// // 30      30
// // 40      40
// // 50      50







// // Example6 : by copying an array part2
// import java.util.Arrays;     //here for this we have to inport the package name Arrays 
// class Program3 {
//     public static void main(String args[]) {

//         int a[] = new int[]{10,20,30,40,50};
//         int b[] = Arrays.copyOf(a, a.length);
        
//         for(int i = 0; i < a.length; i++)
//             System.out.println(a[i]+"\t"+b[i]);
//     }    
// }
// // output 
// // 10      10
// // 20      20
// // 30      30
// // 40      40
// // 50      50






// // Example7 : how to store and represent elements from an array 
// class Program3 {
//     public static void main(String args[]) {
//         int a[] = new int[5];
//         a[0] = 10;
//         a[1] = 20;
//         a[2] = 30;
//         a[3] = 40;
//         a[4] = 50;
//         for(int i = 0; i < a.length; i++)
//             System.out.print(a[i]+" ");
//         System.out.println();
//         for(int i = a.length - 1; i >= 0; i--)
//             System.out.print(a[i]+" ");
//     }    
// }
// // output 
// // 10 20 30 40 50 
// // 50 40 30 20 10









// // Example8 : how to store hetrogenous(different type) elements into array 
// class Program3 {
//     public static void main(String args[]) {
//         Object a[] = new Object[5];
        
//         a[0] = 10;
//         a[1] = true;
//         a[2] = "afg";
//         a[3] = 12.34;
//         a[4] = new Program3();

//         for(int i = a.length - 1; i >= 0; i--)
//             System.out.print(a[i]+" ");
//     }    
// }
// // output 
// // Program3@372f7a8d 12.34 afg true 10



//homework:
// wap to find sum of array
// find avg of an array
// print greater elements than avg array