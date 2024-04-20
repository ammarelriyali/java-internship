/*
Write a Java program to find the first occurrence of a specific number in an array
using a for loop and break statement. However, if the position of the first occurrence
is less than 5, skip it and continue searching for the next occurrence.
*/
public class FirstTask {
    public static void main(String[] args) {
        findSpecificNumberInArrayAndPrintPositions(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9);
    }
    static  void findSpecificNumberInArrayAndPrintPositions(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                if (i < 5) {
                    continue;
                } else {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
