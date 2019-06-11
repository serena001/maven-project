package hello.service.dto;

import static lombok.AccessLevel.PRIVATE;

import java.io.Serializable;
import java.util.List;

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
public class InfoAboutYourHealthCareProvider implements Serializable{
	@Getter @Setter
	private Integer doctorType1;
	@Getter @Setter
	private InfoAboutYourHealthCareProvider healthCareProvider1;
	@Getter @Setter
	private List<InfoAboutYourHealthCareProvider> healthCareProviders;
	public Integer getDoctorType1() {
		return doctorType1;
	}
	public void setDoctorType1(Integer doctorType1) {
		this.doctorType1 = doctorType1;
	}
	public InfoAboutYourHealthCareProvider getHealthCareProvider1() {
		return healthCareProvider1;
	}
	public void setHealthCareProvider1(InfoAboutYourHealthCareProvider healthCareProvider1) {
		this.healthCareProvider1 = healthCareProvider1;
	}
	public List<InfoAboutYourHealthCareProvider> getHealthCareProviders() {
		return healthCareProviders;
	}
	public void setHealthCareProviders(List<InfoAboutYourHealthCareProvider> healthCareProviders) {
		this.healthCareProviders = healthCareProviders;
	}



}
