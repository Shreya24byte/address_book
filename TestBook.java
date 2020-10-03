package addressBook;
import javax.swing.*;

public class TestBook {
	public static void main(String args[]) {
		AddressBook ab = new AddressBook();
		String input, s;
		int choice;
		
		while(true) {
			input = JOptionPane.showInputDialog("Enter 1 to add" + "\nEnter 2 to edit" + "\nEnter 3 to sort by name" + "\nEnter 4 to sort by zip code" + "\nEnter 5 to delete" + "\nEnter 6 to print all" + "\nEnter 7 to exit");
			choice = Integer.parseInt(input);
			switch(choice) {
			case 1:
				ab.addPerson();
				break;
			case 2:
				s = JOptionPane.showInputDialog("Enter name to edit");
				ab.editPerson(s);
				break;
			case 3:
				ab.sortName();
				break;
			case 4:
				ab.sortZip();
				break;
			case 5:
				s = JOptionPane.showInputDialog("Enter name to delete");
				ab.deletePerson(s);
				break;
			case 6:
				ab.print();
				break;
			case 7:	
				System.exit(0);
			}
		}
		
	}

}
