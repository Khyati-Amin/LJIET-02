//WAP to create array of 5 students and take student details from user.
package array;

import java.util.*;

class student
{
	Scanner sc = new Scanner(System.in);
	public int rollno;
	public String studentName;
	public int marks;
	
	public void setData()
	{
		System.out.println("enter rollno: ");
		rollno = sc.nextInt();
		System.out.println("enter name: ");
		studentName = sc.next();
		System.out.println("enter marks: ");
		marks = sc.nextInt();
	}
	
	public void getData()
	{
		System.out.println("rollno is "+rollno+", name is "+studentName+", marks are "+marks);
	}
	
	
}
public class arrayOfObject {
	

	public static void main(String[] args) {
				
		student[] s = new student[5];
		
		for(int i=0;i<5;i++)
		{
			s[i]= new student();
			s[i].setData();
		}
		
		for(int i=0;i<5;i++)
		{
			s[i].getData();
		}
		
	}

}
