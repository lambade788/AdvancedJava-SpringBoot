package day6;

public class JumpStatement {
    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            System.out.println(i);
            if(i==3){
                break;
            }
        }

        for(int j=0;j<6;j++){
            if(j==3){
                continue;
            }
            System.out.println(j);
        }
    }
}
