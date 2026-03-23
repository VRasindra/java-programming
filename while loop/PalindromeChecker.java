//12 palindrome Checker
// import java.util.Scanner;
// public class PalindromeChecker {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int original = num, reversed = 0;

//         while (num > 0) {
//             int digit = num % 10;
//             reversed = reversed * 10 + digit;
//             num /= 10;
//         }

//         if (original == reversed)
//             System.out.println(original + " is a palindrome");
//         else
//             System.out.println(original + " is not a palindrome");
//     }
// }