package E_service.E_service.Registeration;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Table;

@Entity
@Table(name = "UserInfo")
public class UserRegisteration {
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name = "FirstName", length = 60, nullable = false)
	private String FirstName;
	
	@Column(name = "LastName", length = 60, nullable = false)
	private String LastName;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "username", length = 60, nullable = false)
	private String username;
	
	@Column(name = "upassword", length = 60, nullable = false)
	private String upassword;
	
	@Column(name = "ZipCode")
	private int ZipCode;
	
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUpassword() {
	return upassword;
}
public void setUpassword(String upassword) {
	this.upassword = upassword;
}
public int getZipCode() {
	return ZipCode;
}
public void setZipCode(int zipCode) {
	ZipCode = zipCode;
}

	
}
