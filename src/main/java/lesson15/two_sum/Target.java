package lesson15.two_sum;

public class Target {

    public int[] getIndexByTarget (int[] numbers, int target) {
        int[] index = new int[2];
        int bufferNum;

        for (int i = 0; i < numbers.length - 1; i++) {
            bufferNum = numbers[i] + numbers[i + 1];
            if (bufferNum == target) {
                index[0] = i;
                index[1] = i + 1;
            }
        }
        return index;
    }
}
