//9 Corporate Tax Bracket Calculator
// import java.util.Scanner;
// public class CorporateTaxCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double revenue = sc.nextDouble();
//         sc.nextLine();
//         String type = sc.nextLine();
//         double expenses = sc.nextDouble();
//         double credits = sc.nextDouble();
//         double taxableIncome = revenue - expenses;
//         double taxRate = 0;
//         if (type.equalsIgnoreCase("C-Corp")) {
//             if (taxableIncome < 500000) taxRate = 21;
//             else if (taxableIncome <= 1000000) taxRate = 24;
//             else if (taxableIncome <= 2000000) taxRate = 28;
//             else taxRate = 30;
//         } else if (type.equalsIgnoreCase("S-Corp")) {
//             if (taxableIncome < 500000) taxRate = 20;
//             else if (taxableIncome <= 1000000) taxRate = 25;
//             else taxRate = 28;
//         } else if (type.equalsIgnoreCase("LLC")) {
//             if (taxableIncome < 200000) taxRate = 15;
//             else if (taxableIncome <= 500000) taxRate = 18;
//             else taxRate = 22;
//         } else {
//             if (taxableIncome < 300000) taxRate = 18;
//             else if (taxableIncome <= 800000) taxRate = 22;
//             else taxRate = 26;
//         }
//         double grossTax = taxableIncome * taxRate / 100;
//         double netTax = grossTax - credits;
//         if (netTax < 0) netTax = 0;
//         double effectiveRate = (netTax / revenue) * 100;
//         System.out.println("Annual Revenue: $" + revenue);
//         System.out.println("Business Type: " + type);
//         System.out.println("Deductible Expenses: $" + expenses);
//         System.out.println("Tax Credits: $" + credits);
//         System.out.println("Taxable Income: $" + taxableIncome);
//         System.out.println("Tax Rate: " + (int)taxRate + "%");
//         System.out.println("Gross Tax: $" + grossTax);
//         System.out.println("Net Tax After Credits: $" + netTax);
//         System.out.println("Effective Tax Rate: " + String.format("%.2f", effectiveRate) + "%");

//         sc.close();
//     }

// }
