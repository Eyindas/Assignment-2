public class Patient {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String state;
	private String city;
	private String phoneNumber;
	private String zipCode;
	private String emergencyContactName;
	private String emergencyContactPhone;
	
	
	public Patient() {}
	
	public Patient(String firstName, String middleName, String lastName) {
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	
	}
	
	public Patient(String firstName, String middlename, String lastName,
			String streetAddress, String city, String state, String zipCode, 
			String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
		
		this.firstName = firstName;
		this.middleName = middlename;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.emergencyContactPhone = emergencyContactPhone;
		this.emergencyContactName = emergencyContactName;
		
		
		
	}
	
	public String getFirstname() {return firstName;}
	public String getMiddleName() {return middleName;}
	public String getLastName() {return lastName;}
	public String getCity() {return city;}
	public String getStreetAddress() {return streetAddress;}
	public String getZipCode() {return zipCode;}
	public String getState() {return state;}
	public String getPhoneNumber() {return phoneNumber;}
	public String getEmergencyContactName() {return emergencyContactName;}
	public String getEmergencyContactPhone() {return emergencyContactPhone;}
	
	
	public void setFirstName(String firstName) {this.firstName = firstName;}
	public void setMiddleName(String middleName) {this.middleName = middleName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	public void setStreetAddress(String streetAddress) {this.streetAddress = streetAddress;}
	public void setCity(String city) {this.city = city;}
	public void setState(String state) {this.state = state;}
	public void setZipcode(String zipcode) {this.zipCode = zipcode;}
	public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
	public void setEmergencyContactName(String emergencyContactName) {this.emergencyContactName = emergencyContactName;}
	public void setemergencyContactPhone(String emergencyContactPhone) {this.emergencyContactPhone = emergencyContactPhone;}
	
	
	public String buildFullName() {
		return firstName +""+middleName+ ""+lastName;
	}
	
	
	public String buildAdress () {
		return streetAddress+""+city+""+zipCode;
	}
	
	public String buildEmergencyContact() {
		return emergencyContactName+""+emergencyContactPhone;
	}
	
	public String toString() {
		return "Patient info:"+ buildFullName()+"\n"+"Address:"+buildAdress()+"\n"+"Phone:"+phoneNumber+"\n"+
				"Emergency Contact:"+buildEmergencyContact();
	
	}
	
	
	
}