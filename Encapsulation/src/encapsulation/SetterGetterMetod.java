package encapsulation;

public class SetterGetterMetod {
		private int age;
		private String name;
		
//		public int getAge()
//		{
//			return age;
//		}
//		
//		public void setAge(int age)
//		{
//			if(age > 20)
//			{
//				System.out.println("!!!You are not eligible");
//			}
//			else
//			{
//				this.age = age;
//			}
//		}
		
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			if(name != "Sam")
			{
				System.out.println("Name is not valid..");
			}
			else
			{
				this.name = name;
			}
		}
}
