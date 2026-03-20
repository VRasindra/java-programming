//9 Fitness Tracker Calorie Burn Calculator
// import java.util.Scanner;
// public class FitnessTracker {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         int totalDuration = 0;
//         int totalCalories = 0;

//         for (int i = 1; i <= N; i++) {
//             String exercise = sc.next();
//             int minutes = sc.nextInt();

//             int calories = 0;
//             String intensity = "";

//             switch (exercise) {
//                 case "Running":
//                     calories = minutes * 10;
//                     intensity = "High";
//                     break;
//                 case "Swimming":
//                     calories = minutes * 12;
//                     intensity = "High";
//                     break;
//                 case "Cycling":
//                     calories = minutes * 8;
//                     intensity = "Moderate";
//                     break;
//                 case "Gym":
//                     calories = minutes * 7;
//                     intensity = "Moderate";
//                     break;
//                 case "Walking":
//                     calories = minutes * 4;
//                     intensity = "Low";
//                     break;
//             }

//             totalDuration += minutes;
//             totalCalories += calories;

//             System.out.println("Session " + i + ": " + exercise);
//             System.out.println("Duration: " + minutes + " minutes");
//             System.out.println("Calories Burned: " + calories);
//             System.out.println("Intensity: " + intensity);
//             System.out.println();
//         }

//         double average = (double) totalCalories / N;
//         String level;

//         if (totalCalories < 300)
//             level = "Beginner";
//         else if (totalCalories <= 1000)
//             level = "Intermediate";
//         else
//             level = "Advanced";

//         System.out.println("Total Workouts: " + N);
//         System.out.println("Total Duration: " + totalDuration + " minutes");
//         System.out.println("Total Calories Burned: " + totalCalories);
//         System.out.println("Average Calories per Session: " + Math.round(average * 100.0) / 100.0);
//         System.out.println("Fitness Level: " + level);

//         sc.close();
//     }
// }
