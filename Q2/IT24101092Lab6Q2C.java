import java.util.Scanner;

public class IT24101092Lab6Q2C {
       public static void main(String[] args) {

        Scanner ni = new Scanner(System.in);

        int n = 1;
        int number;
        String result = " ";
        int sum = 0;

        System.out.println("Please enter 10 numbers : ");

        while(n <= 10)
        {
         System.out.print("Enter number "+ n +" : ");
         number = ni.nextInt();
         result = result + number + " ";
         sum =  sum + number;
         n++;
        }

         System.out.print("The numbers you entered are : ");
         System.out.println(result); 

         double average = sum/10;
         System.out.println("Sum of the numbers : " +sum);
         System.out.println("Average of the numbers : " +average);
      } 
 }

         
 
