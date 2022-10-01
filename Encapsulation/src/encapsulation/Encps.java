package encapsulation;

import java.util.Scanner;

public class Encps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		encaps e = new encaps();
		System.out.println("Enter Username: ");
		String name = sc.next();
		e.setUsername(name);
		System.out.println("Enter Password: ");
		String pass = sc.next();
		e.setUsername(pass);
		
		if(name.equals("Samarth") && pass.equals("123"))
		{
			System.out.println("**login successful for "+name+"**");

		}
		else
		{
			
			System.out.println("Credentials are not valid...");
			System.out.println("please enter valid username and password");
			System.out.println("Need to provide the correct data ");
		}
		
	}

}
