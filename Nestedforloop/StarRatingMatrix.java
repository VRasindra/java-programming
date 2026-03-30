//15: Star Rating Matrix Display
// import java.util.Scanner;
// public class StarRatingMatrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int products = sc.nextInt();
//         sc.nextLine(); 
//         double totalRating = 0.0;
//         System.out.println("Star Rating Matrix:");
//         System.out.println("Product Rating Stars");
//         for (int i = 0; i < products; i++) {
//             String line = sc.nextLine();
//             String[] parts = line.split(" ");
//             String productName = parts[0];
//             double rating = Double.parseDouble(parts[1]);
//             totalRating += rating;
//             System.out.printf("%-15s %.1f ", productName, rating);
//             int fullStars = (int) rating;
//             boolean halfStar = (rating - fullStars >= 0.5);
//             for (int j = 0; j < 5; j++) {
//                 if (j < fullStars) {
//                     System.out.print("★");
//                 } else if (j == fullStars && halfStar) {
//                     System.out.print("☆"); 
//                     halfStar = false; 
//                 } else {
                 
//                    System.out.print("☆");
//                 }
//             }
//             System.out.println();
//         }
//         double average = totalRating / products;
//         System.out.printf("%nAverage Rating: %.2f%n", average);
//         sc.close();
//     }
// }
