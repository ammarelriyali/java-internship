import java.util.Arrays;

/*
Write a Java program to find the sum and average of elements in an array of integers,
each mathematical operation in a single method.
 */
public class SecondTask {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,1,12,54};
        int sum = Arrays.stream(numbers).sum();
        int average = sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
