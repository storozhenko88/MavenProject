package two_sum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Target target = new Target();

        int[] numbers = {2,7,11,15};

        System.out.println(Arrays.toString(target.getIndexByTarget(numbers, 18)));
    }
}
