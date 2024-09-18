import java.util.Scanner;


public class IT24102375Lab6Q1{

   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num = input.nextInt();

    int squared = num*num;
    double squareRoot = Math.sqrt(num);
 
    System.out.println("The square of "+num+"is : " +squared);
    System.out.println("The square root of "+num+"is : " +squareRoot);

  }
}