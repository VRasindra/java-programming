//23 Investment Portfolio Risk Assessment
// import java.util.Scanner;
// public class InvestmentRiskAssessment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int stocks = sc.nextInt();
//         int years = sc.nextInt();
//         sc.nextLine();
//         String tolerance = sc.nextLine();
//         String volatility = sc.nextLine();

//         int score = stocks;

//         if(years<=5 && stocks>50) score+=20;
//         else if(years<=10 && stocks>60) score+=10;
//         else if(years<=20 && stocks>80) score+=5;

//         if(volatility.equals("Medium")) score+=10;
//         else if(volatility.equals("High")) score+=20;

//         if(score>100) score=100;

//         String category="";
//         if(score<=30) category="Low";
//         else if(score<=60) category="Moderate";
//         else if(score<=80) category="High";
//         else category="Very High";

//         String alignment="";
//         if(tolerance.equals("Conservative")) {
//             if(category.equals("Low")) alignment="Well Aligned";
//             else if(category.equals("Moderate")) alignment="Acceptable";
//             else alignment="Misaligned";
//         } else if(tolerance.equals("Moderate")) {
//             if(category.equals("Moderate")) alignment="Well Aligned";
//             else if(category.equals("Low")||category.equals("High")) alignment="Acceptable";
//             else alignment="Misaligned";
//         } else {
//             if(category.equals("High")||category.equals("Very High")) alignment="Well Aligned";
//             else if(category.equals("Moderate")) alignment="Acceptable";
//             else alignment="Misaligned";
//         }

//         System.out.println("Stock Allocation: "+stocks+"%");
//         System.out.println("Bond Allocation: "+(100-stocks)+"%");
//         System.out.println("Investment Horizon: "+years+" years");
//         System.out.println("Risk Tolerance: "+tolerance);
//         System.out.println("Market Volatility: "+volatility);
//         System.out.println("Portfolio Risk Score: "+score+"/100");
//         System.out.println("Risk Category: "+category);
//         System.out.println("Alignment Status: "+alignment);
//     }
// }

