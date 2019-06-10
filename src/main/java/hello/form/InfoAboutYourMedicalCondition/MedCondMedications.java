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
public class MedCondMedications {
	@Getter @Setter
	private List<Medication>medicationLst;

	public List<Medication> getMedicationLst() {
		return medicationLst;
	}

	public void setMedicationLst(List<Medication> medicationLst) {
		this.medicationLst = medicationLst;
	}
}
