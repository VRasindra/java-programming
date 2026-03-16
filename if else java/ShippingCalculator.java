//18 Shipping Cost and Delivery Time Calculator
// import java.util.Scanner;
// public class ShippingCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         double weight = sc.nextDouble();
//         sc.nextLine();
//         String zone = sc.nextLine();
//         String speed = sc.nextLine();
//         String size = sc.nextLine();

//         double baseRate = 0;
//         double zoneMultiplier = 1.0;
//         double sizeFee = 0;
//         int deliveryDays = 0;

        
//         if (speed.equals("Economy")) baseRate = 5;
//         else if (speed.equals("Standard")) baseRate = 10;
//         else if (speed.equals("Express")) baseRate = 25;
//         else baseRate = 50;

//         double weightSurcharge = weight;

        
//         if (zone.equals("Regional")) zoneMultiplier = 1.2;
//         else if (zone.equals("National")) zoneMultiplier = 1.5;
//         else if (zone.equals("International")) zoneMultiplier = 3.0;

        
//         if (size.equals("Medium")) sizeFee = 5;
//         else if (size.equals("Large")) sizeFee = 15;
//         else if (size.equals("Oversized")) sizeFee = 30;

//         double baseCost = (baseRate + weightSurcharge) * zoneMultiplier;
//         double totalCost = baseCost + sizeFee;

        
//         if (speed.equals("Overnight")) deliveryDays = 1;
//         else if (speed.equals("Express")) deliveryDays = 2;
//         else if (speed.equals("Standard")) deliveryDays = 5;
//         else deliveryDays = 7;

//         String serviceLevel;
//         if (speed.equals("Economy")) serviceLevel = "Budget";
//         else if (speed.equals("Standard")) serviceLevel = "Standard";
//         else if (speed.equals("Express")) serviceLevel = "Priority";
//         else serviceLevel = "Premium";

//         System.out.println("Package Weight: " + weight + " lbs");
//         System.out.println("Destination Zone: " + zone);
//         System.out.println("Shipping Speed: " + speed);
//         System.out.println("Package Size: " + size);
//         System.out.println("Base Shipping Rate: $" + baseRate);
//         System.out.println("Weight Surcharge: $" + weightSurcharge);
//         System.out.println("Zone Multiplier: " + zoneMultiplier + "x");
//         System.out.println("Size Surcharge: $" + sizeFee);
//         System.out.println("Total Shipping Cost: $" + totalCost);
//         System.out.println("Estimated Delivery: " + deliveryDays + " business days");
//         System.out.println("Service Level: " + serviceLevel);
//     }

// }
