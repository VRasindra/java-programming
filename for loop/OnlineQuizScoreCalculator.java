//16: Online Quiz Score Calculator
// import java.util.Scanner;
// public class OnlineQuizScoreCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int passCount = 0;
//         int failCount = 0;
//         int highestScore = Integer.MIN_VALUE;
//         int totalScore = 0;
//         for (int i = 1; i <= N; i++) {
//             String name = sc.next();
//             int correct = sc.nextInt();
//             int wrong = sc.nextInt();
//             int unattempted = sc.nextInt();
//             int score = (correct * 4) - (wrong * 3);
//             System.out.println("Student: " + name);
//             System.out.println("Correct: " + correct);
//             System.out.println("Wrong: " + wrong);
//             System.out.println("Unattempted: " + unattempted);
//             System.out.println("Score: " + score);
//             if (score >= 32) {
//                 System.out.println("Result: Pass");
//                 passCount++;
//             } else {
//                 System.out.println("Result: Fail");
//                 failCount++;
//             }
//             System.out.println();
//             highestScore = Math.max(highestScore, score);
//             totalScore += score;
//         }
//         double average = totalScore / (double) N;
//         System.out.println("Total Students: " + N);
//         System.out.println("Pass Count: " + passCount);
//         System.out.println("Fail Count: " + failCount);
//         System.out.println("Class Average: " + average);
//         System.out.println("Highest Score: " + highestScore);
//     }
// }