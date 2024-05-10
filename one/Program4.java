// date: 11-4-24 & date : 13-4-24 & date: 16-4-24

// int n = 5;
// int count = ((n * (n - 1)) / 2) + 1;
// for(int i = n; i >= 1; i--){
//     int c = count;
//     for(int j=i; j>=1; j--){
//         System.out.print(c + "\t");
//         c++;
//     }
//     System.out.println();
//     count -= i-1;
// }
// 11      12      13      14      15
// 7       8       9       10
// 4       5       6
// 2       3
// 1



// int n = 5;
// int count = 1;
// for(int i = 1; i <= n; i++){
//     for(int j = i; j < n; j++){
//         System.out.print("\t");
//     }
//     for(int j = i; j >= 1; j--){
//         System.out.print(count + "\t");
//         count++;
//     }
//     System.out.println();
// }
//                                 1
//                         2       3
//                 4       5       6
//         7       8       9       10
// 11      12      13      14      15



// int n = 5;
// int count = (n * (n + 1)) / 2;
// for(int i = 1; i <= n; i++){
//     for(int j = i; j < n; j++){
//         System.out.print("\t");
//     }
//     for(int j = i; j >= 1; j--){
//         System.out.print(count + "\t");
//         count--;
//     }
//     System.out.println();
// }
//                                 15
//                         14      13
//                 12      11      10
//         9       8       7       6
// 5       4       3       2       1


// int n = 5;
// int count = 1;
// for(int i = 1; i <= n; i++){
//     int c = count;
//     for(int j = i; j < n; j++){
//         System.out.print("\t");
//     }
//     for(int j = i; j >= 1; j--){
//         System.out.print(c + "\t");
//         c--;
//     }
//     System.out.println();
//     count += i+1;
// }
//                                 1
//                         3       2
//                 6       5       4
//         10      9       8       7
// 15      14      13      12      11



// int n = 5;
// int count = 1;
// for(int i = n; i >= 1; i--){
//     int c = count;
//     for(int j = i; j > 1; j--){
//         System.out.print("\t");
//     }
//     for(int j = n; j >= i; j--){
//         System.out.print(c + "\t");
//         c += j-1;
//     }
//     System.out.println();
//     count++;
// }
//                                 1
//                         2       6
//                 3       7       10
//         4       8       11      13
// 5       9       12      14      15


// int n = 5;
// int count = 5;
// for(int i = n; i >= 1; i--){
//     int c = count;
//     for(int j = i; j > 1; j--){
//         System.out.print("\t");
//     }
//     for(int j = n; j >= i; j--){
//         System.out.print(c + "\t");
//         c += j;
//     }
//     System.out.println();
//     count--;
// }
//                                 5
//                         4       9
//                 3       8       12
//         2       7       11      14
// 1       6       10      13      15



// int n = 5;
// int count = ((n * (n - 1)) / 2) + 1;
// for(int i = n; i >= 1; i--){
//     int c = count;
//     for(int j = i; j > 1; j--){
//         System.out.print("\t");
//     }
//     for(int j = i; j <= n; j++){
//         System.out.print(c + "\t");
//         c += j+1;
//     }
//     System.out.println();
//     count -= i-1;
// }
//                                 11
//                         7       12
//                 4       8       13
//         2       5       9       14
// 1       3       6       10      15





// int n = 5;
// int count = 1;
// for(int i = n; i >= 1; i--){
//     int c = count;
//     for(int j = i; j > 1; j--){
//         System.out.print("\t");
//     }
//     for(int j = i; j <= n; j++){
//         System.out.print(c + "\t");
//         c -= j;
//     }
//     System.out.println();
//     count += i;
// }
//                                 1
//                         6       2
//                 10      7       3
//         13      11      8       4
// 15      14      12      9       5



//-----------------------------------------
// 13-4-24




// int n = 5;
// int count = 1;
// for(int i = 1; i <= n; i++){
//     int c = count;
//     for(int j = i; j > 1; j--){
//         System.out.print("\t");
//     }
//     for(int j = i; j <= n; j++){
//         System.out.print(c + "\t");
//         c += j+1;
//     }
//     System.out.println();
//     count += i;
// }
// 1       3       6       10      15
//         2       5       9       14
//                 4       8       13
//                         7       12
//                                 11




// int n = 5;
// int count = 1;
// for(int i = 1; i <= n; i++){
//     int c = count;
//     for(int j = i; j > 1; j--){
//         System.out.print("\t");
//     }
//     for(int j = i; j <= n; j++){
//         System.out.print((char)(c+64) + "\t");
//         c += j+1;
//     }
//     System.out.println();
//     count += i;
// }
// A       C       F       J       O
//         B       E       I       N
//                 D       H       M
//                         G       L
//                                 K



