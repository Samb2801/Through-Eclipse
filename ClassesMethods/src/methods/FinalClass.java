package methods;

public class FinalClass {

	public static void main(String[] args) {
		teacher te = new teacher();
		Men m = new Men();
		Women g = new Women();
		te.cal();
		m.mult();
		g.add();
		

	}

}

final class teacher
{
	int a = 100;
	final void cal()
	{
		System.out.println("Super Class Father\n");
	}
}


class Men 
{
	int a = 50;
	int b = 100;
	void mult() {
		int mult = a * b;
		System.out.println("Multiplication:= "+mult);
	}
}

class Women 
{
	int a = 800;
	int c = 200;
	void add() 
	{
		int add = a + c;
		System.out.println("Addition:= "+add);
	}
}

