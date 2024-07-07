//date : 9-5-24   & date: 10-5-24

// date : 9-5-24
/*
# how to take input from user

1) by using CLA (command line argument)
    - in CLA we can take number of inputes from user
    - number of parameter will be passed into application before execution of application
    
2) by using BufferedReader
    - in java we can take input from user by using BufferedReader as well
    - BufferedReader is a class which is located in java.io.package
    - BufferedReader required instance of InputStreamReader
    - InputStreamReader is a class which is located in java.io package
    - InputStreamReader requires instance of InputStream
    - to take input from user we can use ReadLine() method of BufferedReader class
    - readLine() method throws with IOException, hence we have to handle an exception
    - Note: this approach can be used to take input from user duering execution of application
    - BufferedReader is faster than other 

3) by using Scanner
    - in java we can take input from user by using scanner class also 
    - Scanner is a class which is located in java.util package
    - Scanner class requires instance of InputStream
    - Scanner is slower than BufferedReader


    */






// // example1: by using CLA 
// public class Program4 {
//     public static void main(String[] args) {
//         System.out.println("args[0] + args[1] = " + (args[0] + args[1]));  // output : output will be the concatination of the 2 argument that passed because the arguments in this case are string byu default 
//         //this is happen because we did not convert this value that ware string by default to integer
        
//         int a = Integer.parseInt(args[0]);        //here we will first convert the values to integer
//         int b = Integer.parseInt(args[1]);

//         System.out.println("a+b = "+ (a+b));
//     }
// }
// //in cammend prompt: 
// // E:\java practice vm\two> javac Program4.java
// // E:\java practice vm\two> java Program4.java 30 40    //here we have passed the 30 and 40 as arguments
// // output :
// // args[0] + args[1] = 3040
// // a+b = 70







// // example2: by using BufferedReader 
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// public class Program4 {
//     public static void main(String[] args) throws IOException   //here we have put throws IOException because this is the shortcut for doing the try catch block here throws IOException means it is same as written in the catch condition block
//     {
//         InputStreamReader isr = new InputStreamReader(System.in);
//         BufferedReader br = new BufferedReader(isr);

// //   or you can replace upper 2 lines by this : BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter oyur name: "); 
//         String str = bfn.readLine();
        
//         System.out.println("Enter Value: ");
//         int a = Integer.parseInt(br.readLine());
        
//         System.out.println("Enter Value: ");
//         int b = Integer.parseInt(br.readLine());

//         System.out.println("addition of this 2 values is = "+(a+b));

//     }
// }
// //output:
// // Enter Value: 
// // 4        //here this 4 is the valur that we have typed in terminal
// // Enter Value:
// // 4
// // addition of this 2 values is = 8   







// // example3: by using Scanner 
// import java.util.Scanner;
// public class Program4 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Value");
//         int a = sc.nextInt();
//         System.out.println("Enter Value");
//         int b = sc.nextInt();
//         System.out.println("addition of this 2 values is = "+(a+b));
//     }
// }
// //output: 
// // Enter Value
// // 5    //here 5 is the value that we have pass
// // Enter Value
// // 5
// // addition of this 2 values is = 10



// --------------------------------------------------------------


// // wap to take elements from user and print all elements of array.
// // example4
// import java.util.Scanner;
// public class Program4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // you can use the upper statment with importing the java.util.scanner but if you dont want to import then you can do this : java.util.Scanner sc = new java.util.Scanner(System.in);
//         System.out.print("Enter size of an array = ");
//         int a[] = new int[sc.nextInt()];

//         for(int i = 0; i < a.length; i++){
//             System.out.print("Enter Element for a[" + i + "] = ");
//             a[i] = sc.nextInt();
//         }

//         for(int i = 0; i < a.length; i++){
//             System.out.println("a[i] : " + a[i]);
//         }
//     }
// }
// // output:
// // Enter size of an array = 2 
// // Enter Element for a[0] = 2
// // Enter Element for a[1] = 3
// // a[i] : 2
// // a[i] : 3










//---------------------------------------

// homework 
// wap to shift first element to last from array
// input: {10,20,30,40,50}
// output:{20,30,40,50,10}

// //example:6
// import java.util.Arrays;            //#imp you have to import this to print the array
// public class Program4 {

//     public static void main(String[] args){
        
//         int a[] = {10,20,30,40,50};
//         int temp = a[0];

//         for(int i = 1; i < a.length; i++){
//             a[i-1] = a[i];
//         }
//         a[a.length-1] = temp;

//         System.out.println(Arrays.toString(a));         //#this is how you can print an array
    
//     }
// }
// // output:
// // [20, 30, 40, 50, 10]


//-------------------------------------------------------------
// wap to shift last element to first from array
// input: {10,20,30,40,50}
// output:{50,10,20,30,40}

// //example:7
// import java.util.Arrays;            
// public class Program4 {

//     public static void main(String[] args){
        
//         int a[] = {10,20,30,40,50};
//         int temp = a[a.length - 1];

