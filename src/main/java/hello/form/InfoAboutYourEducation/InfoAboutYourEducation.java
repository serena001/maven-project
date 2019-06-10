package hello.form.InfoAboutYourEducation;

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
public class InfoAboutYourEducation {
	@Getter @Setter
	EducationLevelTraining educationLevelTraining;

	public EducationLevelTraining getEducationLevelTraining() {
		return educationLevelTraining;
	}

	public void setEducationLevelTraining(EducationLevelTraining educationLevelTraining) {
		this.educationLevelTraining = educationLevelTraining;
	}
}
