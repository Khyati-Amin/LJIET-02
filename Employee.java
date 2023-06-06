package cntobj;

public class Employee 
{
	//declaring static variable
	static int cnt =0;
	
	//declaring a constructor
	Employee()
	{
		cnt += 1;
	}
	
	//declaring static method
	public static void getCnt()
	{
		System.out.println("total count of object in Employee class is "+cnt);
	}

	public static void main(String[] args) 
	{
		Employee[] e = new Employee[5];
		for(int i=0; i<5; i++)
		{
			e[i] = new Employee();
		}
		
		//call static method
		Employee.getCnt();
	}
}
