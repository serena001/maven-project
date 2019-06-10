package hello.form;

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
public class Job {
	@Getter @Setter
	private String titlePosition;
	@Getter @Setter
	private LocalDate fromDate;
	@Getter @Setter
	private LocalDate toDate;
	@Getter @Setter
	private Integer workType;
	@Getter @Setter
	private float hoursPerDay;
	@Getter @Setter
	private float daysPerWeek;
	@Getter @Setter
	private String employerName;
	@Getter @Setter
	private Address address;
	@Getter @Setter
	private String duties;
	@Getter @Setter
	private String phone;
	public String getTitlePosition() {
		return titlePosition;
	}
	public void setTitlePosition(String titlePosition) {
		this.titlePosition = titlePosition;
	}
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	public Integer getWorkType() {
		return workType;
	}
	public void setWorkType(Integer workType) {
		this.workType = workType;
	}
	public float getHoursPerDay() {
		return hoursPerDay;
	}
	public void setHoursPerDay(float hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}
	public float getDaysPerWeek() {
		return daysPerWeek;
	}
	public void setDaysPerWeek(float daysPerWeek) {
		this.daysPerWeek = daysPerWeek;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDuties() {
		return duties;
	}
	public void setDuties(String duties) {
		this.duties = duties;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
