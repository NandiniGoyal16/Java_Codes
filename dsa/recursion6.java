
public class recursion6 {

    static boolean isPalindrome(int i, int n, String s) {
        if( i >= n-i-1) return true;
        if (s.charAt(i) != s.charAt(n-i-1)) return false;
        return isPalindrome(i+1, n, s);

    }

    public static void main(String[] args) {
        String name = "malayalam";
        int n = name.length();
        System.out.println("Is the string: " + name + " Palindrome? " + isPalindrome(0, n, name));
    }
    
}
