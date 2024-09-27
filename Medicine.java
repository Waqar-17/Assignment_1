public class Medicine{
	private String medicineId;
	private String batchNumber;
	private String manufacturer;
	private Date expiryDate;
	private int quantity;
	private String name;
	private double price;
	
	public Medicine(String medicineId,String batchNumber,double price,int quantity,String manufacturer,String name,Date expiryDate){
		this.medicineId = medicineId;
		this.batchNumber = batchNumber;
		this.manufacturer = manufacturer;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
		this.name = name;
		this.price = price;
	}
	
	public void setMedicineld(String medicineId){
		this.medicineId= medicineId;
	}
	public String getMedicineId(){
		return medicineId;
	}
	public void setBatchNumber(String batchNumber){
		this.batchNumber= batchNumber;
	}
	public String getBatchNumber(){
		return batchNumber;
	}
	public void setManufacturer(String manufacturer){
		this.manufacturer= manufacturer;
	}
	public String getManufacturer(){
		return manufacturer;
	}
	public void setExpiryDate(Date expiryDate){
		this.expiryDate= expiryDate;
	}
	public Date getExpiryDate(){
		return expiryDate;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public int getQuantity(){
		return quantity;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(double price){
		this.price= price;
	}
	public double getPrice(){
		return price;
	}
	public String toString(){
		return "Name :"+name+"\nMedicine Id :"+medicineId+"\nBatch Number :"+batchNumber+"Manfacturer :"+manufacturer+"Expiry Date :"+expiryDate+"Quantity :"+quantity+"Price :"+price;
	}
}