// int n = 5;
// int count = ((n * (n - 1)) / 2) + 1;
// for(int i = 1; i <= n; i++){
//     int c = count;
//     for(int j = i; j > 1; j--){
//         System.out.print("\t");
//     }
//     for(int j = n; j >= i; j--){
//         System.out.print((char)(c+64) + "\t");
//         c -= j-1;
//     }
//     System.out.println();
//     count++;
// }
// K       G       D       B       A
//         L       H       E       C
//                 M       I       F
//                         N       J
//                                 O



// int n = 5;
// int count = (n * (n + 1)) / 2;
// // int count = 1;
// for(int i = n; i >= 1; i--){
//     int c = count;
//     for(int j = i; j > 1; j--){
//         System.out.print("\t");
//     }
//     for(int j = i; j <= n; j++){
//         System.out.print((char)(c+64) + "\t");
//         c += j;
//     }
//     System.out.println();
//     count-=i;
// }
// O
// J       N
// F       I       M
// C       E       H       L
// A       B       D       G       K






// int n = 5;
// int count = (n * (n + 1)) / 2;
// for(int i = 1; i <= n; i++){
//     int c = count;
//     for(int j = i; j <= n; j++){
//         System.out.print((char)(c+64) + "\t");
//         c -= j;
//     }
//     System.out.println();
//     count-=i+1;
// }
// O       N       L       I       E
// M       K       H       D
// J       G       C
// F       B
// A



// #imp
// int n = 5;
// int count1 = 1;
// int count2 = (n * (n + 1)) / 2;
// for(int i = 1; i <= n; i++){
//     int c2 = count2;
//     for(int j = n; j >= i; j--){
//         System.out.print((char)(count1+64) );
//         System.out.print((char)(c2+96) );
//         System.out.print("\t");
//         count1++;
//         c2 -= j;
//     }
//     System.out.println();
//     count2--;
// }
// Ao      Bj      Cf      Dc      Ea
// Fn      Gi      He      Ib
// Jm      Kh      Ld
// Ml      Ng
// Ok



// int n = 5;
// int count1 = 1;
// int count2 = (n * (n + 1)) / 2;
// for(int i = 1; i <= n; i++){
//     int c1 = count1;
//     int c2 = count2;
//     for(int j = i; j <= n; j++){
//         System.out.print((char)(c1+64) );
//         System.out.print((char)(c2+96) );
//         System.out.print("\t");
//         c1 += j+1;
//         c2 -= j+1;
//     }
//     System.out.println();
//     count1 += i;
//     count2 -= i;
// }
// Ao      Cm      Fj      Jf      Oa
// Bn      Ek      Ig      Nb
// Dl      Hh      Mc
// Gi      Ld
// Ke






// int n = 5;
// int count1 = 1;
// int count2 = (n * (n + 1)) / 2;
// for(int i = n; i >= 1; i--){
//     int c1 = count1;
//     int c2 = count2;
//     for(int j = n, j1 = i; j >= i || j1 <= n; j--, j1++){
//         System.out.print((char)(c1+64) );
//         System.out.print((char)(c2+96) );
//         System.out.print("\t");
//         c1 += j-1;
//         c2 += j1;
//     }
//     System.out.println();
//     count1++;
//     count2 -= i;
// }
// Ao
// Bj      Fn
// Cf      Gi      Jm
// Dc      He      Kh      Ml
// Ea      Ib      Ld      Ng      Ok







// int n = 5;
// int count1 = (n * (n + 1)) / 2;
// int count2 = (n * (n + 1)) / 2;
// for(int i = 1; i <= n; i++){
//     int c1 = count1;
//     int c2 = count2;
//     for(int j = i, j1 = n; j <= n; j++, j1--){
//         System.out.print((char)(c1+64) );
//         System.out.print((char)(c2+64) );
//         System.out.print("\t");
//         c1 -= j;
//         c2 -= j1;
//     }
//     System.out.println();
//     count2--;
//     count1 -= i+1;
// }
// OO      NJ      LF      IC      EA
// MN      KI      HE      DB
// JM      GH      CD
// FL      BG
// AK


//-------------------------
// date: 14-4-24








public class Program4 {
    public static void main(String[] args) {
        int n = 5;
        int count1 = (n * (n + 1)) / 2;
        int count2 = (n * (n + 1)) / 2;
        // int count = 1;
        for(int i = 1; i <= n; i++){
            int c1 = count1;
            int c2 = count2;
            // for(int j = i; j > 1; j--){
            //     System.out.print("\t");
            // }
            for(int j = i, j1 = n; j <= n; j++, j1--){
                System.out.print((char)(c1+64) );
                System.out.print((char)(c2+64) );
                System.out.print("\t");
                // count1++;
                c1 -= j;
                c2 -= j1;
            }
            System.out.println();
            count2--;
            count1 -= i+1;
        }
    }
}


