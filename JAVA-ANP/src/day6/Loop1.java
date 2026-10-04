package day6;

public class Loop1 {
    public static void main(String[] args) {
        //for loop ,while loop ,do while

        //for loop
        for(int i=0;i<=20;i++){
            if(i%2==0) {
                System.out.println(i);
            }
        }

        //while loop
        int a = 1;
        while(a<=20){
            System.out.println(a);
            a++;
        }

        //do while
        int b=1;
        do{
            System.out.println(b);
            b++;
        }
        while (b<=20);

    }
}
