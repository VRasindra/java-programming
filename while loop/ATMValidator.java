//6. ATM Withdrawal Validator 
// import java.util.Scanner;
// public class ATMValidator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int balance = sc.nextInt();
//         System.out.println("Balance: " + balance);
//         int amount;
//         do {
//             System.out.print("Enter withdrawal amount: ");
//             amount = sc.nextInt();
//             System.out.println(amount);
//             if (amount <= 0) {
//                 System.out.println("Invalid amount! Try again.");
//             } else if (amount > balance) {
//                 System.out.println("Insufficient funds! Try again.");
//             } else {
//                 balance -= amount;
//                 System.out.println("Withdrawal successful! Remaining balance: " + balance);
//                 break;
//             }
//         } while (true);
//     }
