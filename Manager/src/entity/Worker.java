package entity;

import java.time.LocalDate;

/**
 * Klasse zum Speichern von Workerdaten
 * 
 */

public class Worker {
    private Long workerId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private LocalDate dateOfBirth;
    private char sex;
    private String position;
    private boolean married;
    public Worker() {}
    
	public Worker(String firstName, String lastName, String phone, String email, LocalDate dateOfBirth, String position,
			boolean married) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.position = position;
		this.married = married;
	}

	public Worker(Long workerId, String firstName, String lastName, String phone, String email, LocalDate dateOfBirth,
			char sex, String position, boolean married) {
		super();
		this.workerId = workerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
		this.position = position;
		this.married = married;
	}
	public Worker(String firstName, String lastName, String phone, String email, LocalDate dateOfBirth, char sex,
			String position, boolean married) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
		this.position = position;
		this.married = married;
	}
	public Long getWorkerId() {
		return workerId;
	}
	public void setWorkerId(Long workerId) {
		this.workerId = workerId;
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	@Override
	public String toString() {
		return "Worker [workerId=" + workerId + ", firstName=" + firstName + ", lastName=" + lastName + ", phone="
				+ phone + ", email=" + email + ", dateOfBirth=" + dateOfBirth + ", sex=" + sex + ", position="
				+ position + ", married=" + married + "]";
	}
}
