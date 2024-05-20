// date : 11-5-24



//------------------------------------
// wap to append sum of their element at front of element
// input: {53,67,12,63,28,467,124,35}
// output: {853,1367,312,963,1028,17467,7124,835}



//------------------------------------
//wap to find greatest element of an array
// input: {53,67,12,63,28,467,124,35}
// output: 467


// class Program5 {
//     public static void main(String[] args) {
//         int largest = 0;
//         int a[] = {53,67,12,63,28,467,124,35};
//         for(int i = 0; i < a.length; i++){
//             if(a[i] > largest){
//                 largest = a[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }
// // output:467



//------------------------------------
//wap to find second highest element of an array
// input: {53,67,12,63,28,467,124,35}
// output: 124


// class Program5 {
//     public static void main(String[] args) {
//         int a[] = {53,67,12,63,28,467,124,35};
//         int max = 0, smax = 0;
//         for(int i = 0; i < a.length; i++){
//             if(max < a[i]){
//                 smax = max;
//                 max = a[i];
//             }else if(smax < a[i]){   
//                 smax = a[i];
//             }
//         }
//         System.out.println("max = " + max);   
//         System.out.println("Second max = " + smax);   
//     }
// }
// // output:
// // max = 467
// // Second max = 124

//but if you have repeteted elements then it might give you same numbers for this you can use this logic in else if block: else if(smax < a[i] && a[i] != max)




//-------------------------------------------

// # homework

//1
// wap to replace elements 
// consider black number which is divisible by 4
// consider white number which contains last digit as 4
// consider gray number which is both black and white 
// replace black number with -1
// replace white number with -2
// replace gray number with -3
//
// input : {34,18,24,16,12,20,32,44,15,41}
// output : {}



//----------------------------------------

//2
// wap to replace elements 
// consider strong num,ber which is divisible by 4
// consider weak number which is divisible by 6
// consider healthy number which is both
// replace strong number with -1 
// replace weak number with -2
// replace healthy number with -3 
//
// input: {15,16,18,28,38,24,32,30,42,36}
// output: {}