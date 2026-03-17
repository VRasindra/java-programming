//7 Electricity Bill Calculator
// import java.util.Scanner;
// public class ElectricityBillCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         int totalUnits = 0;
//         double totalRevenue = 0;

//         for (int i = 1; i <= N; i++) {
//             String id = sc.next();
//             int units = sc.nextInt();

//             double bill = 0;

//             if (units <= 100)
//                 bill = units * 0.10;
//             else if (units <= 200)
//                 bill = (100 * 0.10) + ((units - 100) * 0.13);
//             else if (units <= 300)
//                 bill = (100 * 0.10) + (100 * 0.13) + ((units - 200) * 0.16);
//             else
//                 bill = (100 * 0.10) + (100 * 0.13) + (100 * 0.16) + ((units - 300) * 0.20);

//             String category;
//             if (units <= 200)
//                 category = "Low Usage";
//             else if (units <= 300)
//                 category = "Medium Usage";
//             else
//                 category = "High Usage";

//             totalUnits += units;
//             totalRevenue += bill;

//             System.out.println("Consumer ID: " + id);
//             System.out.println("Units Consumed: " + units);
//             System.out.println("Bill Amount: $" + Math.round(bill * 100.0) / 100.0);
//             System.out.println("Category: " + category);
//             System.out.println();
//         }

//         double average = totalRevenue / N;

//         System.out.println("Total Consumers: " + N);
//         System.out.println("Total Units Consumed: " + totalUnits);
//         System.out.println("Total Revenue: $" + Math.round(totalRevenue * 100.0) / 100.0);
//         System.out.println("Average Bill: $" + Math.round(average * 100.0) / 100.0);

//         sc.close();
//     }
// }
