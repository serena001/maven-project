package hello.service.dto;

import static lombok.AccessLevel.PRIVATE;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

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
public class InfoAboutYourWorkHistory implements Serializable{
	@Getter @Setter
	private Integer stoppedWork;
	@Getter @Setter
	private Integer reasonYouStoppedWork;
	@Getter @Setter
	private String detailsYouStoppedWork;
	@Getter @Setter
	private Job currentJob;
	@Getter @Setter
	private List<Job>otherJobs;
	@Getter @Setter
	private Integer didDifferentTypeOfWork;
	@Getter @Setter
	private String differentTypeOfWorkDescription;
	@Getter @Setter
	private Integer receivedEmploymentInsurance;
	@Getter @Setter
	private LocalDate receivedEmploymentInsuranceFrom;
	@Getter @Setter
	private LocalDate receivedEmploymentInsuranceTo;
	@Getter @Setter
	private Integer selfEmployed;
	@Getter @Setter
	private Integer selfEmployedWork;
	@Getter @Setter
	private Integer declareSelfEmployedForTax;
	@Getter @Setter
	private Integer stillSelfEmployed;
	@Getter @Setter
	private Integer workedInAnotherCountry;
	@Getter @Setter
	private List<InternationalWork>internationalWork;
	public Integer getStoppedWork() {
		return stoppedWork;
	}
	public void setStoppedWork(Integer stoppedWork) {
		this.stoppedWork = stoppedWork;
	}
	public Integer getReasonYouStoppedWork() {
		return reasonYouStoppedWork;
	}
	public void setReasonYouStoppedWork(Integer reasonYouStoppedWork) {
		this.reasonYouStoppedWork = reasonYouStoppedWork;
	}
	public String getDetailsYouStoppedWork() {
		return detailsYouStoppedWork;
	}
	public void setDetailsYouStoppedWork(String detailsYouStoppedWork) {
		this.detailsYouStoppedWork = detailsYouStoppedWork;
	}
	public Job getCurrentJob() {
		return currentJob;
	}
	public void setCurrentJob(Job currentJob) {
		this.currentJob = currentJob;
	}
	public List<Job> getOtherJobs() {
		return otherJobs;
	}
	public void setOtherJobs(List<Job> otherJobs) {
		this.otherJobs = otherJobs;
	}
	public Integer getDidDifferentTypeOfWork() {
		return didDifferentTypeOfWork;
	}
	public void setDidDifferentTypeOfWork(Integer didDifferentTypeOfWork) {
		this.didDifferentTypeOfWork = didDifferentTypeOfWork;
	}
	public String getDifferentTypeOfWorkDescription() {
		return differentTypeOfWorkDescription;
	}
	public void setDifferentTypeOfWorkDescription(String differentTypeOfWorkDescription) {
		this.differentTypeOfWorkDescription = differentTypeOfWorkDescription;
	}
	public Integer getReceivedEmploymentInsurance() {
		return receivedEmploymentInsurance;
	}
	public void setReceivedEmploymentInsurance(Integer receivedEmploymentInsurance) {
		this.receivedEmploymentInsurance = receivedEmploymentInsurance;
	}
	public LocalDate getReceivedEmploymentInsuranceFrom() {
		return receivedEmploymentInsuranceFrom;
	}
	public void setReceivedEmploymentInsuranceFrom(LocalDate receivedEmploymentInsuranceFrom) {
		this.receivedEmploymentInsuranceFrom = receivedEmploymentInsuranceFrom;
	}
	public LocalDate getReceivedEmploymentInsuranceTo() {
		return receivedEmploymentInsuranceTo;
	}
	public void setReceivedEmploymentInsuranceTo(LocalDate receivedEmploymentInsuranceTo) {
		this.receivedEmploymentInsuranceTo = receivedEmploymentInsuranceTo;
	}
	public Integer getSelfEmployed() {
		return selfEmployed;
	}
	public void setSelfEmployed(Integer selfEmployed) {
		this.selfEmployed = selfEmployed;
	}
	public Integer getSelfEmployedWork() {
		return selfEmployedWork;
	}
	public void setSelfEmployedWork(Integer selfEmployedWork) {
		this.selfEmployedWork = selfEmployedWork;
	}
	public Integer getDeclareSelfEmployedForTax() {
		return declareSelfEmployedForTax;
	}
	public void setDeclareSelfEmployedForTax(Integer declareSelfEmployedForTax) {
		this.declareSelfEmployedForTax = declareSelfEmployedForTax;
	}
	public Integer getStillSelfEmployed() {
		return stillSelfEmployed;
	}
	public void setStillSelfEmployed(Integer stillSelfEmployed) {
		this.stillSelfEmployed = stillSelfEmployed;
	}
	public Integer getWorkedInAnotherCountry() {
		return workedInAnotherCountry;
	}
	public void setWorkedInAnotherCountry(Integer workedInAnotherCountry) {
		this.workedInAnotherCountry = workedInAnotherCountry;
	}
	public List<InternationalWork> getInternationalWork() {
		return internationalWork;
	}
	public void setInternationalWork(List<InternationalWork> internationalWork) {
		this.internationalWork = internationalWork;
	}
	
//	@Getter(AccessLevel.NONE)
//	private LocalDate dateYouStoppedWork;
//	public LocalDate getDateYouStoppedWork()
//	{
//		if(currentJob!=null && currentJob!=null)
//		{
//			return currentJob;
//		}
//	}
	
	
}
