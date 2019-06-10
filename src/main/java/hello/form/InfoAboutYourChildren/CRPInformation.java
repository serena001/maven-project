package hello.form.InfoAboutYourChildren;

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
public class CRPInformation {
	@Getter @Setter 
	private Integer caregiver;
	@Getter @Setter 
	private LocalDate notCaregiverFrom;
	@Getter @Setter 
	private LocalDate notCaregiverTo;
	@Getter @Setter 
	private LocalDate notCaregiverReason;
	@Getter @Setter 
	private Integer fAReceived;
	@Getter @Setter 
	private Integer fAWhoReceived;
	@Getter @Setter 
	private Integer cCBReceived;
	@Getter @Setter 
	private Integer cCBWhoReceived;
	@Getter @Setter 
	private Integer periodOfNoFA_CCB_from;
	@Getter @Setter 
	private Integer periodOfNoFA_CCB_reason;
	public Integer getCaregiver() {
		return caregiver;
	}
	public void setCaregiver(Integer caregiver) {
		this.caregiver = caregiver;
	}
	public LocalDate getNotCaregiverFrom() {
		return notCaregiverFrom;
	}
	public void setNotCaregiverFrom(LocalDate notCaregiverFrom) {
		this.notCaregiverFrom = notCaregiverFrom;
	}
	public LocalDate getNotCaregiverTo() {
		return notCaregiverTo;
	}
	public void setNotCaregiverTo(LocalDate notCaregiverTo) {
		this.notCaregiverTo = notCaregiverTo;
	}
	public LocalDate getNotCaregiverReason() {
		return notCaregiverReason;
	}
	public void setNotCaregiverReason(LocalDate notCaregiverReason) {
		this.notCaregiverReason = notCaregiverReason;
	}
	public Integer getfAReceived() {
		return fAReceived;
	}
	public void setfAReceived(Integer fAReceived) {
		this.fAReceived = fAReceived;
	}
	public Integer getfAWhoReceived() {
		return fAWhoReceived;
	}
	public void setfAWhoReceived(Integer fAWhoReceived) {
		this.fAWhoReceived = fAWhoReceived;
	}
	public Integer getcCBReceived() {
		return cCBReceived;
	}
	public void setcCBReceived(Integer cCBReceived) {
		this.cCBReceived = cCBReceived;
	}
	public Integer getcCBWhoReceived() {
		return cCBWhoReceived;
	}
	public void setcCBWhoReceived(Integer cCBWhoReceived) {
		this.cCBWhoReceived = cCBWhoReceived;
	}
	public Integer getPeriodOfNoFA_CCB_from() {
		return periodOfNoFA_CCB_from;
	}
	public void setPeriodOfNoFA_CCB_from(Integer periodOfNoFA_CCB_from) {
		this.periodOfNoFA_CCB_from = periodOfNoFA_CCB_from;
	}
	public Integer getPeriodOfNoFA_CCB_reason() {
		return periodOfNoFA_CCB_reason;
	}
	public void setPeriodOfNoFA_CCB_reason(Integer periodOfNoFA_CCB_reason) {
		this.periodOfNoFA_CCB_reason = periodOfNoFA_CCB_reason;
	}
}
