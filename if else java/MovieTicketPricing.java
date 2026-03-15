//19 Movie Ticket Pricing System
// import java.util.Scanner;
// public class MovieTicketPricing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String format = sc.nextLine();
//         String time = sc.nextLine();
//         String seat = sc.nextLine();
//         String customer = sc.nextLine();

//         double basePrice = 12;
//         double formatFee = 0;
//         double seatFee = 0;
//         int timeAdjust = 0;
//         int customerDiscount = 0;

        
//         if (format.equals("3D")) formatFee = 5;
//         else if (format.equals("IMAX")) formatFee = 8;
//         else if (format.equals("4DX")) formatFee = 10;

        
//         if (seat.equals("Premium")) seatFee = 4;
//         else if (seat.equals("Recliner")) seatFee = 7;

        
//         if (time.equals("Matinee")) timeAdjust = -30;
//         else if (time.equals("Prime-Time")) timeAdjust = 20;
//         else if (time.equals("Late-Night")) timeAdjust = -20;

        
//         if (customer.equals("Senior")) customerDiscount = 25;
//         else if (customer.equals("Student")) customerDiscount = 15;
//         else if (customer.equals("Child")) customerDiscount = 30;
//         double baseWithExtras = basePrice + formatFee + seatFee;
//         double adjusted = baseWithExtras * (1 + timeAdjust / 100.0);
//         double finalPrice = adjusted * (1 - customerDiscount / 100.0);
//         String voucher = (time.equals("Matinee") || !customer.equals("Adult")) ? "Yes" : "No";

//         String category;
//         if (finalPrice < 10) category = "Value";
//         else if (finalPrice < 20) category = "Standard";
//         else if (finalPrice < 30) category = "Premium";
//         else category = "Luxury";

//         System.out.println("Movie Format: " + format);
//         System.out.println("Show Time: " + time);
//         System.out.println("Seat Category: " + seat);
//         System.out.println("Customer Type: " + customer);
//         System.out.println("Base Ticket Price: $" + basePrice);
//         System.out.println("Format Surcharge: $" + formatFee);
//         System.out.println("Seat Upgrade Fee: $" + seatFee);
//         System.out.println("Time-Based Adjustment: " + timeAdjust + "%");
//         System.out.println("Customer Discount: " + customerDiscount + "%");
//         System.out.println("Final Ticket Price: $" + finalPrice);
//         System.out.println("Concession Voucher: " + voucher);
//         System.out.println("Pricing Category: " + category);
//     }

// }