//         for(int i = a.length - 1; i > 0; i--){
//             a[i] = a[i - 1];
//         }
//         a[0] = temp;

//         System.out.println(Arrays.toString(a));        
    
//     }
// }
// // output: [50, 10, 20, 30, 40]

// ----------------------------------------------
// wap to sqap first and last element from array
// input: {10,20,30,40,50}
// output:{50,10,20,30,10}

// //example:8
// import java.util.Arrays;            
// public class Program4 {

//     public static void main(String[] args){
        
//         int a[] = {10,20,30,40,50};
//         int temp = a[a.length - 1];
//         a[a.length - 1] = a[0];
//         a[0] = temp;

//         System.out.println(Arrays.toString(a));        
    
//     }
// }
// // output:
// // [50, 20, 30, 40, 10]



//----------------------------------------------
// wap to shift first element to last from array without using 3rd variable
// input: {10,20,30,40,50}
// output:{20,30,40,50,10}

// //example:9
// import java.util.Arrays;            
// public class Program4 {

//     public static void main(String[] args){

//         int a[] = {10,20,30,40,50};
        
//         for(int i = 0; i < a.length - 1; i++){
//             a[i] += a[i + 1];
//             a[i + 1] = a[i] - a[i + 1];
//             a[i] -= a[i + 1]; 
//         }

//         System.out.println(Arrays.toString(a));        
    
//     }
// }
// // output:
// // [20, 30, 40, 50, 10]


//----------------------------------------
// wap to shift last element to first from array without using 3rd variable
// input: {10,20,30,40,50}
// output:{50,10,20,30,40}

// //example:10
// import java.util.Arrays;            
// public class Program4 {

//     public static void main(String[] args){

//         int a[] = {10,20,30,40,50};
        
//         for(int i = a.length-2; i >= 0; i--){
//             a[i] += a[i + 1];
//             a[i + 1] = a[i] - a[i + 1];
//             a[i] -= a[i + 1]; 
//         }

//         System.out.println(Arrays.toString(a));        
    
//     }
// }
// // output:
// // [50, 10, 20, 30, 40]



//-------------------------------------------
// wap to sqap first and last element from array without using 3rd variable
// input: {10,20,30,40,50}
// output:{50,10,20,30,10}

// //example:11
// import java.util.Arrays;            
// public class Program4 {

//     public static void main(String[] args){
        
//         int a[] = {10,20,30,40,50};
//         a[0] += a[a.length - 1];
//         a[a.length - 1] = a[0] - a[a.length - 1];
//         a[0] -= a[a.length - 1]; 

//         System.out.println(Arrays.toString(a));        
    
//     }
// }
// // output:
// // [50, 20, 30, 40, 10]




//----------------------------------------------------------------
// date: 10-5-24

// homework :

// wap to reverse an array without using 3rd variable 
// input: {1,7,4,9,2}
// output: {2,9,4,7,1}

// import java.util.Arrays;
// public class Program4 {
//     public static void main(String[] args) {
//         int a[] = {10,20,30,40,50};

//         for(int i = 0; i < a.length/2; i++){
//             a[i] += a[a.length-1-i];
//             a[a.length-1-i] = a[i]-a[a.length-1-i];
//             a[i] -= a[a.length-1-i];
//         }

//         System.out.println(Arrays.toString(a));
//     } 
// }  
// // output:
// // [50, 40, 30, 20, 10]

//-----------------------------------
//wap to replace each element with sum of their digit
// input: {53,67,12,63,28,467,124,35}
// output: {8,13,3,9,10,17,7,8} 


// import java.util.Arrays;
// public class Program4 {
//     public static void main(String[] args) {
//         int a[] = {53,67,12,63,28,467,124,35};

//         for(int i = 0; i < a.length; i++){
//             int sum = 0;
            
//             while(a[i] != 0){
//                 sum += a[i] % 10;
//                 a[i] /= 10;
//             }

//             a[i] = sum;
//         }
        
//         System.out.println(Arrays.toString(a));
//     } 
// }  
// // output:[8, 13, 3, 9, 10, 17, 7, 8]


//------------------------------------
// wap to append sum of their element at last of element
// input: {53,67,12,63,28,467,124,35}
// output: {538,6713,123,639,2810,46717,1247,358}

// import java.util.Arrays;
// class Program4{
//     public static void main(String []args){
//         int a[] = {53,67,12,63,28,467,124,35};
//         for(int i=0;i<a.length;i++){
//             int temp = a[i];
//             int sum = 0;
//             while(temp != 0){
//                 sum += temp%10;
//                 temp /= 10;
//             }
//             temp=sum;
//             int length=0;
//             while(temp!=0){
//                 temp/=10;
//                 length++;
//             }
//             a[i] *= Math.pow(10, length);   //it will put the number of zeros we want to put behind the array numbers so that we can simple add the numbers and the concatination happens
//             a[i] += sum;
//         }
//         System.out.println(Arrays.toString(a));
//     }
// }
// // output: [538, 6713, 123, 639, 2810, 46717, 1247, 358]