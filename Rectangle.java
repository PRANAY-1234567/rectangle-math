import java.util.Scanner;
class Rectangle
{
	public static void main(String [] args)
	{
      Scanner inp = new Scanner(System.in);
      System.out.print("Enter the length of rectangle :");
      double l = inp.nextDouble();
      System.out.print("Enter the breadth of rectangle :");
      double b = inp.nextDouble();
      double a = l*b;
      double p = 2*(l+b);
      System.out.println("Area of rectangle :"+a);
      System.out.println("Perimeter of rectangle :"+p);
	}
}