//Create a class Employee with empId,name,salary and sort the array list on the basis of user choice.

package myCollection;

import java.util.*;

class student1
{
	private int empId;
	private String name;
	private int salary;
	@Override
	public String toString() {
		return "student1 [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public student1(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
}

class EmpIdCompare implements Comparator<student1>
{
	@Override
	public int compare(student1 s1,student1 s2)
	{
		if(s1.getEmpId() == s2.getEmpId())
		{
			return 0;
		}
		else if(s1.getEmpId() > s2.getEmpId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

class EmpNameCompare implements Comparator<student1>
{
	@Override
	public int compare(student1 s1,student1 s2)
	{
		return s1.getName().compareTo(s2.getName());
	}
}

class EmpSalCompare implements Comparator<student1>
{
	@Override
	public int compare(student1 s1,student1 s2)
	{
		if(s1.getSalary() == s2.getSalary())
		{
			return 0;
		}
		else if(s1.getSalary() > s2.getSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<student1> slist = new ArrayList<student1>();
		slist.add(new student1(101,"deepa",30000));
		slist.add(new student1(108,"yash",60000));
		slist.add(new student1(106,"priya",90000));
		slist.add(new student1(104,"radha",40000));
		slist.add(new student1(107,"kamal",50000));
		
		System.out.println("============");
		System.out.println(slist);
		System.out.println("============");
		
		for(student1 s : slist)
		{
			System.out.println(s);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your choice: ");
		int c = sc.nextInt();
		
		
		switch(c)
		{
			case 1://if user choice is 1 then array list is sorted by id
				System.out.println("======sorted id======");
				
				Collections.sort(slist, new EmpIdCompare());
				for(student1 s  : slist)
				{
					System.out.println(s);
				}
				break;
				
			case 2://if user choice is 2 then array list is sorted by name
				System.out.println("======sorted name======");
				
				Collections.sort(slist, new EmpNameCompare());
				for(student1 s  : slist)
				{
					System.out.println(s);
				}
				break;
				
			case 3://if user choice is 3 then array list is sorted by salary
				System.out.println("======sorted salary======");
				
				Collections.sort(slist, new EmpSalCompare());
				for(student1 s  : slist)
				{
					System.out.println(s);
				}
				break;
				
			default:
				System.out.println("enter choice between 1,2,3");
				break;
		
		}

	}

}
