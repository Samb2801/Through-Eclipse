package encapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
			String a = "asx";
			
			laptop lp = new laptop();
			lp.setPrice(3000);
	
		}
	
}

class laptop
{
	int ram;
	private int price;	//it can not accessible for any one even cannot accessible for admin too.for changing price make one function.
	
	public void setPrice(int price)
	{
		//is the user admin
		boolean isAdmin = true;
		if(!isAdmin) {
			System.out.println("You can not set price..");
		}
		else {
		this.price = price;
		System.out.println("Price of laptop is:= "+price);
		}}
	
}