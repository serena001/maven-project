package hello.form;

import static lombok.AccessLevel.PRIVATE;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor(access=PRIVATE)
@Getter @Setter
public class Address {
	@Getter @Setter
	private String streetName;
	@Getter @Setter
	private String cityTown;
	@Getter @Setter
	private Integer provinceTerritory;
	@Getter @Setter
	private Integer country;
	@Getter @Setter
	private String postalCode;
	@Getter @Setter
	private String telephone;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityTown() {
		return cityTown;
	}
	public void setCityTown(String cityTown) {
		this.cityTown = cityTown;
	}
	public Integer getProvinceTerritory() {
		return provinceTerritory;
	}
	public void setProvinceTerritory(Integer provinceTerritory) {
		this.provinceTerritory = provinceTerritory;
	}
	public Integer getCountry() {
		return country;
	}
	public void setCountry(Integer country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
