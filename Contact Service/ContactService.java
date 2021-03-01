package Contact;

import java.util.*;

public class ContactService {
    
	//initialize an ArrayList to hold all of the contacts in memory
	public static List<Contact>ContactList = new ArrayList<Contact>();

	/*
	 * Function to add contact to ArrayList
	 * @param {Contact} - Requires passed in Contact object
	 */
	public static void addContact(Contact addContact) {
		
		if (ContactList.size() > 0) { //check if the list is empty
			
			//list is not empty, iterate over the elements
			for (int i = 0; i < ContactList.size(); i++) {
				
				//checks if the current element is equal to the new one to be added
				if (ContactList.get(i).getID() == addContact.getID()) {
					
					//ID already exists, throws exception
					throw new IllegalArgumentException("ID already in use");
				}
			}
		}

		//no exception found, add the new Contact object to the end of the list
		ContactList.add(addContact);

	}
	
	/*
	 * Function to delete a contact based on a unique ID
	 * @param {String} ID - Pass in a String ID to find a match
	 */
	public static void deleteContact(String ID){
		
		//iterate over list
		for (int i = 0; i < ContactList.size(); i++){
			
			if (ContactList.get(i).getID() == ID) { //check if current element equals passed in ID
				
				//match found, remove the element from the list
				ContactList.remove(i);
				
			} else {//no match found at current position
				
				continue;
				
				//FIXME - add return value when the ID isn't found
			}
		}
		

	}
	
	/*
	 * Function to update first name of Contact object
	 * @param {String} ID - find the specific object stored in memory
	 * @param {String} firstName - first name of individual to be changed to
	 */
	public void updateFirstName(String ID, String firstName) {
		
		//iterate over list
		for (int i = 0; i < ContactList.size(); i++) {
			
			//check current element ID equals passed in ID
			if (ContactList.get(i).getID() == ID) {
				
				//match found, sets the first name to the passed in first name
				ContactList.get(i).setFirstName(firstName);
				
			} else { //no match found at current position
				
				continue;
				
				//FIXME - add return value when ID isn't found
			}
		}
	}
	
	/*
	 * Function to update last name of Contact object
	 * @param {String} ID - find the specific object stored in memory
	 * @param {String} lastName - last name of individual to be changed to
	 */
	public void updateLastName(String ID, String lastName) {
		
		//iterate over list
		for (int i = 0; i < ContactList.size(); i++) {
			
			//check current element ID equals passed in ID
			if (ContactList.get(i).getID() == ID) {
				
				//match found, sets the last name to the passed in last name
				ContactList.get(i).setLastName(lastName);
				
			} else { //no match found at current position
				
				continue;
				
				//FIXME - add return value when ID isn't found
			}
		}
	}
	
	/*
	 * Function to update phone number of Contact object
	 * @param {String} ID - find the specific object stored in memory
	 * @param {String} Number -  phone number of individual to be changed to
	 */
	public void updateNumber(String ID, String Number) {
		
		//iterate over list
		for (int i = 0; i < ContactList.size(); i++) {
			
			//check current element ID equals passed in ID
			if (ContactList.get(i).getID() == ID) {
				
				//match found, sets the phone number to the passed in phone number
				ContactList.get(i).setNumber(Number);
				
			} else { //no match found at current position
				
				continue;
				
				//FIXME - add return value when ID isn't found
			}
		}
	}
	
	/*
	 * Function to update address of Contact object
	 * @param {String} ID - find the specific object stored in memory
	 * @param {String} Address - first name of individual to be changed to
	 */
	public void updateAddress(String ID, String Address) {
		
		//iterate over list
		for (int i = 0; i < ContactList.size(); i++) {
			
			//check current element ID equals passed in ID
			if (ContactList.get(i).getID() == ID) {
				
				//match found, sets the address to the passed in address
				ContactList.get(i).setAddress(Address);
				
			} else { //no match found at current position
				
				continue;
				
				//FIXME - add return value when ID isn't found
			}
		}
	}
	
	
}
