package ContactTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactClassTest {

	@Test
	void testContactClass() {
		Contact testContact = new Contact("1B45", "John", "Smith", "1234567890", "123 Main Street");
		assertTrue(testContact.getID().equals("1B45"));
		assertTrue(testContact.getFirstName().equals("John"));
		assertTrue(testContact.getLastName().equals("Smith"));
		assertTrue(testContact.getNumber().equals("1234567890"));
		assertTrue(testContact.getAddress().equals("123 Main Street"));
	}
	
	@Test
	void testContactClassIDLength() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1B45AH847HG7", "John", "Smith", "1234567890", "123 Main Street");
		});
	};

	@Test
	void testContactClassIDNull() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "John", "Smith", "1234567890", "123 Main Street");
		});
	};
	
	@Test
	void testContactClassFirstNameLength() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1B45", "Smithsonian", "Smith", "1234567890", "123 Main Street");
		});
	};	
	
	@Test
	void testContactClassFirstNameNull() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1B45", null, "Smith", "1234567890", "123 Main Street");
		});
	};		
	
	@Test
	void testContactClassLastNameLength() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1B45", "John", "Smithsonian", "1234567890", "123 Main Street");
		});
	};	
	
	@Test
	void testContactClassLastNameNull() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1B45", "John", null, "1234567890", "123 Main Street");
		});
	};		
	
	@Test
	void testContactClassNumberLengthLess() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1B45", "John", "Smith", "123456789", "123 Main Street");
		});
	};	
	
	@Test
	void testContactClassNumberLengthMore() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1B45", "John", "Smith", "12345678900", "123 Main Street");
		});
	};	
	
	@Test
	void testContactClassNumberNull() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1B45", "John", "Smith", null, "123 Main Street");
		});
	};	
	
	@Test
	void testContactClassAddressLength() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1B45", "John", "Smith", "1234567890", "123 Main Street, New York City, 12345, USA");
		});
	};	
	
	@Test
	void testContactClassAddressNull() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1B45", "John", "Smith", "1234567890", null);
		});
	};
}


