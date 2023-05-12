package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 1;

        if(first % second == 0){
            gcd = second;
        }else if(second % first == 0){
            gcd = first;
        }else{
            for(int i=2;i<=Math.min(first, second); i++){
                if(first % i == 0 && second % i == 0){
                    gcd = i;
                }
            }
        }

        System.out.println(gcd);
    }
}
