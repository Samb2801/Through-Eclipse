package methods;

public class FinalWithLocalVariable {

	public static void main(String[] args) {
		feek obj = new feek();
		obj.display();

	}

}

	class feek 
	{
		
		void display() {
			final int roll;
			roll = 100;
		//	roll = 101;
			System.out.println("Roll:= "+roll);
		}
	}