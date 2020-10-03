package addressBook;
import java.util.*;
import javax.swing.JOptionPane;

public class AddressBook {
	ArrayList<PersonInfo> persons;
	
	public AddressBook() {
		persons = new ArrayList<PersonInfo>();
	}
	
	//Add new person to array list
	public void addPerson() {
		String name = JOptionPane.showInputDialog("Enter name:");
		String add = JOptionPane.showInputDialog("Enter address:");
		String state = JOptionPane.showInputDialog("Enter state:");
		String city = JOptionPane.showInputDialog("Enter city:");
		String zip = JOptionPane.showInputDialog("Enter zip code:");
		String pNum = JOptionPane.showInputDialog("Enter phone number:");
		
		//create person object
		PersonInfo p = new PersonInfo(name, add, state, city, zip, pNum);
		//add person object to arraylist
		persons.add(p);
	}
	
//Edit person
	public void editPerson(String n) {
		for(int i=0; i<persons.size(); i++) {
			PersonInfo p = (PersonInfo)persons.get(i);
			if(n.equals(p.getName())) {
				persons.remove(i);
				String name = JOptionPane.showInputDialog("Enter new name:");
				String add = JOptionPane.showInputDialog("Enter new address:");
				String state = JOptionPane.showInputDialog("Enter new state:");
				String city = JOptionPane.showInputDialog("Enter new city:");
				String zip = JOptionPane.showInputDialog("Enter new zip code:");
				String pNum = JOptionPane.showInputDialog("Enter new phone number:");
				PersonInfo person = new PersonInfo(name, add, state, city, zip, pNum);
				persons.add(person);
			} else {
				JOptionPane.showMessageDialog(null, "Not found");
			}
		}
		
	}
	
//Sort by name
	public void sortName() {
		String name = " ";
		persons.sort((o1,o2) ->o1.getName().compareTo(o2.getName()));
		for (PersonInfo obj : persons) {
			name += obj.getName()+"\n";
		}
		JOptionPane.showMessageDialog(null,"Sorted by name\n" +name);
	}

//Sort by zip code
	public void sortZip() {
		String zip = " ";
		persons.sort((o1,o2) ->o1.getZip().compareTo(o2.getZip()));
		for (PersonInfo obj : persons) {
			zip += obj.getZip()+"\n";
		}
		JOptionPane.showMessageDialog(null,"Sorted by zip code\n" +zip);
		
	}
	
//Delete person by name
	public void deletePerson(String n) {
		for(int i=0; i<persons.size(); i++) {
			PersonInfo p = (PersonInfo)persons.get(i);
			if(n.equals(p.getName())) {
				p.print();
				int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?");
				if(input == 0) {
					persons.remove(i);
				}	
			} 
		}
	}
	
//Print contents of the address book
	public void print() {
		String output= " ";
		for(int i=0; i<persons.size(); i++) {
			String name = persons.get(i).getName();
			String add = persons.get(i).getAddress();
			String city = persons.get(i).getCity();
			String state = persons.get(i).getState();
			String zip = persons.get(i).getZip();
			String phone = persons.get(i).getPhoneNum();
		    output += name+" "+add+" "+city+" "+state+" "+zip+" "+phone+"\n";
			}
		JOptionPane.showMessageDialog(null,output);
	}
	}

