//10  Smart Home Energy Management System
// import java.util.Scanner;
// public class SmartHomeEnergySystem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String time = sc.nextLine();
//         double consumption = sc.nextDouble();
//         double renewable = sc.nextDouble();
//         sc.nextLine();
//         String tier = sc.nextLine();

//         double baseRate = 0;

//         if (tier.equalsIgnoreCase("Basic")) baseRate = 0.18;
//         else if (tier.equalsIgnoreCase("Time-of-Use")) baseRate = 0.15;
//         else baseRate = 0.12;

//         double multiplier = 1.0;

//         if (time.equalsIgnoreCase("Peak")) multiplier = 1.8;
//         else if (time.equalsIgnoreCase("Off-Peak")) multiplier = 0.8;
//         else multiplier = 0.6;

//         double renewableCredit = (consumption * renewable / 100) * baseRate;
//         double totalCost = (consumption * baseRate * multiplier) - renewableCredit;
//         if (totalCost < 0) totalCost = 0;

//         String recommendation;
//         if (time.equalsIgnoreCase("Peak") && renewable < 30)
//             recommendation = "Shift high-power appliances to Off-Peak hours";
//         else if (renewable > 70)
//             recommendation = "Excellent! Continue maximizing renewable usage";
//         else if (tier.equalsIgnoreCase("Basic"))
//             recommendation = "Consider upgrading to Time-of-Use plan";
//         else
//             recommendation = "Good energy management";

//         double potentialSavings = 0;
//         if (time.equalsIgnoreCase("Peak")) {
//             double offPeakCost = (consumption * baseRate * 0.8) - renewableCredit;
//             if (offPeakCost < 0) offPeakCost = 0;
//             potentialSavings = totalCost - offPeakCost;
//         }

//         System.out.println("Time of Day: " + time);
//         System.out.println("Power Consumption: " + consumption + " kWh");
//         System.out.println("Renewable Energy: " + renewable + "%");
//         System.out.println("Rate Tier: " + tier);
//         System.out.println("Base Rate: $" + baseRate + "/kWh");
//         System.out.println("Rate Multiplier: " + multiplier + "x");
//         System.out.println("Renewable Credit: $" + String.format("%.2f", renewableCredit));
//         System.out.println("Total Cost: $" + String.format("%.2f", totalCost));
//         System.out.println("Optimization Recommendation: " + recommendation);
//         System.out.println("Potential Savings: $" + String.format("%.2f", potentialSavings));

//         sc.close();
//     }

// }
