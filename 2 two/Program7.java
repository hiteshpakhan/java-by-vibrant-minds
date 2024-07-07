// date: 14-5-24

//wap to check given number is palindrome or not


// public class Program7 {
//     public static void main(String[] args) {
//         int n = 12321, sum = 0, temp = n;
//         while(temp != 0){
//             sum *= 10;
//             sum += temp%10;
//             temp /= 10;
//         }
//         System.out.println(sum);
//         if(sum == n){
//             System.out.println("given number is palendrom");
//         }else{
//             System.out.println("given nuumber is not a palendrom");
//         }

//     }
// }
// // output:
// // given number is palendrom

//-------------------------------------------------------------

// wap to find all the palendromic number from 1 to 100

// public class Program7 {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 100; i++){
//             int n = i, sum = 0, temp = n;
//             while(temp != 0){
//                 sum *= 10;
//                 sum += temp%10;
//                 temp /= 10;
//             }
//             if(sum == n){
//                 System.out.print(n +" ");
//             }
//         }
//     }
// }
// // output: 
// // 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99

//---------------------------------------------------------------

//#imp

// // wap to find 81th palendrome number 
// // solved by sir
// class Program7 {
//     public static void main(String[] args) {
//         int a = 0, count = 0, last = 81;
//         while(true){
//             int temp = a;
//             int sum = 0;
//             while(temp != 0){
//                 sum *= 10;
//                 sum += temp % 10;
//                 temp /= 10;
//             }
//             if(sum == a){
//                 count++;
//             }
//             if(count == last){
//                 System.out.println(count+"th pclendrome number is "+ a);
//                 break;
//             }
//             a++;
//         }        
//     }
// }
// // output:
// // 81th pclendrome number is 717




//---------------------------------------------------------------
// wap a programe to display the first 25 palendromic number in reverse order

// public class Program7 {

    
// }


//----------------------------------------------------------------

//wap a programe to check given number is prime or not

// class Program7 {
//     public static void main(String args[]){
//         int n = 7;
//         boolean b = false;
//         if(n == 0 || n == 1){
//             b = true;
//         }else{
//             for(int i = 2; i <= n/2; i++){      //here we have set i = 2 because we have to start checking from 2 because 1 can devide every number
//                 if(n%i == 0){
//                     b = true;
//                     break;
//                 }
//             }
//         }
//         if(!b){     //or you can do : (b == false)
//             System.out.println(n+" is a prime number");
//         }
//     }
// }
// // output: 
// // 7 is a prime number




// // check prime numbers from 0 to 100
// class Program7 {
//     public static void main(String args[]){
//     int count = 0;
//         for(int j = 0; j <= 100; j++){
//             int n = j;
//             boolean b = false;
//             if(n == 0 || n == 1){
//                 b = true;
//             }else{
//                 for(int i = 2; i <= n/2; i++){     
//                     if(n%i == 0){
//                         b = true;
//                         break;
//                     }
//                 }
//             }
//             if(!b){ 
//                 System.out.print(n+" ");
//                 count++;
//             }

//         }

//         System.out.println(", total numbers we have find is = " + count);
//     }
// }
// // output:
// // 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97, total numbers we have find is = 25

//--------------------------------------------------------------

// wap to find 131th prime number

// ---------------------------------------------------------------

// wap to find given number is palendromic prime or not 

// public class Program7 {
//     public static void main(String[] args) {
//         int n = 131;
//         boolean b = false;
//         if(n == 0 || n == 1){
//             b = true;
//         }else{
//             for(int i = 2; i <= Math.sqrt(n); i++){
//                 if(n % i == 0){
//                     b = true;
//                     break;
//                 }
//             }
//         }
//         if(!b){
//             int sum = 0, temp = n;
//             while(temp != 0){
//                 sum *= 10;
//                 sum += temp % 10;
//                 temp /= 10;
//             }
//             if(sum == n){
//                 System.out.println(n + " is palendromic prime ");
//             }
//         }
//     }
// }
// // output:
// // 131 is palendromic prime


// ---------------------------------------------------------------

//#imp
// wap to display first 35 prime number in reverse order

// import java.util.Arrays;
// public class Program7 {
//     public static void main(String[] args) {
//         int a = 0, last = 35, first = 0, arr[] = new int[last];
//         while(true){
//             boolean b = false;
//             if(a == 0 || a == 1){
//                 b = true;
//             }else{
//                 for(int i = 2; i <= Math.sqrt(a); i++){
//                     if(a % i == 0){
//                         b = true;
//                         break;
//                     }
//                 }
//             }
//             if(!b){
//                 arr[arr.length-1-first++] = a;
//             }
//             if(first == last){
//                 break;
//             }
//             a++;
//         }
//         System.out.println(Arrays.toString(arr));
//     }   
// }
// // output: 
// // [149, 139, 137, 131, 127, 113, 109, 107, 103, 101, 97, 89, 83, 79, 73, 71, 67, 61, 59, 53, 47, 43, 41, 37, 31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2]

