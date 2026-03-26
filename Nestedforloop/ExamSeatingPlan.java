//14: Exam Seating Plan Generator
// import java.util.Scanner;
// public class ExamSeatingPlan {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
//         int totalStudents = sc.nextInt();
//         int totalSeats = rows * cols;
//         int studentNum = 1;
//         int occupiedSeats = 0;
//         System.out.println("Exam Seating Plan:");
//         for (int r = 0; r < rows; r++) {
//             for (int c = 0; c < cols; c++) {
//                 if ((r + c) % 1 == 0 && studentNum <= totalStudents) {
//                     System.out.print("S" + String.format("%02d", studentNum) + " ");
//                     studentNum++;
//                     occupiedSeats++;
//                 } else {
//                     System.out.print("---- ");
//                 }
//             }
//             System.out.println();
//         }
//         int emptySeats = totalSeats - occupiedSeats;
//         System.out.println("\nTotal Seats: " + totalSeats);
//         System.out.println("Occupied Seats: " + occupiedSeats);
//         System.out.println("Empty Seats: " + emptySeats);
//     }
// }