public class Driver{
  public static void main(String[] args){
    System.out.println((fib(Integer.parseInt(args[0]))));
    //fib(Integer.parseInt(args[0]));
  }
  public static int fib(int n){
    if (n < 2) return n;
    return fib(n-1) + fib(n-2);
  }
  // n = 46 for 7 seconds
  // n = 46 to not overflow
}
