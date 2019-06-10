package hello.service.dto;

import static lombok.AccessLevel.PRIVATE;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@SuppressWarnings("serial")
@AllArgsConstructor(access=PRIVATE)
@Getter @Setter
public class Address implements Serializable{
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
}
