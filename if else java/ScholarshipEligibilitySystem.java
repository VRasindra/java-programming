//5 University Scholarship Eligibility System
// import java.util.Scanner;
// public class ScholarshipEligibilitySystem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double gpa = sc.nextDouble();
//         double familyIncome = sc.nextDouble();
//         int extracurricular = sc.nextInt();
//         sc.nextLine();
//         String scholarshipType = sc.nextLine();
//         String eligibility = "Not Eligible";
//         double awardAmount = 0;
//         String awardCategory = "None";
//         if (gpa >= 2.5) {
//             if (scholarshipType.equalsIgnoreCase("Merit")) {
//                 if (gpa >= 3.8 && extracurricular >= 80) {
//                     eligibility = "Eligible";
//                     awardAmount = 25000;
//                     awardCategory = "Full";
//                 } else if (gpa >= 3.5 && extracurricular >= 70) {
//                     eligibility = "Eligible";
//                     awardAmount = 15000;
//                     awardCategory = "Partial";
//                 } else if (gpa >= 3.0 && extracurricular >= 60) {
//                     eligibility = "Eligible";
//                     awardAmount = 8000;
//                     awardCategory = "Minimal";
//                 }
//             } else if (scholarshipType.equalsIgnoreCase("Need-Based")) {
//                 if (familyIncome <= 30000 && gpa >= 3.5) {
//                     eligibility = "Eligible";
//                     awardAmount = 30000;
//                     awardCategory = "Full";
//                 } else if (familyIncome <= 50000 && gpa >= 3.0) {
//                     eligibility = "Eligible";
//                     awardAmount = 18000;
//                     awardCategory = "Partial";
//                 } else if (familyIncome <= 70000 && gpa >= 2.8) {
//                     eligibility = "Eligible";
//                     awardAmount = 10000;
//                     awardCategory = "Minimal";
//                 }
//             } else if (scholarshipType.equalsIgnoreCase("Sports")) {
//                 if (extracurricular >= 85 && gpa >= 3.0) {
//                     eligibility = "Eligible";
//                     awardAmount = 22000;
//                     awardCategory = "Full";
//                 } else if (extracurricular >= 75 && gpa >= 2.8) {
//                     eligibility = "Eligible";
//                     awardAmount = 20000;
//                     awardCategory = "Partial";
//                 } else if (extracurricular >= 65 && gpa >= 2.5) {
//                     eligibility = "Eligible";
//                     awardAmount = 12000;
//                     awardCategory = "Minimal";
//                 }
//             }
//         }
//         System.out.println("GPA: " + gpa);
//         System.out.println("Family Income: $" + familyIncome);
//         System.out.println("Extracurricular Score: " + extracurricular);
//         System.out.println("Scholarship Type: " + scholarshipType);
//         System.out.println("Eligibility: " + eligibility);
//         System.out.println("Award Amount: $" + awardAmount);
//         System.out.println("Award Category: " + awardCategory);

//         sc.close();
//     }

// }
