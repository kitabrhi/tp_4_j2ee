package model;

public class Contact {
	
	 	private int idContact;
	    private String firstname;
	    private String lastname;
	    private String email;
	    private String phone;
	    private String address;
	    
	    
	    
	    public Contact() {}
	    
	    
		public Contact(String firstname, String lastname, String email, String phone, String address) {
			super();
			
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.phone = phone;
			this.address = address;
		}
		public int getIdContact() {
			return idContact;
		}
		public void setIdContact(int idContact) {
			this.idContact = idContact;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	    
	    

}
