// 11: Pascal's Triangle Generator
// import java.util.Scanner;
// public class PascalsTriangle {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         System.out.println("Pascal's Triangle:");
//         for (int i = 0; i < rows; i++) {
//             for (int space = 0; space < rows - i - 1; space++) {
//                 System.out.print(" ");
//             }
//             int value = 1; 
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(value + " ");
//                 value = value * (i - j) / (j + 1);
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
//   }
