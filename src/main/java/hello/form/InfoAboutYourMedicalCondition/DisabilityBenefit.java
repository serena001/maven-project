package hello.form.InfoAboutYourMedicalCondition;

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
public class DisabilityBenefit {
	@Getter @Setter
	private String insuranceCompanyName;
	@Getter @Setter
	private String claimNumber;
	@Getter @Setter
	private String medicalCondition;
	@Getter @Setter
	private LocalDate benefitStartDate;
	@Getter @Setter
	private Integer insuranceAuthorized ;
	public String getInsuranceCompanyName() {
		return insuranceCompanyName;
	}
	public void setInsuranceCompanyName(String insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}
	public String getClaimNumber() {
		return claimNumber;
	}
	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}
	public String getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	public LocalDate getBenefitStartDate() {
		return benefitStartDate;
	}
	public void setBenefitStartDate(LocalDate benefitStartDate) {
		this.benefitStartDate = benefitStartDate;
	}
	public Integer getInsuranceAuthorized() {
		return insuranceAuthorized;
	}
	public void setInsuranceAuthorized(Integer insuranceAuthorized) {
		this.insuranceAuthorized = insuranceAuthorized;
	}
}
