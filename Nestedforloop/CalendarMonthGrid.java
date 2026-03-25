//5: Calendar Month Grid Generator
// import java.util.Scanner;
// public class CalendarMonthGrid {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int daysInMonth = sc.nextInt();
//         int startDay = sc.nextInt(); // 1=Mon, 7=Sun
//         System.out.println("Calendar Grid:");
//         System.out.println("Mon Tue Wed Thu Fri Sat Sun");
//         int totalCells = startDay - 1 + daysInMonth;
//         int day = 1;
//         for (int i = 1; i <= totalCells; i++) {
//             if (i < startDay) {
//                 System.out.print("    "); // empty space before start
//             } else {
//                 System.out.printf("%3d ", day);
//                 day++;
//             }
//             if (i % 7 == 0) System.out.println();
//         }
//         System.out.println();
//     }
// }