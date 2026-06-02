// 8: Student Attendance Matrix
// import java.util.Scanner;
// public class AttendanceMatrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int students = sc.nextInt();
//         int days = sc.nextInt();
//         sc.nextLine(); 
//         String[] names = new String[students];
//         String[][] attendance = new String[students][days];
//         double[] percentages = new double[students];
//         int perfectCount = 0;
//         for (int i = 0; i < students; i++) {
//             String line = sc.nextLine();
//             String[] parts = line.split(" ");
//             names[i] = parts[0];
//             int presentCount = 0;
//             for (int j = 0; j < days; j++) {
//                 attendance[i][j] = parts[j + 1];
//                 if (attendance[i][j].equals("P")) {
//                     presentCount++;
//                 }
//             }
//             percentages[i] = (presentCount * 100.0) / days;
//             if (percentages[i] == 100.0) {
//                 perfectCount++;
//             }
//         }
//         System.out.println("Attendance Matrix:");
//         System.out.print("Student ");
//         for (int d = 1; d <= days; d++) {
//             System.out.print("Day" + d + " ");
//         }
//         System.out.println("Attendance%");
//         for (int i = 0; i < students; i++) {
//             System.out.print(names[i] + " ");
//             for (int j = 0; j < days; j++) {
//                 System.out.print(attendance[i][j] + " ");
//             }
//             System.out.printf("%.2f%%\n", percentages[i]);
//         }
//         System.out.println("\nPerfect Attendance: " + perfectCount + " students");
//     }
// }
