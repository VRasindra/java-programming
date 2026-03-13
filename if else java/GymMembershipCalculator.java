//14 Gym Membership Pricing and Access System
// import java.util.Scanner;
// public class GymMembershipCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String tier = sc.nextLine();
//         int months = sc.nextInt();
//         sc.nextLine();
//         String access = sc.nextLine();
//         String addOns = sc.nextLine();

//         double baseFee = 0;
//         int discount = 0;
//         double accessFee = 0;
//         double addOnFee = 0;

//         if (tier.equals("Basic")) baseFee = 40;
//         else if (tier.equals("Premium")) baseFee = 80;
//         else if (tier.equals("Elite")) baseFee = 120;
//         else baseFee = 150;

//         if (months == 6) discount = 10;
//         else if (months == 12) discount = 15;
//         else if (months == 24) discount = 25;
//         else discount = 0;

//         if (access.equals("Regional")) accessFee = 20;
//         else if (access.equals("Nationwide")) accessFee = 50;
//         else accessFee = 0;

//         if (addOns.equals("Personal-Training")) addOnFee = 100;
//         else if (addOns.equals("Classes")) addOnFee = 50;
//         else if (addOns.equals("Full-Package")) addOnFee = 200;
//         else addOnFee = 0;

//         double discountedBase = baseFee * (1 - discount / 100.0);
//         double monthlyTotal = discountedBase + accessFee + addOnFee;
//         double contractTotal = monthlyTotal * months;

//         double originalTotal = (baseFee + accessFee + addOnFee) * months;
//         double savings = originalTotal - contractTotal;

//         String category;
//         if (tier.equals("Basic")) category = "Budget";
//         else if (tier.equals("Premium")) category = "Standard";
//         else if (tier.equals("Elite")) category = "Premium";
//         else category = "Luxury";

//         System.out.println("Membership Tier: " + tier);
//         System.out.println("Contract Length: " + months + " months");
//         System.out.println("Access Level: " + access);
//         System.out.println("Add-Ons: " + addOns);
//         System.out.println("Base Monthly Fee: $" + baseFee);
//         System.out.println("Contract Discount: " + discount + "%");
//         System.out.println("Access Fee: $" + accessFee);
//         System.out.println("Add-On Fee: $" + addOnFee);
//         System.out.println("Monthly Total: $" + monthlyTotal);
//         System.out.println("Contract Total: $" + contractTotal);
//         System.out.println("Savings vs Month-to-Month: $" + savings);
//         System.out.println("Membership Category: " + category);
//     }

// }
