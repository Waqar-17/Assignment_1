public class Person{
	private String name;
	private String contactNumber;
	
	//Constructor
	
	public Person(String name, String contactNumber){
		this.name = name;
		this.contactNumber = contactNumber;
	}
	
	public void setContactNumber(String contactNumber){
		this.contactNumber = contactNumber;
	}
	public String getContactNumber(){
		return contactNumber;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	@Override
	public String toString(){
		return "Name : "+name+"Contact Number : "+contactNumber;
	}
}