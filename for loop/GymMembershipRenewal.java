
import java.util.Scanner;
public class GymMembershipRenewal  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int passCount = 0;
        int failCount = 0;
        int highestScore = Integer.MIN_VALUE;
        int totalScore = 0;
        for (int i = 1; i <= N; i++) {
            String name = sc.next();
            int correct = sc.nextInt();
            int wrong = sc.nextInt();
            int unattempted = sc.nextInt();
            int score = (correct * 4) - (wrong * 3);
            int Final = sc.nextInt();
            System.out.println("Member: " + name);
            System.out.println("Membership: " + correct);
            System.out.println("Days Until Expiry: " + wrong);
            System.out.println("Renewal: " + unattempted);
            System.out.println("Discount: " + score);
            // System.out.println("Final Fee:"+ Final Fee);
            if (score >= 32) {
                System.out.println("Result: Pass");
                passCount++;
            } else {
                System.out.println("Result: Fail");
                failCount++;
            }
            System.out.println();
            highestScore = Math.max(highestScore, score);
            totalScore += score;
        }
        double average = totalScore / (double) N;
        System.out.println("Total Members: " + N);
        System.out.println("Urgent Renewals: " + passCount);
        System.out.println("Total Renewal Revenue: " + failCount);
        System.out.println("Average Renewal: " + average);
        System.out.println("Highest Score: " + highestScore);
    }
}

        