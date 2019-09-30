package app;

public class List {
    private Long contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private boolean volljährigFlag;
	public List() {
		super();
	}
	public List(Long contactId, String firstName, String lastName, String phone, String email, boolean volljährigFlag) {
		super();
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.volljährigFlag = volljährigFlag;
	}
	public List(String firstName, String lastName, String phone, String email, boolean volljährigFlag) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.volljährigFlag = volljährigFlag;
	}
	public Long getContactId() {
		return contactId;
	}
	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isVolljährigFlag() {
		return volljährigFlag;
	}
	public void setVolljährigFlag(boolean volljährigFlag) {
		this.volljährigFlag = volljährigFlag;
	}
    
}
