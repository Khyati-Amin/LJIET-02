package lec1;

import java.util.Scanner;

public class Circle
{
	double radius;
	double area;
	double circumference;
	final double pi = 3.14;
	
	public void setRadius()
	{
		Scanner sc = new Scanner(System.in);
		// Scanner class is used to take input from user.
		
		System.out.println("enter radius of circle: ");
		radius = sc.nextDouble();
		// nextDouble() method is used to scan the next token of input as a double.
		
	}
	public void getRadius()
	{
		area = pi * radius * radius;
		System.out.println("area of circle is "+area);
		
		circumference = 2 * pi * radius;
		System.out.println("circumference of circle is "+circumference);	
	}

	public static void main(String[] args)
	{
		Circle c1 = new Circle();
		c1.setRadius();
		c1.getRadius();
	}

}
