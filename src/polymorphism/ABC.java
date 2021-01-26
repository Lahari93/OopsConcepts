package polymorphism;

public class ABC {
	public static void main(String[] args) {
		
		ABC obj = new ABC();
		obj.add(10.0,20);
	}
	
	//Method Overloading---Compile time polymorphism
	public void add(int a, double b)
	{
		System.out.println(a+b);
		
	}
	public void add(double a , int b)
	{
	System.out.println(a+b);
		
	}
	
	public void add(double a, double b)
	{
		System.out.println(a+b);	
	}

}
