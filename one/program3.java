// date: 5-4-24 & 8-4-24 & 10-4-24

// int n = 5;
// for(int i = 1; i<=n; i++){
//     for(int j = i; j<n; j++){
//         System.out.print(" ");
//     }
//     for(int j = i; j>=1; j--){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//     *
//    **
//   ***
//  ****
// *****



// int n = 5;
// for(int i = n; i>=1; i--){
//     for(int j = i; j>1; j--){
//         System.out.print(" ");
//     }
//     for(int j = i; j<=n; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//     *
//    **
//   ***
//  ****
// *****




// int n = 5;
// for(int i = 1; i<=n; i++){
//     for(int j = i; j>1; j--){
//         System.out.print(" ");
//     }
//     for(int j = i; j<=n; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// *****
//  ****
//   ***
//    **
//     *



// int n = 5;
// for(int i = n; i>=1; i--){
//     for(int j = i; j<5; j++){
//         System.out.print(" ");
//     }
//     for(int j = i; j>=1; j--){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// *****
//  ****
//   ***
//    **
//     *



// int n = 5;
// for(int i = n; i>=1; i--){
//     for(int j = i; j<5; j++){
//         System.out.print(" ");
//     }
//     for(int j = i; j>=1; j--){
//         System.out.print((char)(j+64));
//     }
//     System.out.println();
// }
// EDCBA
//  DCBA
//   CBA
//    BA
//     A



// int n = 5;
// for(int i = 1; i<=n; i++){
//     for(int j = i; j>1; j--){
//         System.out.print(" ");
//     }
//     for(int j = n; j>=i; j--){
//         System.out.print((char)(j+64));
//     }
//     System.out.println();
// }
// EDCBA
//  EDCB
//   EDC
//    ED
//     E



// int n = 5;
// for(int i = 1; i<=n; i++){
//     for(int j = i; j<5; j++){
//         System.out.print(" ");
//     }
//     for(int j = 1; j<=i; j++){
//         System.out.print((char)(j+96));
//     }
//     System.out.println();
// }
//     a
//    ab
//   abc
//  abcd
// abcde



// int n = 5;
// for(int i = n; i>=1; i--){
//     for(int j = i; j>1; j--){
//         System.out.print(" ");
//     }
//     for(int j = i; j<=n; j++){
//         System.out.print((char)(j+64));
//     }
//     System.out.println();
// }
//     E
//    DE
//   CDE
//  BCDE
// ABCDE



// int n = 5;
// for(int i = n; i>=1; i--){
//     for(int j = i; j>1; j--){
//         System.out.print(" ");
//     }
//     for(int j = i; j<=n; j++){
//         System.out.print((char)(i+96));
//     }
//     System.out.println();
// }
//     e
//    dd
//   ccc
//  bbbb
// aaaaa





// -----------------------------------
// date: 8-4-24




// int n = 5;
// int count = 1;
// for(int i = n; i>=1; i--){
//     for(int j = i; j<=n; j++){
//         System.out.print(count++ + "\t");
//     }
//     System.out.println();
// }
// 1
// 2       3
// 4       5       6
// 7       8       9       10
// 11      12      13      14      15






// int n = 5;
// int count = (n * (n + 1)) / 2;
// for(int i = 1; i<=n; i++){
//     for(int j = i; j>=1; j--){
//         System.out.print(count + "\t");
//         count--;
//     }
//     System.out.println();
// }
// 15
// 14      13
// 12      11      10
// 9       8       7       6
// 5       4       3       2       1




// int n = 5;
// int count = 1;
// for(int i = 1; i <= n; i++){
//     int c = count;  
//     for(int j = i; j >= 1; j--){  
//         System.out.print(c + "\t"); 
//         c--;
//     }
//     System.out.println();
//     count += i+1;   
// }
// 1
// 3       2
// 6       5       4
// 10      9       8       7
// 15      14      13      12      11


// // with my logic
// int n = 5;
// int count = 0;
// int c = 0;
// for(int i = 1; i <= n; i++){    
//         count = count + i;  
//         for(int j = count; j > c; j--){  
//             System.out.print(j + "\t");
//         }
//         System.out.println();
//         c = count;
// }
// 1
// 3       2
// 6       5       4
// 10      9       8       7
// 15      14      13      12      11



// int n = 5;
// int count = (n * (n +1)) / 2;
// for(int i = 1; i <= n; i++){    
//         int c = count;  
//         for(int j = i; j >= 1; j--){  
//             System.out.print(c + "\t");
//             c++;
//         }
//         System.out.println();
//         count -= i+1;
// }
// 15
// 13      14
// 10      11      12
// 6       7       8       9
// 1       2       3       4       5





// int n = 5;
// int count = (n * (n +1)) / 2;
// for(int i = 1; i <= n; i++){ 
//     int c = count;  
//     for(int j = i; j >= 1; j--){  
//         System.out.print(c + "\t"); 
//         c++;
//     }
//     System.out.println();
//     count -= i+1;
// }
// 15
// 13      14
// 10      11      12
// 6       7       8       9
// 1       2       3       4       5





