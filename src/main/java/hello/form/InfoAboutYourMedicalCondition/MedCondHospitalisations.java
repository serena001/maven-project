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
public class MedCondHospitalisations {
	@Getter @Setter
	private List<Hospital>hospitalLst;

	public List<Hospital> getHospitalLst() {
		return hospitalLst;
	}

	public void setHospitalLst(List<Hospital> hospitalLst) {
		this.hospitalLst = hospitalLst;
	}
}
