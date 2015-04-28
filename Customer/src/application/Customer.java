package application;

public class Customer {

	private String FirstName;
	private String MiddleInitial;
	private String LastName;
	private String Address;
	private String City;
	private int Zip;
	
	
	public Customer(String FirstName, String MiddleInitial, String LastName,
			String Address, int Zip, String City) {
	}
	public String getFirstName(){
		return this.FirstName;
		}
	public void setFirstName(String firstname){
		this.FirstName = firstname;
		}
	public String getMiddleInitial(){
		return this.MiddleInitial;
		}
	public void setMiddleInitial(String middleinitial){
		this.MiddleInitial = middleinitial;
		}
	public String getLastName(){
		return this.LastName;
		}
	public void setLastName(String lastname){
		this.LastName = lastname;
		}
	public String getAddress(){
		return Address;
		}
	public void setAddress(String address){
		this.Address = address;
		}
	public String getCity(){
		return City;
	}
	public void setCity(String city){
		this.City=city;
	}
	public int getZip(){
		return Zip;
		}
	public void setZip(int zip){
		this.Zip = zip;
		}

}
	
