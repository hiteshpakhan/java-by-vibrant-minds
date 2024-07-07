// date: 15-5-24


// // wap to check if the given number is prime and twist  //twist means it is exat opposite like 13 = 31  

// public class Program8 {
//     public static void main(String[] args) {
//         int n = 13, n1 = n;
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
//             int sum = 0;
//             while(n != 0){
//                 sum *= 10;
//                 sum += n % 10;
//                 n /= 10;
//             }
//             n = sum;
//             if(n == 0 || n == 1){
//                 b = true;
//             }else{
//                 for(int i = 2; i <= Math.sqrt(n); i++){
//                     if(n%i == 0){
//                         b = true;
//                         break;
//                     }
//                 }
//             }
//             if(!b){
//                 System.out.println(n1 + " is prime and twist");
//             }

//         }
//     }
// }
// // output
// // 13 is prime and twist





//----------------------------------------------------------------

// homework
// wap to find 73rd palewndromic prime number

// public class Program8 {
//     public static void main(String[] args) {
//         int a = 0, first = 0, last = 73;
//         while(true){
//             boolean b = false;
//             if(a == 0 || a == 1){
//                 b = true;
//             }else{
//                 for(int i = 2; i <= Math.sqrt(a); i++){
//                     if(a % i == 0){
//                         b= true;
//                         break;
//                     }
//                 }
//             }
//             if(!b){
//                 int n = a, sum= 0;
//                 while(n != 0){
//                     sum *= 10;
//                     sum += n%10;
//                     n /= 10;
//                 }
//                 if(sum == a){
//                     first++;
//                     // System.out.println(first+ "th palendromic number is "+ a);   //if you want every palendromic prime then print this line
//                 }
//                 if(first == last){
//                     System.out.println(last+ "th palendromic number is "+ a);   //if you want specific palendromic prime then print this line
//                     break;
//                 }
//             }
//             a++;
//         }   
//     }
// }
// // output:
// // 73th palendromic number is 70607



// ---------------------------------------------------------------

// wap to find 64th prime and twist number 
// wap to find odd elements from an array
// wap to find sum of odd elements from array
// wap to find avg of odd elements from an array  
// wap to find avg of odd and even elements from an array  
