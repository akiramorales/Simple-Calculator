
public class CalculatorMain
{

	public static void main(String[] args)
	{
		//This is how we create an object
		// new is a java key word which creates an object
		Calculator calculator = new Calculator();
		System.out.println("The sum of the two numbers is " + calculator.add(2, 6));
		System.out.println("The difference of the two numbers is " + calculator.subt(5,4));
	}
}
