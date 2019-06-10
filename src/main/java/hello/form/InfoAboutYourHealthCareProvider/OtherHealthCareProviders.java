package hello.form.InfoAboutYourHealthCareProvider;

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
public class OtherHealthCareProviders {
	@Getter @Setter
	private List<HealthCareProvider> healthCareProvidersLst;

	public List<HealthCareProvider> getHealthCareProvidersLst() {
		return healthCareProvidersLst;
	}

	public void setHealthCareProvidersLst(List<HealthCareProvider> healthCareProvidersLst) {
		this.healthCareProvidersLst = healthCareProvidersLst;
	}
}
