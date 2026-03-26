//4: Grade Sheet Matrix Generator
// import java.util.Scanner;
// public class GradeSheetMatrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int students = sc.nextInt();
//         int subjects = sc.nextInt();
//         sc.nextLine(); // consume newline
//         System.out.println("Grade Sheet:");
//         System.out.print("Student");
//         for (int i = 1; i <= subjects; i++) {
//             System.out.print(" Sub" + i);
//         }
//         System.out.println(" Average");
//         for (int i = 0; i < students; i++) {
//             String line = sc.nextLine();
//             String[] parts = line.split(" ");
//             String name = parts[0];
//             double sum = 0;
//             System.out.printf("%-10s", name);
//             for (int j = 1; j <= subjects; j++) {
//                 int score = Integer.parseInt(parts[j]);
//                 sum += score;
//                 System.out.printf("%6d", score);
//             }
//             double avg = sum / subjects;
//             System.out.printf("%8.2f\n", avg);
//         }
//     }
// }
