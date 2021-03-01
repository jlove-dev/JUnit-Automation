package Contact;

public class Contact { 
	
	//begin private variables
	private String ID;
	private String firstName;
	private String lastName;
	private String Number;
	private String Address;
	//end private variables
	
	/*
	 * Default constructor to create a contact object
	 * @param {String} Contact.ID - Unique ID for the object (cannot be altered)
	 * @param {String} Contact.firstName - first name of the individual
	 * @param {String} Contact.lastName - last name of the individual
	 * @param {String} Contact.Number - 10 digit phone number (no check for letters yet)
	 * @param {String} Contact.Address - Street address of individual
	 */
	public Contact (String ID, String firstName, String lastName, String Number, String Address) {
		
		//throwable exceptions based on requirements
		
		//ID cannot be null or greater than 10 char
		if (ID == null || ID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		//first name cannot be null or greater than 10 char
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		//last name cannot be null or greater than 10 char
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		//phone number cannot be null and must be equal to 10 char
		if (Number == null || Number.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		//address cannot be null or greater than 10 char
		if (Address == null || Address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		//no exceptions were thrown, sets the local values to those passed in
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Number = Number;
		this.Address = Address;
	}
	
	//getters for variables
	public String getID() {
		return ID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() { 
		return lastName;
	}
	
	public String getNumber() {
		return Number;
	}
	
	public String getAddress() {
		return Address;
	}
	
	//setters for variables
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setNumber(String Number) {
		this.Number = Number;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
}
