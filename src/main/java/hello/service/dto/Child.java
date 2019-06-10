package hello.service.dto;

import static lombok.AccessLevel.PRIVATE;

import java.io.Serializable;
import java.time.LocalDate;

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
public class Child implements Serializable{
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String sin;
	@Getter @Setter
	private LocalDate dateOfBirth;
	@Getter @Setter
	private LocalDate dateEnteredCanada;
	@Getter @Setter
	private Integer relationship;
	@Getter @Setter
	private String relationshipOther;
	@Getter @Setter
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSin() {
		return sin;
	}
	public void setSin(String sin) {
		this.sin = sin;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public LocalDate getDateEnteredCanada() {
		return dateEnteredCanada;
	}
	public void setDateEnteredCanada(LocalDate dateEnteredCanada) {
		this.dateEnteredCanada = dateEnteredCanada;
	}
	public Integer getRelationship() {
		return relationship;
	}
	public void setRelationship(Integer relationship) {
		this.relationship = relationship;
	}
	public String getRelationshipOther() {
		return relationshipOther;
	}
	public void setRelationshipOther(String relationshipOther) {
		this.relationshipOther = relationshipOther;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
