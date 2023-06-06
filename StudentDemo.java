//WAP to create array of 5 students using do while loop. Take student details from user.
package array;
import java.util.*;

class Demo
{
	Scanner sc = new Scanner(System.in);
	int rollno;
	String name;
	int marks;
	String ans;
	
	public void setData()
	{
		System.out.println("enter rollno: ");
		rollno = sc.nextInt();
		System.out.println("enter name: ");
		name = sc.next();
		System.out.println("enter marks: ");
		marks = sc.nextInt();
	}
	public void getData()
	{
		System.out.println("rollno is "+rollno+", name is "+name+", marks are "+marks);
		
		
	}
}

public class StudentDemo {

	public static void main(String[] args) {
		
		Demo[] d = new Demo[5];
		
		int i=0;
		
		do
		{
			d[i]= new Demo();
			d[i].setData();
			d[i].getData();
			i++;
		}
		while(i<5);
	}

}
