//15 Collatz sequence
// import java.util.Scanner;
// public class CollatzSequence{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int steps = 0;
//       System.out.println("Collatz Sequence");
//       do{
//         System.out.print(n +" ");
//         if(n==1)break;
//         if(n%2==0)n/=2;
//         else n=3*n+1;
//         steps++;
//       } while (n!=1);
//       System.out.println("\nSteps:" + steps);
//    }
// }