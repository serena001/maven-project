package hello.form.InfoAboutYourChildren;

import static lombok.AccessLevel.PRIVATE;

import java.time.LocalDate;

import hello.form.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Builder
@NoArgsConstructor
@AllArgsConstructor(access=PRIVATE)
@Getter @Setter
public class ChildDOBName {
	@Getter @Setter
	private String fullName;
	@Getter @Setter
	private LocalDate dateOfBirth;
	@Getter @Setter
	private Integer hasCustody;
	@Getter @Setter
	private Integer sameCustodian;
	@Getter @Setter
	private String custodianName;
	@Getter @Setter
	private Integer childInSchool;
	@Getter @Setter
	Address address;
	@Getter @Setter
	Child child;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getHasCustody() {
		return hasCustody;
	}
	public void setHasCustody(Integer hasCustody) {
		this.hasCustody = hasCustody;
	}
	public Integer getSameCustodian() {
		return sameCustodian;
	}
	public void setSameCustodian(Integer sameCustodian) {
		this.sameCustodian = sameCustodian;
	}
	public String getCustodianName() {
		return custodianName;
	}
	public void setCustodianName(String custodianName) {
		this.custodianName = custodianName;
	}
	public Integer getChildInSchool() {
		return childInSchool;
	}
	public void setChildInSchool(Integer childInSchool) {
		this.childInSchool = childInSchool;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Child getChild() {
		return child;
	}
	public void setChild(Child child) {
		this.child = child;
	}
}
