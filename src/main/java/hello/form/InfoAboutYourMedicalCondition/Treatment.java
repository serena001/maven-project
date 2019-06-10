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
public class Treatment {
	@Getter @Setter
	private Integer treatmentType;
	@Getter @Setter
	private LocalDate from;
	@Getter @Setter
	private LocalDate to;
	@Getter @Setter
	private String treatmentReceived;
	public Integer getTreatmentType() {
		return treatmentType;
	}
	public void setTreatmentType(Integer treatmentType) {
		this.treatmentType = treatmentType;
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
	public String getTreatmentReceived() {
		return treatmentReceived;
	}
	public void setTreatmentReceived(String treatmentReceived) {
		this.treatmentReceived = treatmentReceived;
	}
}
