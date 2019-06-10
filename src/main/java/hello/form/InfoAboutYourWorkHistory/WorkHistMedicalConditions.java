package hello.form.InfoAboutYourWorkHistory;

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
public class WorkHistMedicalConditions {
	@Getter @Setter
	private Integer medicalCondition;
	@Getter @Setter
	private String medicalDescribe;
	@Getter @Setter
	private Integer employmentInsurance;
	@Getter @Setter
	private LocalDate insuranceFromDate;
	@Getter @Setter
	private LocalDate insuranceToDate;
	@Getter @Setter
	private Integer selfEmployed;
	@Getter @Setter
	private Integer involvementWithBusiness;
	@Getter @Setter
	private Integer incomeTax;
	@Getter @Setter
	private Integer selfEmployeStill;
	public Integer getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(Integer medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	public String getMedicalDescribe() {
		return medicalDescribe;
	}
	public void setMedicalDescribe(String medicalDescribe) {
		this.medicalDescribe = medicalDescribe;
	}
	public Integer getEmploymentInsurance() {
		return employmentInsurance;
	}
	public void setEmploymentInsurance(Integer employmentInsurance) {
		this.employmentInsurance = employmentInsurance;
	}
	public LocalDate getInsuranceFromDate() {
		return insuranceFromDate;
	}
	public void setInsuranceFromDate(LocalDate insuranceFromDate) {
		this.insuranceFromDate = insuranceFromDate;
	}
	public LocalDate getInsuranceToDate() {
		return insuranceToDate;
	}
	public void setInsuranceToDate(LocalDate insuranceToDate) {
		this.insuranceToDate = insuranceToDate;
	}
	public Integer getSelfEmployed() {
		return selfEmployed;
	}
	public void setSelfEmployed(Integer selfEmployed) {
		this.selfEmployed = selfEmployed;
	}
	public Integer getInvolvementWithBusiness() {
		return involvementWithBusiness;
	}
	public void setInvolvementWithBusiness(Integer involvementWithBusiness) {
		this.involvementWithBusiness = involvementWithBusiness;
	}
	public Integer getIncomeTax() {
		return incomeTax;
	}
	public void setIncomeTax(Integer incomeTax) {
		this.incomeTax = incomeTax;
	}
	public Integer getSelfEmployeStill() {
		return selfEmployeStill;
	}
	public void setSelfEmployeStill(Integer selfEmployeStill) {
		this.selfEmployeStill = selfEmployeStill;
	}
}
