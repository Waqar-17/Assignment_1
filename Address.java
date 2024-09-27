public class Address{
	private String street;
	private String city;
	private String postalCode;
	
	public Address(String street, String city, String postalCode){
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
	}
	
	public void setStreet(String street){
		this.street = street;
	}
	public String getStreet(){
		return street;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return city;
	}
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	public String getPostalCode(){
		return postalCode;
	}
	@Override
	public String toString(){
		return "Street :"+street+"\nCity :"+city+"\nPostal Code:"+postalCode;
	}
	
}