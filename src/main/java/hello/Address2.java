package hello;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Address2 {
	String street;
	String postalCode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
