//8 Product Price Discount Calculator
// import java.util.Scanner;
// public class ProductDiscountCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int totalItems = 0;
//         double originalTotal = 0;
//         double finalTotal = 0;
//         for (int i = 1; i <= N; i++) {
//             String name = sc.next();
//             double price = sc.nextDouble();
//             int quantity = sc.nextInt();
//             int discount = 0;
//             if (quantity == 1)
//                 discount = 0;
//             else if (quantity <= 4)
//                 discount = 10;
//             else if (quantity <= 9)
//                 discount = 15;
//             else
//                 discount = 20;
//             double subtotal = price * quantity * (1 - discount / 100.0);
//             double original = price * quantity;
//             totalItems += quantity;
//             originalTotal += original;
//             finalTotal += subtotal;
//             System.out.println("Product: " + name);
//             System.out.println("Unit Price: $" + price);
//             System.out.println("Quantity: " + quantity);
//             System.out.println("Discount: " + discount + "%");
//             System.out.println("Subtotal: $" + Math.round(subtotal * 100.0) / 100.0);
//             System.out.println();
//         }
//         double totalDiscount = originalTotal - finalTotal;
//         double savings = (totalDiscount / originalTotal) * 100;
//         System.out.println("Total Items: " + totalItems);
//         System.out.println("Original Total: $" + Math.round(originalTotal * 100.0) / 100.0);
//         System.out.println("Total Discount: $" + Math.round(totalDiscount * 100.0) / 100.0);
//         System.out.println("Final Total: $" + Math.round(finalTotal * 100.0) / 100.0);
//         System.out.println("Savings: " + Math.round(savings * 100.0) / 100.0 + "%");
//         sc.close();
//     }
// }
