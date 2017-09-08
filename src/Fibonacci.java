public class Fibonacci {

    public static int fib(int liczban) {
        if ((liczban == 1) || (liczban == 2))
            return 1;
            System.out.println("liczban:" + liczban);
        else{
            return fib(liczban - 1) + fib(liczban - 2);
            System.out.println("liczban:" + liczban);
        }
    }
}
