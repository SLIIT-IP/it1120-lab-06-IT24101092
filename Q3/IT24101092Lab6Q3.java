import java.util.Scanner;

public class IT24101092Lab6Q3 {
       public static void main(String[] args) {

       Scanner sr = new Scanner(System.in);
     
       double sum_of_squares = 0;
       int count = 1;
  
       System.out.println("Enter positive integers (terminate input with -99) : ");
 
       while(true) {
       System.out.print("Enter a number : ");
       int number = sr.nextInt();
    
       if(number == -99) {
       break;
       } 
   
       if (number < 0) {
       System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
       }

       sum_of_squares = sum_of_squares + Math.pow(number, 2);
       count++;
     }

       double rms = Math.sqrt(sum_of_squares/count);
       System.out.println("The Root Mean Square (RMS) : " + sum_of_squares);
    }
  }
 
       
       