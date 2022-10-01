//Abstract Class:= a class that is declared with abstract keyword is known as abstract class in java.
//It can have abstract and non-abstract methods.
//it needs to be extended and its method implemented.
//objects of an abstract class cannot be created.
//A method that is declared as abstract and does not have implementation is known as abstract methods.
//**Rules**
//1.We cannot use abstract classes to instantiate objects directly.
//2.objects of an abstract classes cannot be created.
//3.the abstract method of an abstract class must be define in its subclass.
//4.If there is any abstract method in class ,that class must be abstracted.
//5. a class can be abstract without having abstract method.
//6.It is necessary to declare all methods abstract in abstract class.
//7.We cannot declare abstract constructor or abstract static methods.
//8.If you are extending any abstract class that have abstract methods, you must either provide 
//the implementation of method or make tis class abstract.

package methods;

public class AbstractClass {

	public static void main(String[] args) {
		boy b = new boy();
		girl g = new girl();
		b.display();				//Calling method of sub class son 
		g.display();				//calling method of sub class girl

	}

}

	abstract class DAD					//abstract super class
	{
		abstract void display();
			
	}
	
	class boy extends DAD				//sub class boy
	{
		void display() {
			System.out.println("Abstract method defined in sub class son\n");
		}
	}
	
	class girl extends DAD				//sub class girl
	{
		void display() {
			System.out.println("Abstract method define in sub class girl\n");
		}
	}
