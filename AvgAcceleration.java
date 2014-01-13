import java.util.Scanner;

public class AvgAcceleration {
 //create method for calculating average acceleration over a certain time	
 public static double calculateAvgAcceleration(double velocity1, double velocity2, double time){
    double avgAcceleration = (velocity2 - velocity1) / time;
    return avgAcceleration;
  }
 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Prompt user input
    System.out.println("Enter the starting and ending velocity in meters/second and");
    System.out.println("the time of travel in seconds, for example, 4 11.5 20");
    //Assign input to variables
    double velocity1 = input.nextDouble();
    double velocity2 = input.nextDouble();
    double time = input.nextDouble();
    //Call method and print calculation
    double averageAcc = calculateAvgAcceleration(velocity1, velocity2, time);
    System.out.println("The average acceleration is " + averageAcc + " meters/second.");
  }
}

 
