package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        for(int i=0;i<lastFibonacci;i++){
            System.out.println(fib(i));
        }
    }

    public int fib(int nth){
        if(nth == 0){
            return 0;
        }

        return (nth == 1 || nth == 2)? 1 : fib(nth-2) + fib(nth-1);
    }
}
