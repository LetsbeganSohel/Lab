package SpringJDBC.Com;

public class Student {
private int id ;
private String name;
private String email;
private int age ;
private String Address;
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Student(int id, String name, String email, int age,String Address) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.age = age;
	this.Address=Address;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
}
