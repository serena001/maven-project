package hello;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter @Setter
public class InfoAboutForm2 {
	Address address;
	List<Address>addressLst;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Address> getAddressLst() {
		return addressLst;
	}
	public void setAddressLst(List<Address> addressLst) {
		this.addressLst = addressLst;
	}
	
	

}
