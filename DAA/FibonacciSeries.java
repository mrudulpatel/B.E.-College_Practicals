import java.util.Scanner;

class FibonacciSeries {
    public static void main(String args[]) {
        int terms, last = 1, secondLast = 0, current, i;
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of terms in Fibonacci Series");
        terms = in.nextInt();
 
        /*
         *  Nth term = (N-1)th thrm + (N-2)th term;
         */
        for(i = 0; i < terms; i++){
            if(i < 2){
                current = i;
            } else {
                current = last + secondLast;
                secondLast = last;
                last = current;
            }
            System.out.print(current + " ");
        }
    }
}
