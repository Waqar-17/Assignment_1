public class PharmacyShoppp{
	private Address address;
	Medicine[] medicines = new Medicine[100];
	private int medicineCount;
	private Person owner;
	
	public PharmacyShoppp(Person owner,Address address,int medicineCount){
		this.owner = owner;
		this.address = address;
		this.medicineCount = medicineCount;
	}
	
	//codeblock
	{
		medicines[1] = new Medicine("M001","B123",50.0,100,"PharmaCorp","Paracetamol",new Date(15,8,2025));
			
		medicines[1] = new Medicine("M002","B124",75.0,80,"HealthMed","Ibuprofen",new Date(10,12,2024));
		
	}
	
}