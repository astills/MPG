
import java.util.Scanner; 

class Eight {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);  
    System.out.print("Gallons: "); 
    Double gallons = s.nextDouble(); 
    System.out.print("Car efficiency: "); 
    int mpg = s.nextInt(); 
    System.out.print("Price per gallon: "); 
    Double price = s.nextDouble(); 
    System.out.println( 
      " Cost per 100 miles is: " + (100.0 / mpg * price) 
                      );
    System.out.println("Autonomy: " + ( gallons * mpg )); 
  }
  
}


## computes the amount of gas used in the given trip..lets driver know how far they can go based on MPG




