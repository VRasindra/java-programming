//10 Restaurant Order Processing System
// import java.util.Scanner;
// public class RestaurantOrderSystem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int totalItems = 0;
//         double subtotal = 0;
//         for (int i = 1; i <= N; i++) {
//             String item = sc.next();
//             double price = sc.nextDouble();
//             int quantity = sc.nextInt();
//             double itemTotal = price * quantity;
//             totalItems += quantity;
//             subtotal += itemTotal;
//             System.out.println("Item: " + item);
//             System.out.println("Price: $" + price + " x " + quantity);
//             System.out.println("Subtotal: $" + itemTotal);
//             System.out.println();
//         }
//         double tax = subtotal * 0.08;
//         double serviceCharge = subtotal * 0.10;
//         double grandTotal = subtotal + tax + serviceCharge;
//         System.out.println("Total Items: " + totalItems);
//         System.out.println("Subtotal: $" + subtotal);
//         System.out.println("Tax (8%): $" + Math.round(tax * 100.0) / 100.0);
//         System.out.println("Service Charge (10%): $" + Math.round(serviceCharge * 100.0) / 100.0);
//         System.out.println("Grand Total: $" + Math.round(grandTotal * 100.0) / 100.0);
//         sc.close();
//     }
// }
