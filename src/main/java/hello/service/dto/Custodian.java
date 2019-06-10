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
public class Custodian implements Serializable{
	@Getter @Setter
	private String name;
	@Getter @Setter
	private Child child;
	@Getter @Setter
	private Integer hasCustody;
	@Getter @Setter
	private Integer isUnderSameCustodian;
	@Getter @Setter
	private Integer isAttendingFullTimeSchool;
	@Getter @Setter
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Child getChild() {
		return child;
	}
	public void setChild(Child child) {
		this.child = child;
	}
	public Integer getHasCustody() {
		return hasCustody;
	}
	public void setHasCustody(Integer hasCustody) {
		this.hasCustody = hasCustody;
	}
	public Integer getIsUnderSameCustodian() {
		return isUnderSameCustodian;
	}
	public void setIsUnderSameCustodian(Integer isUnderSameCustodian) {
		this.isUnderSameCustodian = isUnderSameCustodian;
	}
	public Integer getIsAttendingFullTimeSchool() {
		return isAttendingFullTimeSchool;
	}
	public void setIsAttendingFullTimeSchool(Integer isAttendingFullTimeSchool) {
		this.isAttendingFullTimeSchool = isAttendingFullTimeSchool;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
