import java.util.*;

public class PalindromeCheckerApp {
    public static boolean reverseMethod(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean twoPointerMethod(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Performance Comparison:");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        long start3 = System.nanoTime();
        boolean result3 = twoPointerMethod(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("\nResults:");
        System.out.println("Reverse Method: " + result1 +
                "\nTime: " + time1 + " ms\n\n");

        System.out.println("Stack Method: " + result2 +
                "\nTime: " + time2 + " ms\n\n");

        System.out.println("Two Pointer Method: " + result3 +
                "\nTime: " + time3 + " ms");

        scanner.close();
    }
}