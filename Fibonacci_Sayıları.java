package JavaÖrnekleri;

public class Fibonacci_Sayıları {

    static  int fib (int n){
        if(n==1 || n==2 )
        {
            return 1;


        }
        return fib(n-1) +fib(n-2);
    }

    public static void main(String args[]) {
        // Fibonacci sayilari
        System.out.println( fib(6));

    }

}