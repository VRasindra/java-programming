//21 Parking Fee Calculator System
// import java.util.Scanner;
// public class ParkingFeeCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String zone = sc.nextLine();
//         double hours = sc.nextDouble();
//         sc.nextLine();
//         String vehicle = sc.nextLine();
//         String membership = sc.nextLine();
//         double baseRate = 5.0;
//         double zonePremium = 0;
//         double vehicleSurcharge = 0;
//         double membershipDiscount = 0;
//         double dailyCap = Double.MAX_VALUE;
//         if(zone.equals("Downtown")) {
//             zonePremium = 50;
//             dailyCap = 150;
//         } else if(zone.equals("Business-District")) {
//             zonePremium = 30;
//             dailyCap = 120;
//         } else if(zone.equals("Residential")) {
//             zonePremium = 0;
//             dailyCap = 60;
//         } else if(zone.equals("Airport")) {
//             zonePremium = 100;
//             dailyCap = 180;
//         }        
//         if(vehicle.equals("Motorcycle")) vehicleSurcharge = -2;
//         else if(vehicle.equals("Compact")) vehicleSurcharge = 0;
//         else if(vehicle.equals("Sedan")) vehicleSurcharge = 0;
//         else if(vehicle.equals("SUV")) vehicleSurcharge = 3;
//         else if(vehicle.equals("Oversized")) vehicleSurcharge = 5;
//         if(membership.equals("Monthly")) membershipDiscount = 20;
//         else if(membership.equals("Annual")) membershipDiscount = 25;
//         else if(membership.equals("VIP")) membershipDiscount = 30;
//         else membershipDiscount = 0;
//         double hourlyCost = baseRate * (1 + zonePremium/100) + vehicleSurcharge;
//         double total = hourlyCost * hours;
//         total = total * (1 - membershipDiscount/100);
//         boolean capApplied = false;
//         if(hours >= 24 && total > dailyCap) {
//             total = dailyCap;
//             capApplied = true;
//         }
//         String category = "Standard";
//         if(zone.equals("Downtown") || zone.equals("Business-District"))
//             category = "Premium";
//         if(zone.equals("Airport"))
//             category = "Luxury";
//         System.out.println("Location Zone: " + zone);
//         System.out.println("Parking Duration: " + hours + " hours");
//         System.out.println("Vehicle Type: " + vehicle);
//         System.out.println("Membership Status: " + membership);
//         System.out.println("Base Hourly Rate: $" + baseRate);
//         System.out.println("Zone Premium: " + zonePremium + "%");
//         System.out.println("Vehicle Size Surcharge: $" + vehicleSurcharge);
//         System.out.println("Membership Discount: " + membershipDiscount + "%");
//         System.out.println("Total Parking Fee: $" + total);
//         System.out.println("Daily Cap Applied: " + (capApplied ? "Yes" : "No"));
//         System.out.println("Rate Category: " + category);
//     }
// }
