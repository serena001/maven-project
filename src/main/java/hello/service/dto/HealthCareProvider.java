package hello.service.dto;

import static lombok.AccessLevel.PRIVATE;

import java.io.Serializable;
import java.time.LocalDate;

import hello.form.Address;
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
public class HealthCareProvider implements Serializable{
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String speciality;
	@Getter @Setter
	private Address address;
	@Getter @Setter
	private String telephone;
	@Getter @Setter
	private String telephoneExt;
	@Getter @Setter
	private LocalDate firstVisit;
	@Getter @Setter
	private LocalDate lastVisit;
	@Getter @Setter
	private String reasonVisit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getTelephoneExt() {
		return telephoneExt;
	}
	public void setTelephoneExt(String telephoneExt) {
		this.telephoneExt = telephoneExt;
	}
	public LocalDate getFirstVisit() {
		return firstVisit;
	}
	public void setFirstVisit(LocalDate firstVisit) {
		this.firstVisit = firstVisit;
	}
	public LocalDate getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(LocalDate lastVisit) {
		this.lastVisit = lastVisit;
	}
	public String getReasonVisit() {
		return reasonVisit;
	}
	public void setReasonVisit(String reasonVisit) {
		this.reasonVisit = reasonVisit;
	}
}
