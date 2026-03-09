//22 Electricity Bill Calculator with Tiered Pricing
// import java.util.Scanner;
// public class ElectricityBillCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int units = sc.nextInt();
//         sc.nextLine();
//         String type = sc.nextLine();
//         String season = sc.nextLine();
//         String payment = sc.nextLine();

//         double r1=0, r2=0, r3=0, r4=0;

//         if(type.equals("Residential")) {
//             r1=0.10; r2=0.15; r3=0.25; r4=0.30;
//         } else if(type.equals("Commercial")) {
//             r1=0.12; r2=0.18; r3=0.25; r4=0.25;
//         } else if(type.equals("Industrial")) {
//             r1=0.08; r2=0.12; r3=0.20; r4=0.20;
//         }

//         int t1 = Math.min(units,100);
//         int t2 = Math.min(Math.max(units-100,0),200);
//         int t3 = Math.min(Math.max(units-300,0),200);
//         int t4 = Math.max(units-500,0);

//         double c1=t1*r1;
//         double c2=t2*r2;
//         double c3=t3*r3;
//         double c4=t4*r4;

//         double total = c1+c2+c3+c4;

//         double seasonAdj=0;
//         if(season.equals("Summer")) seasonAdj=15;
//         else if(season.equals("Winter")) seasonAdj=-10;

//         total = total*(1+seasonAdj/100);

//         double payDisc=0;
//         if(payment.equals("Auto-Pay")) payDisc=5;
//         else if(payment.equals("Online")) payDisc=3;

//         total = total*(1-payDisc/100);

//         double avg = units==0?0: total/units;

//         System.out.println("Units Consumed: "+units+" kWh");
//         System.out.println("Customer Type: "+type);
//         System.out.println("Season: "+season);
//         System.out.println("Payment Method: "+payment);
//         System.out.println("Tier 1 Cost (0-100): $"+c1);
//         System.out.println("Tier 2 Cost (101-300): $"+c2);
//         System.out.println("Tier 3 Cost (301-500): $"+c3);
//         System.out.println("Tier 4 Cost (501+): $"+c4);
//         System.out.println("Seasonal Adjustment: "+seasonAdj+"%");
//         System.out.println("Payment Discount: "+payDisc+"%");
//         System.out.printf("Total Bill: $%.2f\n", total);
//         System.out.printf("Average Rate: $%.2f/kWh\n", avg);
//     }

// }