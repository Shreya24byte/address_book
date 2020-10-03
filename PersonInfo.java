package addressBook;
import javax.swing.JOptionPane;

public class PersonInfo {
	private String fullname;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNum;
	
	//setter methods
	public void setName(String sname) {
		fullname=sname;
	}
	public void setAddress(String saddress) {
		address=saddress;
	}
	public void setCity(String scity) {
		city=scity;
	}
	public void setState(String sstate) {
		state=sstate;
	}
	public void setZip(String szip) {
		zip=szip;
	}
	public void setPhoneNum(String sphoneNum) {
		phoneNum=sphoneNum;
	}
	
	//getter methods
	public String getName() {
		return fullname;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	
	//constructor
	public PersonInfo(String f, String a, String c, String s, String z, String p) {
		setName(f);
		setAddress(a);
		setCity(c);
		setState(s);
		setZip(z);
		setPhoneNum(p);
	}
	
	//method to display person record 
	public void print() {
		JOptionPane.showMessageDialog(null, "Full Name: "+fullname+";  Address: "+address+";  City: "+city+";  State: "+state+";  Zip code: "+zip+";  Phone number: "+phoneNum);
	}
}
