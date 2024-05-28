//date: 18-5-24

//---------------------------------
// wap to shift first character to last

// // method1:
// public class Program11 {
//     public static void main(String[] args) {
//         String s1 = "India";
//         String s2 = "";
//         for(int i = 1; i < s1.length(); i++){
//             s2 += s1.charAt(i);
//         }
//         s2 += s1.charAt(0);
//         System.out.println(s2);
//     }
// }
// // output: ndiaI


// // method2:
// public class Program11 {
//     public static void main(String[] args) {
//         String s1 = "India";
//         StringBuilder sb = new StringBuilder();
//         for(int i = 1; i < s1.length(); i++){
//             sb.append(s1.charAt(i));
//         }
//         sb.append(s1.charAt(0));
//         System.out.println(sb); 
//     }
// }
// // output:ndiaI


// // method 3: you can also use substring method
// public class Program11 {
//     public static void main(String[] args) {
//         String s1 = "India";
//         StringBuilder sb = new StringBuilder(s1.substring(1));
//         sb.append(s1.charAt(0));
//         System.out.println(sb);             
//         // System.out.println(sb.toString());           // you can also convert it into string if you dont want it to be StringBuilder
//     }
// }
// // output: ndiaI


// // method 4 : 
// public class Program11 {
//     public static void main(String[] args) {
//         String s1 = "India";
//         StringBuilder sb = new StringBuilder(s1);
//         char c = sb.charAt(0);
//         sb.deleteCharAt(0);
//         sb.append(c);
//         System.out.println(sb);             
//     }
// }
// // output: ndiaI



//---------------------------------

// // wap a program to shift last character to first
// public class Program11 {
//     public static void main(String[] args) {
//         String s1 = "India";
//         StringBuilder sb = new StringBuilder();
//         sb.append(s1.charAt(s1.length()-1));
//         for(int i = 0; i < s1.length()-1; i++){
//             sb.append(s1.charAt(i));
//         }
//     System.out.println(sb);
//     }
// }
// // output:
// aIndi





// //wap to swap first and last character of string
// public class Program11 {
//     public static void main(String[] args) {
//         String s1 = "India";
//         StringBuilder sb = new StringBuilder();
//         sb.append(s1.charAt(s1.length()-1));
//         sb.append(s1.substring(1, s1.length()-1));
//         sb.append(s1.charAt(0));
//         System.out.println(sb);
//     }
// }
// // output:
// // andiI




// // wap to shift first and last character to the last of the string
// public class Program11 {
//     public static void main(String[] args) {
//         String s1 = "India";
//         StringBuilder sb = new StringBuilder();
//         sb.append(s1.substring(1, s1.length()-1));
//         sb.append(s1.charAt(0));
//         sb.append(s1.charAt(s1.length()-1));
//         System.out.println(sb);
//     }
// }
// // output:
// // ndiIa


// // wap to sort each character from string
// import java.util.Arrays;
// public class Program11 {
//     public static void main(String[] args) {
//         String s1 = "India";
//         char c[] = s1.toCharArray();
//         Arrays.sort(c);
//         String s2 = new String(c);
//         System.out.println(s2);
//     }
// }
// // output:
// // Iadin


//---------------------------------------------------------------

// wap to count vovels from array 

// wap to shift vovels at last

// wap to replace at vovels
// input: international
// output: 1nt2rn3t45n6l

//wap to replace at vovels
// input: international
// output: 6nt5rn4t32n1l


public class Program11 {
    public static void main(String[] args) {
        
    }
    
}