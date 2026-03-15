//25  Mobile Data Plan Optimizer
// import java.util.Scanner;
// public class MobilePlanOptimizer {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double data = sc.nextDouble();
//         int minutes = sc.nextInt();
//         sc.nextLine();
//         String intl = sc.nextLine();
//         String device = sc.nextLine();

//         String plan="";
//         double baseCost=0;

//         if(data<=2) { plan="Basic 2GB"; baseCost=25; }
//         else if(data<=5) { plan="Standard 5GB"; baseCost=40; }
//         else if(data<=20) { plan="Premium Unlimited"; baseCost=70; }
//         else { plan="Unlimited Max"; baseCost=90; }

//         double dataOver=0;
//         if(plan.equals("Standard 5GB") && data>5)
//             dataOver=(data-5)*10;

//         double callOver=0;
//         if(minutes>1000 && !plan.contains("Unlimited"))
//             callOver=(minutes-1000)*0.05;

//         double intlFee=0;
//         if(intl.equals("Light")) intlFee=5;
//         else if(intl.equals("Moderate")) intlFee=15;
//         else if(intl.equals("Heavy")) intlFee=30;

//         double deviceFee=0;
//         if(device.equals("Smartphone")||device.equals("Tablet")) deviceFee=10;
//         else if(device.equals("Hotspot")) deviceFee=20;

//         double total=baseCost+dataOver+callOver+intlFee+deviceFee;

//         String category="Budget";
//         if(plan.contains("Standard")) category="Standard";
//         else if(plan.contains("Premium")) category="Premium";
//         else if(plan.contains("Unlimited")) category="Unlimited";

//         System.out.println("Data Usage: "+data+" GB");
//         System.out.println("Call Minutes: "+minutes+" minutes");
//         System.out.println("International Usage: "+intl);
//         System.out.println("Device Type: "+device);
//         System.out.println("Recommended Plan: "+plan);
//         System.out.println("Base Plan Cost: $"+baseCost);
//         System.out.println("Data Overage: $"+dataOver);
//         System.out.println("Call Overage: $"+callOver);
//         System.out.println("International Fee: $"+intlFee);
//         System.out.println("Device Fee: $"+deviceFee);
//         System.out.println("Total Monthly Cost: $"+total);
//         System.out.println("Plan Category: "+category);
//     }
// }
