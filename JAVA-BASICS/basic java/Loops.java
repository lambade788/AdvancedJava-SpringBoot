import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        for(int i=0; i<=10; i++){
//            System.out.println("HELLO WORLD");
//        }

//--------------Print the number 0 to 10------------
//     for(int i=0; i<=10; i++){
//         System.out.println(i);
//         System.out.print(i+" ");
//     }

//----------------while loop----------------
//      int i=0;
//      while(i<=100){
//          System.out.println(i);
//          i++;
//      }

//----------------do while-------------------
//       int i=1;
//       do{
//           System.out.println(i);
//           i++;
//       }
//       while(i<=50);

//--------Q1-Print the sum of n natural numbers.--------------
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number:");
//        int n=sc.nextInt();

//        int sum=0;
//        for(int i=1;i<=n;i++){
//            sum+=i;
//        }
//        System.out.println(sum);

//--------Q2-print the table of number input by the user--------
//        for(int i=1;i<=10;i++){
//           int mul=n*i;
//           System.out.println(mul);
//        }


Scanner input = new Scanner (System.in);

while(true) {
    int n = input.nextInt();
    int m = input.nextInt();

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            System.out.println("Hello");
        }
    }
}

























    }
}
