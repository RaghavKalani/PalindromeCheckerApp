public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";
<<<<<<< HEAD
        boolean isPalindrome = true;

        for (int i=0; i<input.length()/2; i++) {
            if (input.charAt(i) != input.charAt(input.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
=======
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        if (input.equals(reversed)) {
>>>>>>> feature/UC3
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }
    }
}