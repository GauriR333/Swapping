
public class SwappingWIthoutTemp {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		SwappingWIthoutTemp sw1 = new SwappingWIthoutTemp();
		sw1.display(a,b);
		a = a + b;
		b = a - b;
		a = a - b;
		sw1.display(a,b);
	}

	void display(int a,int b) {
		System.out.println("a = " + a + " b = " + b);

	}
}
