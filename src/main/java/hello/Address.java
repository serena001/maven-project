package hello;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Address {
	String street1;
	String postalCode1;
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getPostalCode1() {
		return postalCode1;
	}
	public void setPostalCode1(String postalCode1) {
		this.postalCode1 = postalCode1;
	}


}
