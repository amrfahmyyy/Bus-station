package user;
import main.*;
public  class  Employee {
	
	
	void print()
	{}
	
	public void welcome()
	{
		System.out.println("Welcome to the system\t");
	}

	
}
class Drivers  extends Employee
{

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.print("Driver");

	}
	
}
    class Managers extends Employee
{

	@Override
	public
	void print() {
		System.out.print("Manager");
		
	}
	
	
}