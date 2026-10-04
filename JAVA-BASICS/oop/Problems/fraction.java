package oop.Problems;

public class fraction {
    static class fractionnum{
        int num;
        int den;

        fractionnum(){

        }

        fractionnum(int num, int den){
            this.num=num;
            this.den=den;
            simplify();
        }

        void print(){
            System.out.println(num +"/"+ den);
        }
        void add(fractionnum f){
            num = (num*f.den)+(f.num*den);
            den = (den*f.den);
            simplify();
        }

        void mul(fractionnum f){
            num = num*f.num;
            den = den*f.den;
            simplify();
        }

        void simplify(){
            boolean isNegative = (num * den < 0) ? true : false;
            num = Math.abs(num);
            den = Math.abs(den);

            int gcd = hcf(num,den);
            num = num/gcd;
            den = den/gcd;
            if (isNegative) num = -num;
        }

        int hcf(int a, int b){
            if(a==0)return b;
            return hcf(b%a,a);
        }
    }
    public static void main(String[] args) {
        fractionnum f1 = new fractionnum(3,5);
        fractionnum f2 = new fractionnum(4,8);
        f1.print();
        f2.print();
        f1.add(f2);
        f1.print();
        f1.mul(f2);
        f1.print();

        fractionnum f3 = new fractionnum(50,100);
        f3.print();
        

        
    }
}
