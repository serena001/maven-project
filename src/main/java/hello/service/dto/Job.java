package hello.service.dto;

import static lombok.AccessLevel.PRIVATE;

import java.io.Serializable;
import java.time.LocalDate;

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
public class Job implements Serializable{
	@Getter @Setter
	private String title;
	@Getter @Setter
	private LocalDate from;
	@Getter @Setter
	private LocalDate to;
	@Getter @Setter
	private String companyName;
	@Getter @Setter
	private Address address;
	@Getter @Setter
	private String phone;
	@Getter @Setter
	private Integer typeOfWork;
	@Getter @Setter
	private Float numberOfHoursPerDay;
	@Getter @Setter
	private Float numberOfDaysPerWeek;
	@Getter @Setter
	private String duties;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getFrom() {
		return from;
	}
	public void setFrom(LocalDate from) {
		this.from = from;
	}
	public LocalDate getTo() {
		return to;
	}
	public void setTo(LocalDate to) {
		this.to = to;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getTypeOfWork() {
		return typeOfWork;
	}
	public void setTypeOfWork(Integer typeOfWork) {
		this.typeOfWork = typeOfWork;
	}
	public Float getNumberOfHoursPerDay() {
		return numberOfHoursPerDay;
	}
	public void setNumberOfHoursPerDay(Float numberOfHoursPerDay) {
		this.numberOfHoursPerDay = numberOfHoursPerDay;
	}
	public Float getNumberOfDaysPerWeek() {
		return numberOfDaysPerWeek;
	}
	public void setNumberOfDaysPerWeek(Float numberOfDaysPerWeek) {
		this.numberOfDaysPerWeek = numberOfDaysPerWeek;
	}
	public String getDuties() {
		return duties;
	}
	public void setDuties(String duties) {
		this.duties = duties;
	}
}
