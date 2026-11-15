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

// pattern 7:
//    *
//   ***
//  *****
// *******
//*********
//    Rule - n-i+1(space) - 2*i+1(star) - n-i+1(space): 3 loops- 1(space), 2(star), 3(space)

    static void pattern7(int n){
        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }

            //star
            for(int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }

            //space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

// pattern 8:
// *********
//  *******
//   *****
//    ***
//     *
//    Rule - n row, n spaces and 2n-(2*i + 1) stars
    static void pattern8(int n){
        for(int i = 0; i < n; i++){
//          space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
//          star
            for(int j = 0; j < 2*(n-i)-1; j++){
                System.out.print("*");
            }
//          space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

// pattern 9:
//    *
//   ***
//  *****
// *******
//*********
//*********
// *******
//  *****
//   ***
//    *
//    Rule - merge the both above function

    static void pattern9(int n){
        for(int i = 0; i < n; i++){
//            space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
//            star
            for(int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }
//            space
            for(int j = 0; j < n-i-1; j++ ){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 1; i < n; i++ ){
//            space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
//            star
            for(int j = 0; j < 2*(n-i)-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

// pattern 10:
//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
//    Rule -
    static void pattern10(int n){
        for(int i = 1; i <= 2*n-1; i++){
            int star = i;
            if(i > n) star = 2*n-i;
            for(int j = 1; j <= star; j++){
                System.out.print("*");
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
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);







    }

}
