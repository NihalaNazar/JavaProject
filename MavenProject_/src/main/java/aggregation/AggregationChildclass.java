package aggregation;

public class AggregationChildclass 
{
	int c;
	AggregationParentclass j;
	
	public AggregationChildclass(int c,AggregationParentclass j)
	{
		this.c=c;
		this.j=j;
		
	}
public void print()
{
	System.out.println(j.a);
	System.out.println(j.b);
	System.out.println(c);
}
	public static void main(String[] args) 
	{
		AggregationParentclass obj=new AggregationParentclass(5,10);
		AggregationChildclass obj1=new AggregationChildclass(15,obj);
		obj1.print();

	}

}
