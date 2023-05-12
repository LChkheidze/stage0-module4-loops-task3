package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum9 = 0;
        String nines = "";

        for(int i=0; i<lengthOfLastNumber; i++){
            nines += "9";
            sum9 += Integer.valueOf(nines);
        }

        System.out.println(sum9);

    }
}
