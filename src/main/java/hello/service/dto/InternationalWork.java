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
public class InternationalWork implements Serializable{
	@Getter @Setter
	private Integer country;
	@Getter @Setter
	private String identificationNumber;
	@Getter @Setter
	private LocalDate livedFrom;
	@Getter @Setter
	private LocalDate livedTo;
	@Getter @Setter
	private LocalDate workedFrom;
	@Getter @Setter
	private LocalDate workedTo;
	@Getter @Setter
	private Integer receivedBenefit;
	public Integer getCountry() {
		return country;
	}
	public void setCountry(Integer country) {
		this.country = country;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public LocalDate getLivedFrom() {
		return livedFrom;
	}
	public void setLivedFrom(LocalDate livedFrom) {
		this.livedFrom = livedFrom;
	}
	public LocalDate getLivedTo() {
		return livedTo;
	}
	public void setLivedTo(LocalDate livedTo) {
		this.livedTo = livedTo;
	}
	public LocalDate getWorkedFrom() {
		return workedFrom;
	}
	public void setWorkedFrom(LocalDate workedFrom) {
		this.workedFrom = workedFrom;
	}
	public LocalDate getWorkedTo() {
		return workedTo;
	}
	public void setWorkedTo(LocalDate workedTo) {
		this.workedTo = workedTo;
	}
	public Integer getReceivedBenefit() {
		return receivedBenefit;
	}
	public void setReceivedBenefit(Integer receivedBenefit) {
		this.receivedBenefit = receivedBenefit;
	}
}
