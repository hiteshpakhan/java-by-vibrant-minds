//date: 3-4-24

// always remember that in java the classname shoud be equal to the file name


        // 
        // for(int i = 5; i>=1; i--){
        //     for(int j = 1; j<=5; j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }


        // 5 stars in column of 5 rows of 5 columns of 5 rows
        // int n = 5; 
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n; j++){
        //         for(int k = 1; k <= n; k++){
        //             for(int l = 1; l <= n; l++){
        //                 System.out.print("*");
        //             }
        //             System.out.print(" ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }
        // ***** ***** ***** ***** ***** 
        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** ***** 

        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****

        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** ***** 
        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****

        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****

        // ***** ***** ***** ***** ***** 
        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****
        // ***** ***** ***** ***** *****


        //trangle
        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = i; j>=1; j--){
        //        System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // *
        // **
        // ***
        // ****
        // *****



        // // 
        // int n = 5;
        // for(int i = n; i>=1; i--){
        //     for(int j = i; j<=n; j++){
        //        System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // *
        // **
        // ***
        // ****
        // *****



        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = i; j<=n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // *****
        // ****
        // ***
        // **
        // *


        
        // int n = 5;
        // for(int i=n; i>=1; i--){
        //     for(int j=i; j>=1; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // *****
        // ****
        // ***
        // **
        // *



        // int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j = i; j >= 1; j--){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        // 1
        // 22
        // 333
        // 4444
        // 55555



        // int n = 5;
        // for(int i=n; i>=1; i--){
        //     for(int j=i; j<=n; j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        // 5
        // 44
        // 333
        // 2222
        // 11111


        // 11111
        // 2222
        // 333
        // 44
        // 5




        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // 1
        // 12
        // 123
        // 1234
        // 55555 




        // 1
        // 21
        // 321
        // 4321
        // 54321

class program1{
    public static void main(String args[]){
        int n = 5; 
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                for(int k = 1; k <= n; k++){
                    for(int l = 1; l <= n; l++){
                        System.out.print("*");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}