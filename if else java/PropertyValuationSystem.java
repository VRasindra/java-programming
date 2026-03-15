//8  Real Estate Property Valuation System
// import java.util.Scanner;
// public class PropertyValuationSystem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String location = sc.nextLine();
//         int sqft = sc.nextInt();
//         int age = sc.nextInt();
//         int amenity = sc.nextInt();
//         double basePricePerSqFt = 0;
//         if (location.equalsIgnoreCase("Prime")) basePricePerSqFt = 400;
//         else if (location.equalsIgnoreCase("Urban")) basePricePerSqFt = 300;
//         else if (location.equalsIgnoreCase("Suburban")) basePricePerSqFt = 180;
//         else basePricePerSqFt = 100;
//         double ageAdjustment = 0;
//         if (age <= 5) ageAdjustment = 0;
//         else if (age <= 15) ageAdjustment = -5;
//         else if (age <= 30) ageAdjustment = -15;
//         else ageAdjustment = -25;
//         double baseValue = sqft * basePricePerSqFt;
//         double adjustedValue = baseValue * (1 + ageAdjustment / 100);
//         double amenityBonus = 0;
//         if (amenity >= 80) amenityBonus = baseValue * 0.10;
//         else if (amenity >= 60) amenityBonus = baseValue * 0.05;
//         else if (amenity >= 40) amenityBonus = baseValue * 0.02;
//         double finalValue = adjustedValue + amenityBonus;
//         String marketCategory;
//         if ((location.equalsIgnoreCase("Prime") || location.equalsIgnoreCase("Urban")) && age < 15)
//             marketCategory = "Hot";
//         else if (location.equalsIgnoreCase("Suburban"))
//             marketCategory = "Stable";
//         else
//             marketCategory = "Slow";
//         System.out.println("Location Tier: " + location);
//         System.out.println("Square Footage: " + sqft + " sq ft");
//         System.out.println("Property Age: " + age + " years");
//         System.out.println("Amenity Score: " + amenity);
//         System.out.println("Base Price Per Sq Ft: $" + basePricePerSqFt);
//         System.out.println("Age Adjustment: " + (int)ageAdjustment + "%");
//         System.out.println("Amenity Bonus: $" + amenityBonus);
//         System.out.println("Estimated Property Value: $" + finalValue);
//         System.out.println("Market Category: " + marketCategory);
//         sc.close();
//     }
// }
