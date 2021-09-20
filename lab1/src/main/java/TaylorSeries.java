public class TaylorSeries { //zachariah friesen 100783192

    static double approximateExp(int x, int n){
        double retval = 0; //value that will be returned
        while (n >= 0){ // while loop xddd
            Double power = new Double(pow(x,n)); //power and factorial are made into individual variables for ease of use
            Double fact = new Double(factorial(n));
            retval = retval + (power / fact); //calculation
            n--;
        }
        return retval;
    }
    static int pow(int x, int n){ //calculates power
        if (n == 0){
            return 1;
        }else{
            return x * pow(x, n-1);
        }
    }
    static int factorial(int n){ //calculates factorial
        if (n > 0) {
            return n * factorial(n - 1);
        }else{
            return 1;
        }
    }
}
