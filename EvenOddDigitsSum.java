public class EvenOddDigitsSum {
    public static int EvenOddDigitsSum(int input1, String input2) {
        int sum = 0;
        while (input1 > 0) {
            int d = input1 % 10;
            if (input2.equals("even") && d % 2 == 0) sum += d;
            if (input2.equals("odd") && d % 2 != 0) sum += d;
            input1 /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test the method
        int number = 12345;
        System.out.println("Sum of even digits in " + number + ": " + EvenOddDigitsSum(number, "even"));
        System.out.println("Sum of odd digits in " + number + ": " + EvenOddDigitsSum(number, "odd"));
    }
}
