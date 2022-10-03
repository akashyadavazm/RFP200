package day9Problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AdressBook {

	static ArrayList<Person> list = new ArrayList<>();

	static Scanner sc = new Scanner(System.in);

	Person person = new Person();

	public void addperson() {

		System.out.println("Enter the First Name : ");
		person.setFname(sc.next());

		System.out.println("Enter the Last Name : ");
		person.setLname(sc.next());

		System.out.println("Enter the Adress : ");
		person.setAdress(sc.next());

		System.out.println("Enter the City : ");
		person.setCity(sc.next());

		System.out.println("Enter the email : ");
		person.setEmail(sc.next());

		System.out.println("Enter the Zip : ");
		person.setZip(sc.nextInt());

		System.out.println("Enter the Pnone No. : ");
		person.setPhoneno(sc.nextLong());
		list.add(person);

	}

	public void editperson() {

		System.out.println("Enter Person name to edit details : ");
		String editPersonName = sc.next();
		Person person = getPerson(editPersonName);
		System.out.println(
				"Enter choices you want to edit : \n 1-First Name \n 2- Last Name \n 3- Adress \n 4- City \n 5- Email \n 6- Zip \n 7- Phone No");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			editFirstName(person);
		case 2:
			editLastname(person);
		case 3:
			editAdress(person);
		case 4:
			editCity(person);
		case 5:
			editEmail(person);
		case 6:
			editZip(person);
		case 7:
			editPhoneno(person);
		default:
			break;
		}

	}

	private Person getPerson(String editPersonName) {
		Iterator<Person> itr = list.iterator();
		if (itr.hasNext()) {
			for (int i = 0; i < list.size(); i++) {
				person = (Person) itr.next();
				if (person.fname.equalsIgnoreCase(editPersonName))
					return person;
			}
		}
		return null;
	}

	private void editFirstName(Person person) {

		System.out.println("Enter the First Name : ");
		person.setFname(sc.next());

	}

	private void editLastname(Person person) {

		System.out.println("Enter the Last Name : ");
		person.setLname(sc.next());

	}

	private void editAdress(Person person) {

		System.out.println("Enter the Adress : ");
		person.setAdress(sc.next());

	}

	private void editCity(Person person) {

		System.out.println("Enter the City : ");
		person.setCity(sc.next());

	}

	private void editEmail(Person person) {

		System.out.println("Enter the email : ");
		person.setEmail(sc.next());

	}

	private void editZip(Person person) {

		System.out.println("Enter the Zip : ");
		person.setZip(sc.nextInt());

	}

	private void editPhoneno(Person person) {

		System.out.println("Enter the Pnone No. : ");
		person.setPhoneno(sc.nextLong());

	}

	public void displayperson() {

		String fname = person.getFname();

		String lname = person.getLname();

		String adress = person.getAdress();

		String city = person.getCity();

		String email = person.getEmail();

		int zip = person.getZip();

		long phoneno = person.getPhoneno();

		System.out.println(fname + " " + lname + " " + adress + " " + city + " " + email + " " + zip + " " + phoneno);

	}

	public void DeletePerson(String fname) {
		for (Person person : list) {
			if (fname.equals(person.getFname())) {
				list.remove(person);

				System.out.println("Contact Deleted");
				break;
			}
		}
	}

	public static void main(String[] args) {

		AdressBook adressbook = new AdressBook();

		int choice = 0;

		do {

			System.out.println("Enter your choice : \n 1-Add Person\n 2-Edit Person\n 3-Display Person \n 4-Delete Person ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				adressbook.addperson();
				break;
			case 2:
				adressbook.editperson();
				break;
			case 3:
				adressbook.displayperson();
				break;
			case 4:
				System.out.println("Enter the name you want to delete details");
				adressbook.DeletePerson(sc.next());

			case 5:
				break;

			}
		
		}while (choice != 5);
	}

}
