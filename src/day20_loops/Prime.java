package day20_loops;

public class Prime {
    /*
    [IQ] Prime number

        Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

        Ex:
            Input:
                11

            Output:
                prime


        Ex:
            Input:
                10

            Output:
                not prime
     */
    public static void main(String[] args) {

        int n = 1;
        boolean isPrime = true;

        if(n < 2){
            System.out.println("Not Prime");
            System.exit(0); // stop the program
        }

        for(int i = 2; i < n; i++){ // start from 2 because we don't check divisibility of 0 or 1 and we want to check until the number which is done with i < n

            if(n % i == 0){
                isPrime = false;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");



    }
}

/*
 if(n % i == 0){
       11 % 2
       11 % 3
       11 % 4
       ..
       11

 */
