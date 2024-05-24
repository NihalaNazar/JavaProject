package exceptioneligibility;

public class Eligibility 
{
	int age=4;
	public void eligibility()
	{
		if(age>=18)
		
		{
			System.out.println("Eligible");
			
		}
		else
		{
			System.out.println(" Not Eligible");
            throw new ArithmeticException("Not Eligible");
		}
		}

	public static void main(String[] args) {
		Eligibility obj=new Eligibility();
		obj.eligibility();

	}

}
