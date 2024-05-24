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

// wap to find 81th palendrome number 

// class Program7 {

// }

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

// wap to display first 35 prime number in reverse order

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

