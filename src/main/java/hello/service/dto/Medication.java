package hello.service.dto;

import static lombok.AccessLevel.PRIVATE;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import hello.form.InfoAboutYourEducation.Training;
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
public class Medication implements Serializable{
	@Getter @Setter
	private List<Training> training;
	@Getter @Setter
	private Integer highestLvl;
	@Getter @Setter
	private String fieldOfStudy;
	@Getter @Setter
	private LocalDate dateAttained;
	@Getter @Setter
	private Integer hasTrainingType;
	public List<Training> getTraining() {
		return training;
	}
	public void setTraining(List<Training> training) {
		this.training = training;
	}
	public Integer getHighestLvl() {
		return highestLvl;
	}
	public void setHighestLvl(Integer highestLvl) {
		this.highestLvl = highestLvl;
	}
	public String getFieldOfStudy() {
		return fieldOfStudy;
	}
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}
	public LocalDate getDateAttained() {
		return dateAttained;
	}
	public void setDateAttained(LocalDate dateAttained) {
		this.dateAttained = dateAttained;
	}
	public Integer getHasTrainingType() {
		return hasTrainingType;
	}
	public void setHasTrainingType(Integer hasTrainingType) {
		this.hasTrainingType = hasTrainingType;
	}
}
