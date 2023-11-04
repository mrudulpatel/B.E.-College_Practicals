import java.util.Scanner;

class FibonnacciSeriesR {
    public static void main(String args[]) {
        int terms, i;
   
       Scanner in = new Scanner(System.in);
       System.out.println("Enter number of terms  in Fibonacci Series");
       terms = in.nextInt();
 
       for(i = 0; i < terms; i++){
           System.out.print(fibonacci(i) + " ");
       }
    }
  
    public static int fibonacci(int num){
        /* Exit condition of recursion*/
        if(num < 2)
            return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
