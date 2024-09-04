import java.util.Scanner;

public class IT24101092Lab6Q2B {
       public static void main(String[] args) {

        Scanner ni = new Scanner(System.in);

        int n = 1;
        int number;
        String result = " ";

        System.out.println("Please enter 10 numbers : ");

        while(n <= 10)
        {
         System.out.print("Enter number "+ n +" : ");
         number = ni.nextInt();
         result = result + number + " ";
         n++;
        }
         System.out.print("The numbers you entered are : ");
         System.out.print(result);  
      } 
 }

         
 
