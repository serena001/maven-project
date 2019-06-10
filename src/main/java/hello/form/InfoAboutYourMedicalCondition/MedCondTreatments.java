package hello.form.InfoAboutYourMedicalCondition;

import static lombok.AccessLevel.PRIVATE;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor(access=PRIVATE)
@Getter @Setter
public class MedCondTreatments {
	@Getter @Setter
	private List<Treatment> treatmentLst;

	public List<Treatment> getTreatmentLst() {
		return treatmentLst;
	}

	public void setTreatmentLst(List<Treatment> treatmentLst) {
		this.treatmentLst = treatmentLst;
	}
}
