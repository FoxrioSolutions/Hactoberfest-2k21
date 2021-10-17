import java.util.Scanner;

public class FiboRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Fibonacci Series");
            System.out.println("2. Nth Fibonacci Series Number");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the first nth number till which u want to print series");
                    int k = sc.nextInt();
                    fiboseries(k);
                    break;
                case 2:
                    System.out.println("Enter the Nth fibonacci series number you want");
                    int n = sc.nextInt();
                    System.out.println(fibo(n));
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("OOps!!! You Entered an invalid choice");
            }
        }
    }
    static int fibo(int n){
       if(n<2){
           return n;
       }
       return fibo(n-1) + fibo(n-2);
    }
    static void fiboseries(int n){
        int a=0,b=1,c;
        System.out.print(a+" "+b);
        while (n-1!=0) {
            c = a + b;
            a = b;
            b = c;
            n--;
            System.out.print(" "+c);
        }
        System.out.println();
    }
}
