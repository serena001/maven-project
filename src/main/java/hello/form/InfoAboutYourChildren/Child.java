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
public class Child {
	@Getter @Setter
	private String fullName;
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
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
