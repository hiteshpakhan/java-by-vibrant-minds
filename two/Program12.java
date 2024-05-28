//date: 20-5-24


// wap to count vovels from array 

// //method1:
// public class Program12 {
//     public static void main(String[] args) {
//         String s1 = "Computer";
//         int count = 0;
//         for(int i = 0; i < s1.length(); i++){
//             if(s1.charAt(i) == 'A' || s1.charAt(i) == 'a' || s1.charAt(i) == 'E' || s1.charAt(i) == 'e' || s1.charAt(i) == 'I' || s1.charAt(i) == 'i' || s1.charAt(i) == 'O' || s1.charAt(i) == 'o' || s1.charAt(i) == 'U' || s1.charAt(i) == 'u'){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
// // output:
// // 3




// //method2:
// public class Program12 {
//     public static void main(String[] args) {
//         String s1 = "Computer";
//         int count = 0;
//         for(int i = 0; i < s1.length(); i++){
//             char c = s1.charAt(i);
//             if(c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u'){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
// // output:
// // 3




// //method3:
// public class Program12 {
//     public static void main(String[] args) {
//         String s1 = "Computer";
//         String s2 = s1.toUpperCase();
//         int count = 0;
//         for(int i = 0; i < s1.length(); i++){
//             char c = s2.charAt(i);
//             if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
// // output:
// // 3




// //method4:  imp
// public class Program12 {
//     public static void main(String[] args) {
//         String s1 = "Computer";
//         String s2 = "AEIOUaeiou";
//         int count = 0;
//         for(int i = 0; i < s1.length(); i++){
//             if(s2.contains(String.valueOf(s1.charAt(i)))){  //here you have to convert it into string because the contains method only work with string and String.valiueOf converts any value into String
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
// // output:
// // 3


// ------------------------------------------------



