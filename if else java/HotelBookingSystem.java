//16  Hotel Room Booking and Pricing System
// import java.util.Scanner;
// public class HotelBookingSystem  {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String room = sc.nextLine();
//         String season = sc.nextLine();
//         int nights = sc.nextInt();
//         sc.nextLine();
//         String loyalty = sc.nextLine();

//         double baseRate = 0;
//         double seasonalMultiplier = 1.0;
//         int extendedDiscount = 0;
//         int loyaltyDiscount = 0;
//         String upgrades = "None";

           
//         if (room.equals("Standard")) baseRate = 150;
//         else if (room.equals("Deluxe")) baseRate = 300;
//         else if (room.equals("Suite")) baseRate = 500;
//         else baseRate = 1000;

        
//         if (season.equals("Off-Peak")) seasonalMultiplier = 0.7;
//         else if (season.equals("Regular")) seasonalMultiplier = 1.0;
//         else if (season.equals("Peak")) seasonalMultiplier = 1.5;
//         else seasonalMultiplier = 2.0;

//         if (nights >= 15) extendedDiscount = 20;
//         else if (nights >= 8) extendedDiscount = 10;
//         else if (nights >= 5) extendedDiscount = 5;
//         else extendedDiscount = 0;

//         if (loyalty.equals("Member")) loyaltyDiscount = 10;
//         else if (loyalty.equals("Gold")) loyaltyDiscount = 15;
//         else if (loyalty.equals("Platinum")) loyaltyDiscount = 20;
//         else loyaltyDiscount = 0;

//         double seasonalRate = baseRate * seasonalMultiplier;
//         double nightlyRate = seasonalRate *
//                 (1 - extendedDiscount / 100.0) *
//                 (1 - loyaltyDiscount / 100.0);
//         double totalCost = nightlyRate * nights;

//         if (loyalty.equals("Platinum"))
//             upgrades = "Concierge service, airport transfer, and fine dining";
//         else if (loyalty.equals("Gold"))
//             upgrades = "Free breakfast and spa access";
//         else if (loyalty.equals("Member"))
//             upgrades = "Free breakfast";

//         System.out.println("Room Category: " + room);
//         System.out.println("Season: " + season);
//         System.out.println("Nights Booked: " + nights);
//         System.out.println("Loyalty Tier: " + loyalty);
//         System.out.println("Base Rate Per Night: $" + baseRate);
//         System.out.println("Seasonal Multiplier: " + seasonalMultiplier + "x");
//         System.out.println("Extended Stay Discount: " + extendedDiscount + "%");
//         System.out.println("Loyalty Discount: " + loyaltyDiscount + "%");
//         System.out.println("Nightly Rate: $" + nightlyRate);
//         System.out.println("Total Booking Cost: $" + totalCost);
//         System.out.println("Complimentary Upgrades: " + upgrades);
//     }

// }
