//14: Library Fine Calculator
// import java.util.*;
// public class LibraryFineCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();

//         double totalFines = 0;
//         int overdueCount = 0;

//         for (int i = 1; i <= N; i++) {
//             String type = sc.next();
//             int daysLate = sc.nextInt();

//             double rate = 0, cap = 0;

//             if (type.equals("Regular")) { rate = 0.5; cap = 10; }
//             else if (type.equals("Reference")) { rate = 1.0; cap = 20; }
//             else if (type.equals("Magazine")) { rate = 0.25; cap = 5; }

//             double calculated = daysLate * rate;
//             double actual = Math.min(calculated, cap);
//             boolean capApplied = calculated > cap;

//             if (daysLate > 0) overdueCount++;
//             totalFines += actual;

//             System.out.println("Book " + i + ": " + type);
//             System.out.println("Days Late: " + daysLate);
//             System.out.println("Daily Fine: $" + rate);
//             System.out.println("Calculated Fine: $" + calculated);
//             System.out.println("Actual Fine: $" + actual);
//             System.out.println("Cap Applied: " + (capApplied ? "Yes" : "No"));
//             System.out.println();
//         }

//         double average = totalFines / N;

//         System.out.println("Total Books: " + N);
//         System.out.println("Total Fines Collected: $" + totalFines);
//         System.out.println("Books Overdue: " + overdueCount);
//         System.out.printf("Average Fine: $%.2f\n", average);
//     }
// }
