package hello.form.InfoAboutYourWorkHistory;

import static lombok.AccessLevel.PRIVATE;

import java.util.List;

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
public class WorkHistOtherJobs {
	@Getter @Setter
	private List<Job>jobLst;

	public List<Job> getJobLst() {
		return jobLst;
	}

	public void setJobLst(List<Job> jobLst) {
		this.jobLst = jobLst;
	}
}
