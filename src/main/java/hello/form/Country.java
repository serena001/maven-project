package hello.form;

import static lombok.AccessLevel.PRIVATE;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor(access=PRIVATE)
@Getter @Setter
public class Country {
	@Getter @Setter
	private Integer name;
	@Getter @Setter
	private String sin;
	@Getter @Setter
	private LocalDate livedInFrom;
	@Getter @Setter
	private LocalDate livedInTo;
	@Getter @Setter
	private LocalDate workedInFrom;
	@Getter @Setter
	private LocalDate workedInTo;
	@Getter @Setter
	private Integer receivedBenefits;
	public Integer getName() {
		return name;
	}
	public void setName(Integer name) {
		this.name = name;
	}
	public String getSin() {
		return sin;
	}
	public void setSin(String sin) {
		this.sin = sin;
	}
	public LocalDate getLivedInFrom() {
		return livedInFrom;
	}
	public void setLivedInFrom(LocalDate livedInFrom) {
		this.livedInFrom = livedInFrom;
	}
	public LocalDate getLivedInTo() {
		return livedInTo;
	}
	public void setLivedInTo(LocalDate livedInTo) {
		this.livedInTo = livedInTo;
	}
	public LocalDate getWorkedInFrom() {
		return workedInFrom;
	}
	public void setWorkedInFrom(LocalDate workedInFrom) {
		this.workedInFrom = workedInFrom;
	}
	public LocalDate getWorkedInTo() {
		return workedInTo;
	}
	public void setWorkedInTo(LocalDate workedInTo) {
		this.workedInTo = workedInTo;
	}
	public Integer getReceivedBenefits() {
		return receivedBenefits;
	}
	public void setReceivedBenefits(Integer receivedBenefits) {
		this.receivedBenefits = receivedBenefits;
	}
}