// ----------------------------------------------------------------

//wap to check if the given number is strong number or not          //note : strong number means the sum of each digits factorial is same as the number itself this is called as factorical 

// public class Program7 {
//     public static void main(String[] args) {
//         int n = 145, sum = 0, temp = n;
        
//         while(temp != 0){
//             int fact = 1;
//             for(int i = 1; i <= temp%10; i++){
//                 fact *= i;
//             }
//             sum += fact;
//             temp /= 10;
//         }
//         if(sum == n){
//             System.out.println(n+" is strong number");
//         }
//     }   
// }
// // output: 
// // 145 is strong number




// finding strong numbers from 1 to 100

// public class Program7 {
//     public static void main(String[] args) {
//         for(int j = 1; j<=100; j++){
//             int n = j, sum = 0, temp = n;
//             while(temp != 0){
//                 int fact = 1;
//                 for(int i = 1; i <= temp%10; i++){
//                     fact *= i;
//                 }
//                 sum += fact;
//                 temp /= 10;
//             }
//             if(sum == n){
//                 System.out.println(n+" is strong number");
//             }
//         }
//     }   
// }
// // output:
// // 1 is strong number
// // 2 is strong number


//---------------------------------------------------

// wap a program to fid a given number is armstrong or not      //means if the number is 153 then its a 3 digit number so we will put the power 3 to each digit so cube of 1=1, 5=125, 3=27 and we wil add them 153 = 153 so iyts a armstrong number

// public class Program7 {
//     public static void main(String[] args) {
//         int n = 153, length = 0, temp = n, sum = 0;
//         while(temp != 0){
//             length++;
//             temp /= 10;
//         }
//         temp = n;
//         while(temp != 0){
//             sum += Math.pow(temp%10, length);
//             temp /= 10;
//         }
//         if(sum == n){
//             System.out.println(n + " is armstrong n number");
//         }
//     }
// }
// // output: 
// // 153 is armstrong n number



// 1 to 100 armstrong number 

// public class Program7 {
//     public static void main(String[] args) {
//         for(int j = 1; j <= 100; j++){
//             int n = j, length = 0, temp = n, sum = 0;
//             while(temp != 0){
//                 length++;
//                 temp /= 10;
//             }
//             temp = n;
//             while(temp != 0){
//                 sum += Math.pow(temp%10, length);
//                 temp /= 10;
//             }
//             if(sum == n){
//                 System.out.print(n + " ");
//             }
//         }
//     }
// }
// // output: 
// // 1 2 3 4 5 6 7 8 9

//---------------------------------------------------------------------------
// wap to find 16th armstrong number 



//---------------------------------------------------------------------------
// wap to check given number is perfect or not          // perfect means the sum of the factor of that number shoud be same as that number     // for example if the number is 28 then is factor are : 14,7,4,2,1 and there sum is 28 = 28 this means its a perfect number


// public class Program7 {
//     public static void main(String[] args) {
//         int n = 28, sum = 0;
//         for(int i = 1; i <= n/2; i++){
//             if(n%i == 0){
//                 sum += i;
//             }
//         }
//         if(sum == n){
//             System.out.println(n+" is perfect number");
//         }
//     }    
// }
// // output:
// // 28 is perfect number





// //wap to find perfect number between 1-100
// public class Program7 {
//     public static void main(String[] args) {
//         for(int j = 1; j <= 100; j++){
//             int n = j, sum = 0;
//             for(int i = 1; i <= n/2; i++){
//                 if(n%i == 0){
//                     sum += i;
//                 }
//             }
//             if(sum == n){
//                 System.out.println(n+" is perfect number");
//             }
//         }
//     }    
// }
// // output:
// // 6 is perfect number
// // 28 is perfect number


//--------------------------------------------------------------

//perfect square    //means the square root of that number shoud not have any fraction means it shoud not have any value in points it will considered as perfect square

// public class Program7 {
//     public static void main(String[] args) {
//         for(int j = 1; j <= 100; j++){
//             int i = j;
//             if(Math.sqrt(i) % 1 == 0){
//                 System.out.println(i + " is a perfect square");
//             }
//         }
//     }
// }
// // output:
// // 1 is a perfect square
// // 4 is a perfect square
// // 9 is a perfect square
// // 16 is a perfect square
// // 25 is a perfect square
// // 36 is a perfect square
// // 49 is a perfect square
// // 64 is a perfect square
// // 81 is a perfect square
// // 100 is a perfect square



//-----------------------------------------------------------------

// wap to find 52th perfect square number


//-----------------------------------------------------------------

// wap to display first 35 perfect square number in reverse order

//-----------------------------------------------------------------

// wap to find 82th perfect cube number


//-----------------------------------------------------------------

// wap to display first 25 perfect cube number in reverse order

//-----------------------------------------------------------------
