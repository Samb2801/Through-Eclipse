//final variable with an static variable.
package methods;

public class FinalWithStaticVariable {

	public static void main(String[] args) {
	Static st = new Static();
System.out.println("Roll:= "+st.roll);
	}

}
 //1st method
 class Static
 {
	 static final int roll;
	 static
	 {
		 roll =101;
		// roll = 102;
	 }
 }


//2nd method
//   class Static
//   {
//	   static final int roll = 101;
//   }