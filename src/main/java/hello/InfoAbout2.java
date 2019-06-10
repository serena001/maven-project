package hello;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter @Setter
public class InfoAbout2 {
	Address2 address2;
	List<Address2>addressLst;
	public Address2 getAddress2() {
		return address2;
	}
	public void setAddress2(Address2 address2) {
		this.address2 = address2;
	}
	public List<Address2> getAddressLst() {
		return addressLst;
	}
	public void setAddressLst(List<Address2> addressLst) {
		this.addressLst = addressLst;
	}

}
