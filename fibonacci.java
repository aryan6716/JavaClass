// public class fibonacci {
//     public static int fib(int n) {
//         if (n == 0 || n == 1) { // base case
//             return n;
//         }
//         int fnm1 = fib(n - 1);
//         int fnm2 = fib(n - 2);
//         int fn = fnm1 + fnm2;
//         return fn;

//         // or
//         // if(n == 0 || n == 1) return n;
//         // return fib(n-1) + fib(n-2);

//     }

//     public static void main(String args[]) {
//         int n = 5;
//         System.out.print(fib(n));
//     }
// }

public class fibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        int n = 5;

        System.out.print("Fibonacci series up to " + n + ": ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
