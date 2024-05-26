// date: 16-5-24


// create a program where you have to create the new array which contains the difference between previous array like following
// input:   {14,17,6,23,20,15,24,18,11}
// output:  {3,11,17,3,5,9,6,7}

// import java.util.Arrays;
// public class Program9 {
//     public static void main(String[] args) {
//         int a[] = {14,17,6,23,20,15,24,18,11};
//         int b[] = new int[a.length-1];
//         for(int i = 0; i < (a.length - 1); i++){
//             int ans = a[i]-a[i+1];
//             b[i] = Math.abs(ans);   //math.abs will convert it into positive    //but if you dont want to use the math.abs method then you can use this: (ans<0)?-ans:ans
//         }
//         System.out.println(Arrays.toString(b));
//     }
// }
// // output:
// // [3, 11, 17, 3, 5, 9, 6, 7]


//-------------------------------------------------


// wap when you have given the array of numbers and you have key number and you have to find out that sum of which 2 elements is same as the key

// public class Program9 {
//     public static void main(String[] args) {
//         int a[] = {14,17,6,23,20,15,24,18,11,2};
//         int key = 26;
//         for(int i = 0; i < a.length-1; i++){
    //             for(int j = i+1; j < a.length; j++){
        //                 if(key == a[i]+a[j]){
//                     System.out.println(a[i]+" \t "+a[j]);
//                 }
//             }
//         }
//     }
// }
// // output: 
// // 6     20
// // 15    11
// // 24    2


//-------------------------------------------------


// wap when you have given the array of numbers and you have key number and you have to find out that sum of which 3 elements is same as the key

// public class Program9 {
//     public static void main(String[] args) {
//         int a[] = {14,17,6,23,20,15,24,18,11,2,9,22,12,4,28,10};
//         int key = 37;
//         for(int i = 0; i < a.length-2; i++){
//             for(int j = i+1; j < a.length-1; j++){
//                 for(int k=j+1; k<a.length; k++){
//                     if(key == a[i]+a[j]+a[k]){
//                         System.out.println(a[i]+"\t"+a[j]+"\t"+a[k]);
//                     }
//                 }
//             }
//         }
//     }
// }
// // output:
// // 14      17      6
// // 14      11      12
// // 17      18      2
// // 17      11      9
// // 6       20      11
// // 6       9       22
// // 23      2       12
// // 23      4       10
// // 20      15      2
// // 15      18      4
// // 15      12      10
// // 24      11      2
// // 24      9       4
// // 18      9       10
// // 11      22      4



//-------------------------------------------------


// wap where you will attached the numbers to to there last in assending order
// input: {16,36,58,27,81,68,34,61,82,76,4,3,87,12,3,649,86}
// output: {161,362,583,274,815,686,347,618,829,7610,411,312,8713,1214,315,64916,8617}

// import java.util.Arrays;
// public class Program9 {
//     public static void main(String[] args) {
//         int a[] = {16,36,58,27,81,68,34,61,82,76,4,3,87,12,3,649,86};
//         int count = 1;
//         for(int i = 0; i<a.length; i++){
//             int length = 0;
//             int n = count;
//             while(n!=0){
//                 length++;
//                 n/=10;
//             }
//             a[i]*=Math.pow(10, length);
//             a[i]+=count++;
//         }
//         System.out.println(Arrays.toString(a));
//     }
// }
// // output:
// // [161, 362, 583, 274, 815, 686, 347, 618, 829, 7610, 411, 312, 8713, 1214, 315, 64916, 8617]


//-------------------------------------------------


// homework

//1
// input: {10,61,31,42,0,22,2,63,4,32,8,3,94,7,39,47}
// output: {1016,6115,3114,4213,012,2211,210,639,48,327,86,35,944,73,392,471}

//2
// input: {10,61,31,42,0,22,2,63,4,32,8,3,94,7,39,47}
// output: {1610,1561,1431,1342,120,1122,102,963,84,732,68,53,494,37,239,147}


// 3    //numbers that have less difference
// input: {10,6,13,14,18,21,22,28,16,19,2,26,23}
// output:  
// 13  14
// 18  19
// 21  22
// 22  23


// 4 this was asked by rsl
// input: {4,8,2}   ans:3
// {4,8,2,1,0}     ans: 6
// {7,2,3}     ans: 3
// {6,4,1}     ans: -1
// {4,4,4}     ans: 0


//# imp: https://www.w3resource.com/java-exercises/array/index.php


