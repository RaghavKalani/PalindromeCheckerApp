import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        boolean isPalindrome = checkPalindrome(normalized);

        if (isPalindrome) {
            System.out.println("The given string is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }
        sc.close();
    }

    public static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}