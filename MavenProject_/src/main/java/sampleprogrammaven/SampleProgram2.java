package sampleprogrammaven;

public class SampleProgram2 
{
	int sum;
	public SampleProgram2 (int a,int b)
	{
		sum =a+b;
		this.print();
		
	}
	public void print()
	{
		System.out.println(sum);
	}
	public static void main(String []args)
	{
		SampleProgram2 j=new SampleProgram2(10,20);
	
	}

}
