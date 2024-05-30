package hibernateFirstProject;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity(name="name_details")
@Entity
//@Table(name="mystudents") --> to change the name of the table
public class Student {
	
	@Id    //to make a Primary Key
	private int id;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" : "+this.name+" : "+this.city;
	}

	private String name;
	private String city;
	
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

}
