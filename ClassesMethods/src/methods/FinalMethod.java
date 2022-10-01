package methods;

public class FinalMethod {

	public static void main(String[] args) {
		Teacher te = new Teacher();
		me m = new me();
		you g = new you();
		te.cal();
		m.mult();
		g.add();
		
	}

}

	class Teacher
	{
		int a = 100;
		final void cal()
		{
			System.out.println("Super Class Father\n");
		}
	}
	
	class me extends Teacher
	{
		int b = 100;
		void mult() {
			int mult = a * b;
			System.out.println("Multiplication:= "+mult);
		}
	}
	
	class you extends Teacher
	{
		int c = 200;
		void add() 
		{
			int add = a + c;
			System.out.println("Addition:= "+add);
		}
	}
