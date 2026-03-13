//12 Vehicle Insurance Premium Calculator
// import java.util.Scanner;
// public class InsuranceCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int age = sc.nextInt();
//         sc.nextLine();
//         String vehicleType = sc.nextLine();
//         String record = sc.nextLine();
//         String coverage = sc.nextLine();

//         double basePremium = 0;
//         double ageFactor = 1.0;
//         double vehicleFactor = 1.0;
//         int recordAdjustment = 0;

//         if (coverage.equals("Basic"))
//             basePremium = 500;
//         else if (coverage.equals("Standard"))
//             basePremium = 800;
//         else
//             basePremium = 1500;

//         if (age <= 21)
//             ageFactor = 1.8;
//         else if (age <= 25)
//             ageFactor = 1.5;
//         else if (age <= 40)
//             ageFactor = 1.0;
//         else if (age <= 60)
//             ageFactor = 0.9;
//         else
//             ageFactor = 1.1;

        
//         if (vehicleType.equals("Sedan"))
//             vehicleFactor = 1.0;
//         else if (vehicleType.equals("SUV"))
//             vehicleFactor = 1.2;
//         else if (vehicleType.equals("Sports"))
//             vehicleFactor = 1.5;
//         else
//             vehicleFactor = 1.1;

//         if (record.equals("Clean"))
//             recordAdjustment = -10;
//         else if (record.equals("Minor-Violations"))
//             recordAdjustment = 25;
//         else
//             recordAdjustment = 50;

//         double adjustedPremium = basePremium * ageFactor * vehicleFactor;
//         double finalPremium = adjustedPremium * (1 + recordAdjustment / 100.0);
//         double monthly = finalPremium / 12;

//         String risk;
//         if (finalPremium < 1000)
//             risk = "Low";
//         else if (finalPremium < 2000)
//             risk = "Medium";
//         else if (finalPremium < 4000)
//             risk = "High";
//         else
//             risk = "Very High";

//         System.out.println("Driver Age: " + age);
//         System.out.println("Vehicle Type: " + vehicleType);
//         System.out.println("Driving Record: " + record);
//         System.out.println("Coverage Level: " + coverage);
//         System.out.println("Base Premium: $" + basePremium);
//         System.out.println("Age Factor: " + ageFactor + "x");
//         System.out.println("Vehicle Risk Factor: " + vehicleFactor + "x");
//         System.out.println("Record Adjustment: " + recordAdjustment + "%");
//         System.out.println("Monthly Premium: $" + Math.round(monthly * 100.0) / 100.0);
//         System.out.println("Annual Premium: $" + Math.round(finalPremium * 100.0) / 100.0);
//         System.out.println("Risk Category: " + risk);
//     }
// }
