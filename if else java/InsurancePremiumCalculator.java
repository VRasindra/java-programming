//3 Healthcare Insurance Premium Calculator
// import java.util.Scanner;
// public class InsurancePremiumCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int age = sc.nextInt();
//         sc.nextLine();
//         String smokingStatus = sc.nextLine();
//         String preExisting = sc.nextLine();
//         String coverageTier = sc.nextLine();

//         double basePremium = 0;

//                 if (coverageTier.equalsIgnoreCase("Basic")) {
//             if (age <= 30) basePremium = 200;
//             else if (age <= 50) basePremium = 250;
//             else if (age <= 65) basePremium = 350;
//             else basePremium = 400;
//         }
//         else if (coverageTier.equalsIgnoreCase("Standard")) {
//             if (age <= 30) basePremium = 300;
//             else if (age <= 50) basePremium = 350;
//             else if (age <= 65) basePremium = 450;
//             else basePremium = 550;
//         }
//         else if (coverageTier.equalsIgnoreCase("Premium")) {
//             if (age <= 30) basePremium = 500;
//             else if (age <= 50) basePremium = 600;
//             else if (age <= 65) basePremium = 700;
//             else basePremium = 800;
//         }

//         double riskSurcharge = 0;

//         if (smokingStatus.equalsIgnoreCase("Smoker") && preExisting.equalsIgnoreCase("Yes")) {
//             riskSurcharge = basePremium * 0.70;
//         } else if (smokingStatus.equalsIgnoreCase("Smoker")) {
//             riskSurcharge = basePremium * 0.40;
//         } else if (preExisting.equalsIgnoreCase("Yes")) {
//             riskSurcharge = basePremium * 0.30;
//         }

//         double totalPremium = basePremium + riskSurcharge;

//         System.out.println("Age: " + age);
//         System.out.println("Smoking Status: " + smokingStatus);
//         System.out.println("Pre-existing Conditions: " + preExisting);
//         System.out.println("Coverage Tier: " + coverageTier);
//         System.out.println("Base Premium: $" + basePremium);
//         System.out.println("Risk Surcharge: $" + riskSurcharge);
//         System.out.println("Total Monthly Premium: $" + totalPremium);

//         sc.close();
//     }

// }