package hello.form.InfoAboutYourMedicalCondition;

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
public class FuncAssOtherDaily {
	@Getter @Setter
	private Integer dailyActivitiesProblems;
	@Getter @Setter
	private Integer dapQ1;
	@Getter @Setter
	private Integer dapQ2;
	@Getter @Setter
	private Integer dapQ3;
	@Getter @Setter
	private Integer dapQ4;
	@Getter @Setter
	private Integer dapQ5;
	@Getter @Setter
	private Integer dapQ6;
	@Getter @Setter
	private Integer dapQ7;
	@Getter @Setter
	private Integer dapQ8;
	@Getter @Setter
	private Integer dapQ9;	
	@Getter @Setter
	private Integer dapQ10;
	@Getter @Setter
	private String additionalInformationDailyActivities;
	public Integer getDailyActivitiesProblems() {
		return dailyActivitiesProblems;
	}
	public void setDailyActivitiesProblems(Integer dailyActivitiesProblems) {
		this.dailyActivitiesProblems = dailyActivitiesProblems;
	}
	public Integer getDapQ1() {
		return dapQ1;
	}
	public void setDapQ1(Integer dapQ1) {
		this.dapQ1 = dapQ1;
	}
	public Integer getDapQ2() {
		return dapQ2;
	}
	public void setDapQ2(Integer dapQ2) {
		this.dapQ2 = dapQ2;
	}
	public Integer getDapQ3() {
		return dapQ3;
	}
	public void setDapQ3(Integer dapQ3) {
		this.dapQ3 = dapQ3;
	}
	public Integer getDapQ4() {
		return dapQ4;
	}
	public void setDapQ4(Integer dapQ4) {
		this.dapQ4 = dapQ4;
	}
	public Integer getDapQ5() {
		return dapQ5;
	}
	public void setDapQ5(Integer dapQ5) {
		this.dapQ5 = dapQ5;
	}
	public Integer getDapQ6() {
		return dapQ6;
	}
	public void setDapQ6(Integer dapQ6) {
		this.dapQ6 = dapQ6;
	}
	public Integer getDapQ7() {
		return dapQ7;
	}
	public void setDapQ7(Integer dapQ7) {
		this.dapQ7 = dapQ7;
	}
	public Integer getDapQ8() {
		return dapQ8;
	}
	public void setDapQ8(Integer dapQ8) {
		this.dapQ8 = dapQ8;
	}
	public Integer getDapQ9() {
		return dapQ9;
	}
	public void setDapQ9(Integer dapQ9) {
		this.dapQ9 = dapQ9;
	}
	public Integer getDapQ10() {
		return dapQ10;
	}
	public void setDapQ10(Integer dapQ10) {
		this.dapQ10 = dapQ10;
	}
	public String getAdditionalInformationDailyActivities() {
		return additionalInformationDailyActivities;
	}
	public void setAdditionalInformationDailyActivities(String additionalInformationDailyActivities) {
		this.additionalInformationDailyActivities = additionalInformationDailyActivities;
	}
}
