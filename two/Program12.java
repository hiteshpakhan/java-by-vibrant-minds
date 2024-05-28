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


// public class Program12 {
//     public static void main(String[] args) {
//         String s1 = "Computer";
//         String s2= "AEIOUaeiou";
//         StringBuilder sb = new StringBuilder();
//         StringBuilder vowels = new StringBuilder();
//         for(int i = 0; i < s1.length(); i++){
//             if(!s2.contains(String.valueOf(s1.charAt(i)))){
//                 sb.append(s1.charAt(i));
//             }else{
//                 vowels.append(s1.charAt(i));
//             }
//         }
//         System.out.println(sb);
//         System.out.println(vowels);
//     }
// }
// // output:
// // Cmptr
// // oue





// // wap to shift vovels at last
// public class Program12 {
//     public static void main(String[] args) {
//         String s1 = "Computer";
//         String s2= "AEIOUaeiou";
//         StringBuilder sb = new StringBuilder();
//         StringBuilder vowels = new StringBuilder();
//         for(int i = 0; i < s1.length(); i++){
//             if(!s2.contains(String.valueOf(s1.charAt(i)))){
//                 sb.append(s1.charAt(i));
//             }else{
//                 vowels.append(s1.charAt(i));
//             }
//         }
//         sb.append(vowels);
//         System.out.println(sb);
//     }
// }
// // output:
// // Cmptroue


//---------------------------------------------------------


// wap to replace at vovels
// input: international
// output: 1nt2rn3t45n6l

// public class Program12 {
//     public static void main(String[] args) {
//         String s1 = "International";
//         String s2= "AEIOUaeiou";
//         StringBuilder sb = new StringBuilder();
//         int count = 0;
//         for(int i = 0; i < s1.length(); i++){
//             if(s2.contains(String.valueOf(s1.charAt(i)))){
//                 sb.append(++count);
//             }else{
//                 sb.append(s1.charAt(i));
//             }
//         }
//         System.out.println(sb);
//     }    
// }
// // output:
// // 1nt2rn3t45n6l




// wap to replace at vovels
// input: international
// output: 6nt5rn4t32n1l

// public class Program12 {
//     public static void main(String[] args) {
//         String s1 = "International";
//         String s2= "AEIOUaeiou";
//         StringBuilder sb = new StringBuilder(s1);
//         int count = 0;
//         for(int i = sb.length()-1; i >= 0; i--){
//             if(s2.contains(String.valueOf(s1.charAt(i)))){
//                 sb.deleteCharAt(i);
//                 sb.insert(i, ++count);
//             }
//         }
//         System.out.println(sb);
//     }    
// }
// // output:
// // 6nt5rn4t32n1l





//-------------------------------------------------------------------------------

import java.util.Arrays;

/**
 * Program12
 */
public class Program12 {

    public static void main(String[] args) {
        
        String s1 = "International";
        String s2= "AEIOUaeiou";
        StringBuilder vowels = new StringBuilder();
        StringBuilder cons = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s1.length(); i++){
            if(s2.contains(String.valueOf(s1.charAt(i)))){
                vowels.append(s1.charAt(i));
            }else{
                cons.append(s1.charAt(i));
            }
        }
        Arrays.sort(vowels.toString().toCharArray());
        Arrays.sort(cons.toString().toCharArray());
        sb.append(cons);
        sb.append(vowels);
        System.out.println(sb);
    }
}