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
public class Test {
	@Getter @Setter
	private Integer testType;
	@Getter @Setter
	private LocalDate date;
	@Getter @Setter
	private String hospitalClinicCity;
	public Integer getTestType() {
		return testType;
	}
	public void setTestType(Integer testType) {
		this.testType = testType;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getHospitalClinicCity() {
		return hospitalClinicCity;
	}
	public void setHospitalClinicCity(String hospitalClinicCity) {
		this.hospitalClinicCity = hospitalClinicCity;
	}
}