// int n = 5;
// int count = 1;
// for(int i = n; i >= 1; i--){ 
//     int c = count;  
//     for(int j = n; j >= i; j--){  
//         System.out.print(c + "\t"); 
//         c += j-1 ;
//     }
//     System.out.println();
//     count++;
// }
// 1
// 2       6
// 3       7       10
// 4       8       11      13
// 5       9       12      14      15



// int n = 5;
// int count = 5;
// for(int i = n; i >= 1; i--){ 
//     int c = count;  
//     for(int j = n; j >= i; j--){  
//         System.out.print(c + "\t"); 
//         c += j ;
//     }
//     System.out.println();
//     count--;
// }
// 5
// 4       9
// 3       8       12
// 2       7       11      14
// 1       6       10      13      15



// 15
// 14  10  
// 13  9   6   
// 12  8   5   3
// 11  7   4   2   1

// 11
// 12  7   
// 13  8   4
// 14  9   5  2
// 15  10  6  3  1



// -----------------------------------
// date: 10-4-24


// int n = 5;
// int count = (n * (n + 1)) / 2;
// for(int i = 1; i <= n; i++){ 
//     for(int j = i; j >= 1; j--){  
//         System.out.print(count + "\t"); 
//         count--;
//     }
//     System.out.println();
// }
// 15
// 14      13
// 12      11      10
// 9       8       7       6
// 5       4       3       2       1



// int n = 5;
// int count = 1;
// for(int i = 1; i <= n; i++){ 
//     int c = count;
//     for(int j = i; j >= 1; j--){  
//         System.out.print(c + "\t"); 
//         c--;
//     }
//     System.out.println();
//     count+=i+1;
// }
// 1
// 3       2
// 6       5       4
// 10      9       8       7
// 15      14      13      12      11




// int n = 5;
// int count = (n * (n + 1)) / 2;  
// for(int i = 1; i <= n; i++){ 
//     int c = count;
//     for(int j = i; j >= 1; j--){  
//         System.out.print(c + "\t"); 
//         c++;
//     }
//     System.out.println();
//     count -= i+1;
// }
// 15
// 13      14
// 10      11      12
// 6       7       8       9
// 1       2       3       4       5



// int n = 5; 
// int count = 1; 
// for(int i = n; i >= 1; i--){ 
//     int c = count;
//     for(int j = n; j >= i; j--){  
//         System.out.print(c + "\t"); 
//         c += j-1;
//     }
//     System.out.println();
//     count++;
// }
// 1
// 2       6
// 3       7       10
// 4       8       11      13
// 5       9       12      14      15


// int n = 5;
// int count = n; 
// for(int i = n; i >= 1; i--){ 
//     int c = count;
//     for(int j = n; j >= i; j--){  
//         System.out.print(c + "\t"); 
//         c += j;
//     }
//     System.out.println();
//     count--;
// }
// 5
// 4       9
// 3       8       12
// 2       7       11      14
// 1       6       10      13      15



// int n = 5;
// int count = (n * (n + 1)) / 2;
// for(int i = n; i >= 1; i--){ 
//     int c = count;
//     for(int j = n; j >= i; j--){  
//         System.out.print(c + "\t"); 
//         c -= j-1;
//     }
//     System.out.println();
//     count--;
// }
// 15
// 14      10
// 13      9       6
// 12      8       5       3
// 11      7       4       2       1



// int n = 5;
// int count = ((n * (n + 1)) / 2) - n+1; 
// //or
// // int count = ((n * (n - 1)) / 2) + 1; 
// for(int i = n; i >= 1; i--){ 
//     int c = count;
//     for(int j = n; j >= i; j--){  
//         System.out.print(c + "\t"); 
//         c -= j;
//     }
//     System.out.println();
//     count++;
// }
// 11
// 12      7
// 13      8       4
// 14      9       5       2
// 15      10      6       3       1



// int n = 5;
// int count = 1;
// for(int i = n; i >= 1; i--){ 
//     int c = count;
//     for(int j = i; j <= n; j++){  
//         System.out.print(c + "\t"); 
//         c -= j;
//     }
//     System.out.println();
//     count+=i;
// }
// 1
// 6       2
// 10      7       3
// 13      11      8       4
// 15      14      12      9       5


// int n = 5;
// int count = n;
// for(int i = n; i >= 1; i--){ 
//     int c = count;
//     for(int j = i; j <= n; j++){  
//         System.out.print(c + "\t"); 
//         c -= j+1;
//     }
//     System.out.println();
//     count+=i-1;
// }
// 5
// 9       4
// 12      8       3
// 14      11      7       2
// 15      13      10      6       1





// int n = 5;
// int count = (n * (n + 1)) / 2; 
// for(int i = n; i >= 1; i--){ 
//     int c = count;
//     for(int j = i; j <= n; j++){  
//         System.out.print(c + "\t"); 
//         c += j;
//     }
//     System.out.println();
//     count-=i;
// }
// 15
// 10      14
// 6       9       13
// 3       5       8       12
// 1       2       4       7       11







public class program3 {
    public static void main(String[] args) {
        int n = 5;
        int count = (n * (n + 1)) / 2; 
        // int count = n;
        for(int i = n; i >= 1; i--){ 
            int c = count;
            for(int j = i; j <= n; j++){  
                System.out.print(c + "\t"); 
                c += j;
            }
            System.out.println();
            count-=i;
        }
    }
}