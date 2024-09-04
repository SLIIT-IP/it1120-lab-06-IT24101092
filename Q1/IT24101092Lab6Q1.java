import java.util.Scanner;

public class IT24101092Lab6Q1 {
       public static void main(String[] args) {

       Scanner sq = new Scanner(System.in);
 
         System.out.print("Enter a number : ");
         double number = sq.nextInt();

         double sqr = Math.pow(number,2);
         System.out.println("The square of " +number +" is : " +sqr);
    
         double sqr_root = Math.sqrt(number);
         System.out.println("The square root of " +number +" is : " +sqr_root);
         }
  }


