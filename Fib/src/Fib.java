import java.util.Scanner;

public class Fib {
      static boolean isPalindrome(String s, int i, int j) {
            if (s.charAt(i) != s.charAt(j)) {
                  return false;
            }
            if(j<=i){
                  return true;
            }
           return isPalindrome(s, i + 1, j - 1);

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String");
            String str = sc.next();
            int j=str.length();
            System.out.println(isPalindrome(str,0,j-1));
      }
}