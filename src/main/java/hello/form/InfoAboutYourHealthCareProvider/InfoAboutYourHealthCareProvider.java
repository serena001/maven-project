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
public class InfoAboutYourHealthCareProvider {
	@Getter @Setter
	MainDoctorNursePractitioner  mainDoctorNursePractitioner;
	@Getter @Setter
	OtherHealthCareProviders  otherHealthCareProviders;
	public MainDoctorNursePractitioner getMainDoctorNursePractitioner() {
		return mainDoctorNursePractitioner;
	}
	public void setMainDoctorNursePractitioner(MainDoctorNursePractitioner mainDoctorNursePractitioner) {
		this.mainDoctorNursePractitioner = mainDoctorNursePractitioner;
	}
	public OtherHealthCareProviders getOtherHealthCareProviders() {
		return otherHealthCareProviders;
	}
	public void setOtherHealthCareProviders(OtherHealthCareProviders otherHealthCareProviders) {
		this.otherHealthCareProviders = otherHealthCareProviders;
	}
}
