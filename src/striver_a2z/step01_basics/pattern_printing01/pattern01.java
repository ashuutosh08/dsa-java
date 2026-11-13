package striver_a2z.step01_basics.pattern_printing01;

public class pattern01 {

// pattern 1: Square of stars
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // Rule - n rows, n stars per row

    static void pattern1(int n){
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < n; j++ ){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

// pattern 2:
    //    *
    //    **
    //    ***
    //    ****
    //    *****
    //    Rule - n rows, n no. of stars

    static void pattern2(int n){
        for (int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }System.out.println();
        }
    }


// pattern 3:
//    1
//    12
//    123
//    1234
//    12345
//    Rule - n row , count till n

    static void pattern3(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


// pattern 4:
//    1
//    22
//    333
//    4444
//    55555
//    Rule - n row, n times n
    static void pattern4(int n ){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

// pattern 5:
//    *****
//    ****
//    ***
//    **
//    *
//    Rule - n row, n-row+1 times star
    static void pattern5(int n){
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

// pattern 6:
//    12345
//    1234
//    123
//    12
//    1
//    Rule - n row, n-row+1 column
    static void pattern6(int n){
        for(int i = 0; i < n; i ++){
            for(int j = 1; j < n-i+1; j++){
                System.out.print(j+  " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        pattern1(3);
        pattern2(9);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);







    }

}
