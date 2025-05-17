/* public class fib {
    static void Fibonacci(int N)
    {
        int n1 = 0, n2 = 1;

        for (int i = 0; i < N; i++) {
            System.out.print(n1 + " ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }
    public static void main(String args[])
    {
        int N = 10;

        // Function Call
        Fibonacci(N);
    }
}
 */

/* public class fib{
    static void Fibonacci(int n){
        int n1=0,n2=1;
        for(int i =0;i<n;i++){
            System.out.print(n1+" ");
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args) {
        int N=10;
        Fibonacci(N);
    }
} */

public class fib{
    static int Fibo(int n){
        if( n<=1)
            return n;
            return Fibo(n-1) +Fibo(n-2);
        
    }
    public static void main(String args[])
    {
        int N = 10;
        for (int i = 0; i < N; i++) {
            System.out.print(Fibo(i) + " ");
        }
    }
}