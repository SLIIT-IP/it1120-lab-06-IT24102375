import java.util.Scanner;

public class IT24102375Lab6Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sumOfSquares = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

          
          
            if (number == -99) {
                break;
            }

          

            
            if (number > 0) {
                 
                count++;
            } else {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
            }
        }

        
           System.out.println(" ");
           System.out.println(" ");
        

        
         double rms = Math.sqrt((double) sumOfSquares / count);
         System.out.println("The Root Mean Square (RMS) is: " + rms);
        
                

   }
}