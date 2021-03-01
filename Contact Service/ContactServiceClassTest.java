package ContactTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;
import Contact.ContactService;

class ContactServiceClassTest {

	@Test
	void testContactServiceAddContactUniqueID() {

		ContactService.ContactList.clear();
		
		Contact firstContact = new Contact("1B45", "John", "Smith", "1234567890", "123 Main Street");

		Contact secondContact = new Contact("1B45", "Josh", "Love", "1234567899", "124 Main Street");

		ContactService.addContact(firstContact);

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService.addContact(secondContact);
		});
		
	}
	
	@Test
	void testContactServiceAddContactListSuccess() {
		
		ContactService.ContactList.clear();
		
		Contact firstContact = new Contact("1B45AB", "John", "Smith", 		"1234567890", "123 Main Street");

		Contact secondContact = new Contact("1B45", "Josh", "Love", 		"1234567899", "124 Main Street");

		ContactService.addContact(firstContact);
		
		ContactService.addContact(secondContact);

		assertEquals(ContactService.ContactList.size(), 2);
	}
	
	@Test
	void testContactServiceDeleteContact() {
		
		ContactService.ContactList.clear();
		
		Contact firstContact = new Contact("1B45AB", "John", "Smith", 		"1234567890", "123 Main Street");

		Contact secondContact = new Contact("1B45", "Josh", "Love", 		"1234567899", "124 Main Street");
		
		Contact thirdContact = new Contact("87dbD", "Amy", "Jones", "9876543210", "321 Name Ave");
		
		ContactService.addContact(firstContact);
		
		ContactService.addContact(secondContact);
		
		ContactService.addContact(thirdContact);
		
		ContactService.deleteContact("87dbD");
		
		assertEquals(ContactService.ContactList.size(), 2);
		
		assertEquals(ContactService.ContactList.get(0).getID(), "1B45AB");
		
		assertEquals(ContactService.ContactList.get(1).getID(), "1B45");
	}
	
	@Test
	void testContactServiceUpdateFirstName() {
		
		ContactService.ContactList.clear();
		
		Contact firstContact = new Contact("1B45", "John", "Smith", "1234567890", "123 Main Street");
		
		ContactService.addContact(firstContact);
		
		ContactService.ContactList.get(0).setFirstName("James");
		
		assertEquals(ContactService.ContactList.get(0).getFirstName(), "James");
	}
	
	@Test
	void testContactServiceUpdateLastName() {
		
		ContactService.ContactList.clear();
		
		Contact firstContact = new Contact("1B45", "John", "Smith", "1234567890", "123 Main Street");
		
		ContactService.addContact(firstContact);
		
		ContactService.ContactList.get(0).setLastName("Jones");
		
		assertEquals(ContactService.ContactList.get(0).getLastName(), "Jones");
	}
	
	@Test
	void testContactServiceUpdateNumber() {
		
		ContactService.ContactList.clear();
		
		Contact firstContact = new Contact("1B45", "John", "Smith", "1234567890", "123 Main Street");
		
		ContactService.addContact(firstContact);
		
		ContactService.ContactList.get(0).setNumber("0987654321");
		
		assertEquals(ContactService.ContactList.get(0).getNumber(), "0987654321");
	}
	
	@Test
	void testContactServiceUpdateAddress() {
		
		ContactService.ContactList.clear();
		
		Contact firstContact = new Contact("1B45", "John", "Smith", "1234567890", "123 Main Street");
		
		ContactService.addContact(firstContact);
		
		ContactService.ContactList.get(0).setAddress("1111 First Avenue");
		
		assertEquals(ContactService.ContactList.get(0).getAddress(), "1111 First Avenue");
	}

}
