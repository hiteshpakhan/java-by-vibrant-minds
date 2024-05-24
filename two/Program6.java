// date: 13-5-24

//write a program to shift first digit at last 

// import java.util.Arrays;
// public class Program6 {
//     public static void main(String[] args) {
//         int a[] = {124, 651, 3896, 467, 234, 977, 543, 23, 467, 235, 112};

//         for(int i = 0; i < a.length; i++){
//             if(a[i] > 10){
//                 int first = 0;
//                 int temp = a[i];
//                 int length = 0;
//                 while(temp!=0){
//                     first = temp%10;
//                     temp /= 10;
//                     length++;
//                 }
//                 temp += a[i] % (Math.pow(10,--length));
//                 temp *= 10;
//                 temp += first;
//                 a[i] = temp;
//             }

//         }
//         System.out.println(Arrays.toString(a));
//     }
// }
// // output:
// // [241, 516, 8963, 674, 342, 779, 435, 32, 674, 352, 121]


//-----------------------------------------------------------


//write a program to shift last digit at first 

// import java.util.Arrays;
// public class Program6 {
//     public static void main(String[] args) {
//         int a[] = {124, 651, 3896, 467, 234, 977, 543, 23, 467, 235, 112};
//         for(int i = 0; i < a.length; i++){
//             int last = a[i] % 10;
//             a[i]/=10;
//             int temp = a[i], length=0;
//             while(temp!=0){
//                 length++;
//                 temp/=10;
//             }
//             last *= Math.pow(10,length);
//             last += a[i];
//             a[i] = last;
//         }
//         System.out.println(Arrays.toString(a));
//     }   
// }
// // output: 
// // [412, 165, 6389, 746, 423, 797, 354, 32, 746, 523, 211]



//-----------------------------------------------------------

//write a program to reverse each elements from array 

// import java.util.Arrays;
// public class Program6 {
//     public static void main(String[] args) {
//         int a[] = {124, 651, 3896, 467, 234, 977, 543, 23, 467, 235, 112};
//         for(int i = 0;i < a.length; i++){
//             int sum = 0;
//             while(a[i] != 0){
//                 sum *= 10;
//                 sum += a[i] % 10;
//                 a[i] /= 10;
//             }
//             a[i] = sum;
//         }   
//         System.out.println(Arrays.toString(a));
//     }
// }
// // output: 
// // [421, 156, 6983, 764, 432, 779, 345, 32, 764, 532, 211]



//----------------------------------------
// wap to replace elements by there first and last digit 

// import java.util.Arrays;
// public class Program6 {
//     public static void main(String[] args) {
//         int a[] = {124, 651, 3896, 467, 234, 977, 543, 23, 467, 235, 112};
        
//         for(int i = 0; i < a.length; i++){
//             int last = a[i] % 10;
//             int first = 0;
//             if(a[i] >= 10){
//                 while(a[i] != 0){
//                     first = a[i] % 10;
//                     a[i] /= 10;
//                 }
//                 first *= 10;
//             }
//             first += last;
//             a[i] += first;
//         }
//         System.out.println(Arrays.toString(a));
//     }
// }
// // output: 
// // [14, 61, 36, 47, 24, 97, 53, 23, 47, 25, 12]


//-----------------------------------
// palindrome number
// prime number
// strong number
// armstrong number
// perfect number
// perfect square
// perfect cube
// palendromic prime
// prime and twist number 