public class Palindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\s+", "").toLowerCase();
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
    }
}