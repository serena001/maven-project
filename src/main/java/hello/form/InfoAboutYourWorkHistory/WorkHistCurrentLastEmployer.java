package hello.form.InfoAboutYourWorkHistory;

import static lombok.AccessLevel.PRIVATE;

import hello.form.Job;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor(access=PRIVATE)
@Getter @Setter
public class WorkHistCurrentLastEmployer {
	@Getter @Setter
	private Integer hasStoppedWorking;
	@Getter @Setter
	private Integer reasonStopped;
	@Getter @Setter
	private String providedDetailStopped;
	@Getter @Setter
	private Job job;
	@Getter @Setter
	private String dutiesDesc;
	@Getter @Setter
	private Integer hadOtherJobs;
	public Integer getHasStoppedWorking() {
		return hasStoppedWorking;
	}
	public void setHasStoppedWorking(Integer hasStoppedWorking) {
		this.hasStoppedWorking = hasStoppedWorking;
	}
	public Integer getReasonStopped() {
		return reasonStopped;
	}
	public void setReasonStopped(Integer reasonStopped) {
		this.reasonStopped = reasonStopped;
	}
	public String getProvidedDetailStopped() {
		return providedDetailStopped;
	}
	public void setProvidedDetailStopped(String providedDetailStopped) {
		this.providedDetailStopped = providedDetailStopped;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public String getDutiesDesc() {
		return dutiesDesc;
	}
	public void setDutiesDesc(String dutiesDesc) {
		this.dutiesDesc = dutiesDesc;
	}
	public Integer getHadOtherJobs() {
		return hadOtherJobs;
	}
	public void setHadOtherJobs(Integer hadOtherJobs) {
		this.hadOtherJobs = hadOtherJobs;
	}
}
