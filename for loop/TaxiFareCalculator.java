//15: Taxi Fare Calculator
// import java.util.Scanner;
// public class TaxiFareCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         double totalDistance = 0;
//         double totalRevenue = 0;
//         for (int i = 1; i <= N; i++) {
//             double distance = sc.nextDouble();
//             String time = sc.next();

//             double baseFare = 3.0;
//             double distanceCharge = distance * 1.0;
//             double surcharge = 0;
//             if (time.equals("Evening")) surcharge = 3;
//             else if (time.equals("Night")) surcharge = 5;
//             double totalFare = baseFare + distanceCharge + surcharge;
//             totalDistance += distance;
//             totalRevenue += totalFare;
//             System.out.println("Ride " + i);
//             System.out.println("Distance: " + distance + " km");
//             System.out.println("Time: " + time);
//             System.out.println("Base Fare: $" + baseFare);
//             System.out.println("Distance Charge: $" + distanceCharge);
//             System.out.println("Time Surcharge: $" + surcharge);
//             System.out.println("Total Fare: $" + totalFare);
//             System.out.println();
//         }
//         double average = totalRevenue / N;
//         System.out.println("Total Rides: " + N);
//         System.out.println("Total Distance: " + totalDistance + " km");
//         System.out.println("Total Revenue: $" + totalRevenue);
//         System.out.printf("Average Fare: $%.2f\n", average);
//     }
// }


