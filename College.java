package advanced_DataStructures;

public class College {

	int id;
	String name;
	int contactNo;
	String address;
	int pincode;
	
	public College(int id, String name, int contactNo, String address, int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.pincode = pincode;
	}

	public College() {
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

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", address=" + address
				+ ", pincode=" + pincode + "]";
	}

}
