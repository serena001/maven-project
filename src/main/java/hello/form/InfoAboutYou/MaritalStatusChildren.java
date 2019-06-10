package hello.form.InfoAboutYou;

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
public class MaritalStatusChildren {
	@Getter @Setter
	private Integer martialStatus;
	@Getter @Setter
	private Integer numChildren;
	@Getter @Setter
	private LocalDate startDate;
	@Getter @Setter
	private LocalDate endDate;
	@Getter @Setter
	private Integer sixYearsJobs;
	public Integer getMartialStatus() {
		return martialStatus;
	}
	public void setMartialStatus(Integer martialStatus) {
		this.martialStatus = martialStatus;
	}
	public Integer getNumChildren() {
		return numChildren;
	}
	public void setNumChildren(Integer numChildren) {
		this.numChildren = numChildren;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Integer getSixYearsJobs() {
		return sixYearsJobs;
	}
	public void setSixYearsJobs(Integer sixYearsJobs) {
		this.sixYearsJobs = sixYearsJobs;
	}
}
