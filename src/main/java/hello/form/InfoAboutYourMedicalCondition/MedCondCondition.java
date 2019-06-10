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
public class MedCondCondition {
	@Getter @Setter
	private LocalDate cannotWorkDate;
	@Getter @Setter
	private String medicalCondition;
	@Getter @Setter
	private String medicalConditionAddit;
	@Getter @Setter
	private Integer hand;
	@Getter @Setter
	private String aids;
	public LocalDate getCannotWorkDate() {
		return cannotWorkDate;
	}
	public void setCannotWorkDate(LocalDate cannotWorkDate) {
		this.cannotWorkDate = cannotWorkDate;
	}
	public String getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	public String getMedicalConditionAddit() {
		return medicalConditionAddit;
	}
	public void setMedicalConditionAddit(String medicalConditionAddit) {
		this.medicalConditionAddit = medicalConditionAddit;
	}
	public Integer getHand() {
		return hand;
	}
	public void setHand(Integer hand) {
		this.hand = hand;
	}
	public String getAids() {
		return aids;
	}
	public void setAids(String aids) {
		this.aids = aids;
	}
}
