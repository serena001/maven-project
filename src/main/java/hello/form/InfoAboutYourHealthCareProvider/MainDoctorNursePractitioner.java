package hello.form.InfoAboutYourHealthCareProvider;

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
public class MainDoctorNursePractitioner {
	@Getter @Setter
	private Integer doctorType;
	@Getter @Setter
	private HealthCareProvider healthCareProvider;
	public Integer getDoctorType() {
		return doctorType;
	}
	public void setDoctorType(Integer doctorType) {
		this.doctorType = doctorType;
	}
	public HealthCareProvider getHealthCareProvider() {
		return healthCareProvider;
	}
	public void setHealthCareProvider(HealthCareProvider healthCareProvider) {
		this.healthCareProvider = healthCareProvider;
	}
}
