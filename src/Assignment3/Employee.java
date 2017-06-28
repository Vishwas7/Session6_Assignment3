package Assignment3;

public class Employee {
	int id = 121;
	String name= "Vishwas";

	public static void main(String[] args) {
		
	
		
		Employee e1= new Employee();
		System.out.println("print the value of id : "+  e1.id);
		System.out.println("Print the value of name : "+  e1.name);
		
		e1.id=501;
		e1.name="Vishaws1";
		
		System.out.println("print the value of id : "+  e1.id);
		System.out.println("Print the value of name : "+  e1.name);

	}

}
