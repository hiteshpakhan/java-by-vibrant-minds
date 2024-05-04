// Looping structure //date:1-4-24

// for example:
        //it will prient 20 times
        // for(int i = 1; i <= 20; i++){
        //     System.out.println("hello will be prient 20 times");
        // }

/*  -in java looping structure is a block of statement which can be used to execute redudence statement 
    - due to looping structure we dont have to write redudente statements
    -by looping structure we can remove code complexcity
    -types of looping structure: while loop, do while loop, for loop, and switch statement

    1) while loop:
        -tocreate while loop we require while keyword
        -syntax:
            while(condition){
                //statement
            }
        -to execute while loop it requires boolean true value
        -to make a condition we can use relational and logiucal operators
        -while loop checks condition at begining hence it is considers as an entry control loop 

*/



// int a = 1;
// while (a<10) {
//     System.out.println(a++);
// }


// int a = 10;
// while (a>=1) {
// System.out.print(a--);
// }

// int a = 10;
// while (a>=1) {
// System.out.print(a);
// a+=2;
// }

// ----------------------

/* 

    2) do while loop
        -for this we use do and while keywords 
        -syntax:
            do{
                //statements;
            }while(condition)
        -to execute do while loop it requires boolean true value
        -to make a condition we can use relational and logical operator
        -do while loop checks condition at the end hence it  is consiuder as exit control loop 
        -it will execute itselef at least once because it checks condition at last
        -do while loop mostely used in manu driven application
 */


// int a = 1;
// do{
//     System.out.println(a++);
// }while(a<=10);


// ---------------------------------
//instant , static , and local we have this three types of variable inside java 
// and remember that java does not have gloable variable concept

/* date : 2-4-24
    2) for loop
        -to create for loop we can use the for keyword
        -syntax:
            for(initialization; condition; increment / decrement){structure}
        -iniatialization phase :
            -in initialization phase number can be initialized
            -here assignnment and unary operator can be used
            -here declared variable also called as local variable
            -this phase executes once at the begining
        -condition statement:
            -it requires boolean true value
            -to make a condition we can use relational or logical condition  
            -this phase executes every time at begining
        -increment/decrement phase
            -this phase can be used to make operation or operand
            -here unary or assignment operator can be used
            -this phase executes every time at last
 */



// for(int j=1; j<=5; j++){
//     for(int i=1; i<=5; i++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// *****
// *****
// *****
// *****
// *****
 



// for(int j=1; j<=5; j++){
//     for(int i=1; i<=5; i++){
//         System.out.print("*");
//     }
//     System.out.print("\t"); //here "\t means tab space"
//     for(int i=1; i<=5; i++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// *****   *****
// *****   *****
// *****   *****
// *****   *****
// *****   *****



// for(int i=1; i<=5; i++){
//     for(int j=1; j<=5; j++){
//         System.out.print(j);
//     }       
// System.out.println();
// }
// 12345
// 12345
// 12345
// 12345
// 12345


// for(int i=1; i<=5; i++){
//     for(int j=1; j<=5; j++){
//         System.out.print(i);
//     }       
// System.out.println();
// }
// 11111
// 22222
// 33333
// 44444
// 55555


// for(int i=5; i>=1; i--){
//     for(int j=1; j<=5; j++){
//         System.out.print(i);
//     }       
// System.out.println();
// }
// 55555
// 44444
// 33333
// 22222
// 11111

// for(int i=1; i<=5; i++){
//     for(int j=5; j>=1; j--){
//         System.out.print(j);
//     }       
// System.out.println();
// }
// 54321
// 54321
// 54321
// 54321
// 54321


// for(int i=1; i<=5; i++){
//     for(int j=5; j>=1; j--){
//         System.out.print((char)(j+64));
//     }       
// System.out.println();
// }
// EDCBA
// EDCBA
// EDCBA
// EDCBA
// EDCBA



// for(int i=1; i<=5; i++){
//     for(int j=5; j>=1; j--){
//         System.out.print((char)(j+96));
//     }       
// System.out.println();
// }
// edcba
// edcba
// edcba
// edcba
// edcba



// for(int i=1; i<=5; i++){
//     for(int j=1; j<=5; j++){
//         System.out.print((char)(i+64));
//     }       
// System.out.println();
// }
// AAAAA
// BBBBB
// CCCCC
// DDDDD
// EEEEE



// for(int i=1; i<=5; i++){
//     for(int j=1; j<=5; j++){
//         System.out.print((char)(j+64));
//     }       
// System.out.println();
// }
// ABCDE
// ABCDE
// ABCDE
// ABCDE
// ABCDE



class Program1{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print((char)(j+64));
            }       
        System.out.println();
        }
    }
}
