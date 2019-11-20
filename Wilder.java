public class Wilder {

	private String firstname;  // Attribute
	private Boolean present;
	
	public String getFirstname() {      // getters
		return firstname;
		}
	public void setFirstname(String firstname) {       //setters
		this.firstname = firstname;
		}
	public Boolean getPresent() {
		return present;
			}
	public void setPresent(Boolean present) {
		this.present = present;
		
	}
  
	public Wilder(String firstname,Boolean present) {   //constructor
	
		this.firstname = firstname;
		this.present = present;
		
	}

	public String whoAmI() {
		
		if(present == true) {
		    return "My name is " + this.firstname + " and I am present"; 
		}else {
			return "My name is " + this.firstname + " and I am not present"; 			
		}
	
	}
	
	
}