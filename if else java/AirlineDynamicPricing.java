//6 Airline Ticket Dynamic Pricing System
// import java.util.Scanner;
// public class AirlineDynamicPricing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String bookingClass = sc.nextLine();
//         int days = sc.nextInt();
//         double availability = sc.nextDouble();
//         sc.nextLine();
//         String routeType = sc.nextLine();
//         double basePrice = 0;
//         if (bookingClass.equalsIgnoreCase("Economy")) {
//             if (routeType.equalsIgnoreCase("Domestic")) basePrice = 200;
//             else if (routeType.equalsIgnoreCase("International-Short")) basePrice = 500;
//             else basePrice = 800;
//         } else if (bookingClass.equalsIgnoreCase("Business")) {
//             if (routeType.equalsIgnoreCase("Domestic")) basePrice = 600;
//             else if (routeType.equalsIgnoreCase("International-Short")) basePrice = 1500;
//             else basePrice = 2500;
//         } else if (bookingClass.equalsIgnoreCase("First")) {
//             if (routeType.equalsIgnoreCase("Domestic")) basePrice = 1000;
//             else if (routeType.equalsIgnoreCase("International-Short")) basePrice = 3000;
//             else basePrice = 5000;
//         }
//         double multiplier = 1.0;
//         String category = "Moderate";
//         if (availability < 30 && days < 14) {
//             multiplier = 1.8;
//             category = "High Demand";
//         } else if (availability < 50 && days < 30) {
//             multiplier = 1.5;
//             category = "High Demand";
//         } else if (availability >= 60 && days > 60) {
//             multiplier = 0.8;
//             category = "Low Demand";
//         } else {
//             multiplier = 1.0;
//             category = "Moderate";
//         }
//         double finalPrice = basePrice * multiplier;
//         System.out.println("Booking Class: " + bookingClass);
//         System.out.println("Days Until Departure: " + days);
//         System.out.println("Seat Availability: " + availability + "%");
//         System.out.println("Route Type: " + routeType);
//         System.out.println("Base Price: $" + basePrice);
//         System.out.println("Demand Multiplier: " + multiplier + "x");
//         System.out.println("Final Ticket Price: $" + finalPrice);
//         System.out.println("Pricing Category: " + category);

//         sc.close();
//     }

// }