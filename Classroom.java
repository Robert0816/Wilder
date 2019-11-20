public class Classroom {

	public static void main(String[] args) {
		
		Wilder Wilder  = new Wilder("Hans", false); 
		Wilder Wilder2  = new Wilder("Robert", true); 
		
		System.out.println(Wilder.whoAmI());
		System.out.println(Wilder2.whoAmI());
	/*
		Wilder person = new Wilder("Robert", true);  
		//Wilder person = new Wilder("Hans", false);  
		
		if(person.getPresent() == true) {
		   System.out.println("My name is " + person.getFirstname() + " and I am present");
		}else {
			System.out.println("My name is " + person.getFirstname() + " and I am not present");
		}
		//System.out.println("My name is " + person.getFirstname() + " and I am " + person.getPresent());
 			*/	
		}
	
	
}
