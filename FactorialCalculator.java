
import java.util.Scanner;
public class FactorialCalculator {
  public static void main(String[] args) {
     int nonnegative = getNonNegativeInteger();
     calculateFactorial(nonnegative);
  }
  public static int getNonNegativeInteger() {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a non-negative integer: ");
    int nonnegative = input.nextInt();
    
    if (nonnegative >= 0){
        
    }else {
        System.out.print("ERROR! Please Enter a non-negative integer");
    }
    return nonnegative;
  }
  
  public static int calculateFactorial(int nonnegative) {
    if (nonnegative == 0){
        System.out.print("The Factorial of 0 is 1" );
    } 
        long factorial = 1;
        for(int i = 1; i <= nonnegative ; ++i)
        {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", nonnegative, factorial);
        
        return nonnegative;
  }
    }
    
    
    
  
  
