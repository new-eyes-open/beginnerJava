import java.util.Scanner;
 
//A usual standard naming convention for classes is capitalizing letters for your class names
public class CylinderVolumeRev {
	
  public static double calculateCylinderVolume(double radius, double length){
     double area = Math.pow(radius, 2) * Math.PI;
     double volume = area * length;
     return volume; //Returns the value your equation arrives at
 
     //To make this method even shorter, you can combine the last two lines into one..
     //But I'll leave that up to you to figure out! (Heck, you could put everything here into one line)
  }
 
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the radius and length of a cylinder, for example,");
     System.out.println("4 11.5");
     //You can create a new object and give it a value (or instantiate it) all in the same line
     double radius = input.nextDouble();
     double length = input.nextDouble();
     double volume = calculateCylinderVolume(radius, length);
     System.out.println("The volume of the cylinder is " + volume);
 
     //But wait, there's more!  You can call the method again without having to rewrite extra lines
     System.out.println("With a radius of 5 and length of 12.5, the volume is: " + calculateCylinderVolume(5, 12.5));
  }
}
    //Moving your formula out into it's own method allows you to go back and edit it more easily,
    // as well as easier access to this snippet for future projects
 
