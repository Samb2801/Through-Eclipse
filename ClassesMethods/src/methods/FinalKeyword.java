//final with Instance Variable
//final keyword is a way of making a variable as read-only.Its value is set once and then cannot be changed.
// value of final variable can not be changed ever. 
//If you want to initialize final variable value then you have to initialize it in only constructor. 
package methods;

public class FinalKeyword {

	public static void main(String[] args) {
		value va = new value();
		final int roll = 10;
		
		System.out.println(roll);
		System.out.println("Name:= "+va.name);
		
	}

}

	class value{
		
		final String  name ;
		value()
		{
			name = "Samarth Bhandare";
			
		}
	}