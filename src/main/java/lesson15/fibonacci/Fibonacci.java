package lesson15.fibonacci;

public class Fibonacci {

    public int calcNumFibonacci(int number){
        if (number >= 0) {
            if (number <= 1)
                return number;
            else
                return calcNumFibonacci(number - 1) + calcNumFibonacci(number - 2);
        }
        else {
            if (number >= 1) return number;
            else
                return calcNumFibonacci(number + 2) - calcNumFibonacci(number + 1);
        }
    }
}
