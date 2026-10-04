public class Patterns {
    public static void main(String[] args) {
//        Print the Patterns
//----------------RECTANGLE----------------
//        int n=4;
//        int m=5;
// Nested loop
//        //outer loop
//        for(int i=1;i<=n;i++){
//            //inner loop
//            for(int j=1; j<=m; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//----------------Hollow Rectangle----------------

        // int n=4;
//        int m=5;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                if(i==1||j==1||i==n||j==m){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//----------------Half pyramid---------------------
//        int n=5;

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//----------------inverted half pyramid-------
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

//----------------inverted half pyramid(rotated by 180 deg)-------
//        for (int i = 1; i <= n; i++) {
//
//            // 1. Inner loop for spaces: prints (n - i) spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//
//            // 2. Inner loop for stars: prints (i) stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            // Move to next line
//            System.out.println();
//        }


//-------------------Half pyramid with numbers-------------
//           for(int i=1;i<=n;i++){
//               for(int j=1;j<=i;j++){
//                   System.out.print(j+" ");
//               }
//               System.out.println();
//           }

//-----------------inverted Half pyramid with numbers-------------
//           for(int i=n; i>=1; i--){
//               for(int j=1; j<=i; j++){
//                   System.out.print(j+" ");
//               }
//               System.out.println();
//           }
//----------------Floyd's Triangle-----------------
//        int number=1;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++ ){
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }

//----------------0-1 Triangle---------------------
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                int sum=i+j;
//                if(sum%2==0){
//                    System.out.print("1"+" ");
//                }else{
//                    System.out.print("0"+" ");
//                }
//            }
//            System.out.println();
//        }




//Practice

//        1.rectangle
//        int a=4;
//        int b=5;
//
//        for(int i=1; i<=a; i++){
//            for(int j=1; j<=b; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//       2.Hollow rectangle
//        int k=5;
//        for(int i=1; i<=k; i++){
//            for(int j=1; j<=k; j++){
//                if(i==1 || j==1 || i==k || j==k){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        3.half pyramid
//        int n=5                                                             ;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//            4.inverted half pyramid

//        for(int i=n; i>=1; i--){
//            for(int j=i; j>=1; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        5.inverrted half pyramid 180 deg

//        for(int i=1;i<=n;i++){
//            //inner loop ->space
//            for(int j=1; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            //inner loop-> for*
//            for(int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Half pyramid with numbers

//        for(int i=1;i<=n;i++){
//            for(int j=1; j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


//        inverted Half pyramid with numbers

//        for(int i=n;i>=1;i--){
//            for(int j=1; j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        Flyod's triangle
//        int number=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1; j<=i;j++){
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }

//        0-1  triangle

//        for(int i=1;i<=n;i++){
//            for(int j=1; j<=i;j++){
//                int sum=i+j;
//                if(sum%2 == 0){
//                    System.out.print("1"+" ");
//                }else{
//                    System.out.print("0"+" ");
//                }
//            }
//            System.out.println();
//        }


//Advanced Patterns
//1.rohmbous
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=5;j++) {
//                System.out.print("*");
//
//            }
//                System.out.println();
//        }

//2.hollow rohmbous
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            // 1. Print leading spaces to tilt the shape
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//
//            // 2. Print the stars for the hollow square
//            for (int j = 1; j <= n; j++) {
//                // Print '*' if it's the first/last row or first/last column
//                if (i == 1 || i == n || j == 1 || j == n) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//
//            // 3. Move to the next line
//            System.out.println();
//        }

//3.butterfly
//        int n=4;
//     upper part
//        part1
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//
//            int space=2*(n-i);
//            for(int j=1; j<=space; j++){
//                System.out.print(" ");
//            }
//          part2
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//lower part
//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//
//            int space=2*(n-i);
//            for(int j=1; j<=space; j++){
//                System.out.print(" ");
//            }
////            part2
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }



















    }
}
