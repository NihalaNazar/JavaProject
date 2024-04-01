package sampleprogrammaven;

public class AddTwoNum {
	int a = 10;
	int b = 25;

	public AddTwoNum(int c) {
		c = a + b;
		System.out.println("Sum of two numbers is= " + c);
	}

	public static void main(String[] args) {
		AddTwoNum obj = new AddTwoNum(15);
	}
}
