package Springboot_restApi1.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(unique= true)
	private String username;
	
	private String fullname;
	
	@Column(unique=true)
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	
    @Temporal(TemporalType.TIMESTAMP)
	private Date updationDate;
	
	
//constructor using fields 	
	public User(int id, String username, String fullname, String email, Date creationDate, Date updationDate) {
		
		this.id = id;
		this.username = username;
		this.fullname = fullname;
		this.email = email;
		this.creationDate = creationDate;
		this.updationDate = updationDate;
	}


//default constructor
	
	public User() {
		 
	}


//getter and setter
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getFullname() {
		return fullname;
	}



	public void setFullname(String fullname) {
		this.fullname = fullname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Date getCreationDate() {
		return creationDate;
	}



	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}



	public Date getUpdationDate() {
		return updationDate;
	}



	public void setUpdationDate(Date updationDate) {
		this.updationDate = updationDate;
	}
	
	
	
	
	
	

}
