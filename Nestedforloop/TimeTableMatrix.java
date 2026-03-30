//18: Time Table Schedule Matrix
// import java.util.Scanner;
// public class TimeTableMatrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int days = sc.nextInt();
//         int periods = sc.nextInt();
//         sc.nextLine();
//         String[][] timetable = new String[days][periods];
//         for (int i = 0; i < days; i++) {
//             String[] subjects = sc.nextLine().split(" ");
//             for (int j = 0; j < periods; j++) {
//                 timetable[i][j] = subjects[j];
//             }
//         }
//         String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//         System.out.print("Class Time Table:\nDay ");
//         for (int p = 1; p <= periods; p++) {
//             System.out.print("Period" + p + " ");
//         }
//         System.out.println();
//         for (int i = 0; i < days; i++) {
//             System.out.print(dayNames[i] + " ");
//             for (int j = 0; j < periods; j++) {
//                 System.out.print(timetable[i][j] + " ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }
