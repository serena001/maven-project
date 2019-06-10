package hello.form.InfoAboutYourWorkHistory;

import static lombok.AccessLevel.PRIVATE;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor(access=PRIVATE)
@Getter @Setter
public class InfoAboutYourWorkHistory {
	@Getter @Setter
	WorkHistCurrentLastEmployer workHistoryCurrentLastEmployer;
	@Getter @Setter
	WorkHistOtherJobs workHistoryOtherJobs;
	@Getter @Setter
	WorkHistMedicalConditions workHistoryMedicalConditions;
	@Getter @Setter
	WorkHistOtherCountries workHistoryOtherCountries;
	public WorkHistCurrentLastEmployer getWorkHistoryCurrentLastEmployer() {
		return workHistoryCurrentLastEmployer;
	}
	public void setWorkHistoryCurrentLastEmployer(WorkHistCurrentLastEmployer workHistoryCurrentLastEmployer) {
		this.workHistoryCurrentLastEmployer = workHistoryCurrentLastEmployer;
	}
	public WorkHistOtherJobs getWorkHistoryOtherJobs() {
		return workHistoryOtherJobs;
	}
	public void setWorkHistoryOtherJobs(WorkHistOtherJobs workHistoryOtherJobs) {
		this.workHistoryOtherJobs = workHistoryOtherJobs;
	}
	public WorkHistMedicalConditions getWorkHistoryMedicalConditions() {
		return workHistoryMedicalConditions;
	}
	public void setWorkHistoryMedicalConditions(WorkHistMedicalConditions workHistoryMedicalConditions) {
		this.workHistoryMedicalConditions = workHistoryMedicalConditions;
	}
	public WorkHistOtherCountries getWorkHistoryOtherCountries() {
		return workHistoryOtherCountries;
	}
	public void setWorkHistoryOtherCountries(WorkHistOtherCountries workHistoryOtherCountries) {
		this.workHistoryOtherCountries = workHistoryOtherCountries;
	}
	
}
