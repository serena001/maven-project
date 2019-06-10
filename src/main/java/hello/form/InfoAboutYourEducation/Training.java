package hello.form.InfoAboutYourEducation;

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
public class Training {
	@Getter @Setter
	private String title;
	@Getter @Setter
	private LocalDate dateCompleted;
	@Getter @Setter
	private String certificateRec;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getDateCompleted() {
		return dateCompleted;
	}
	public void setDateCompleted(LocalDate dateCompleted) {
		this.dateCompleted = dateCompleted;
	}
	public String getCertificateRec() {
		return certificateRec;
	}
	public void setCertificateRec(String certificateRec) {
		this.certificateRec = certificateRec;
	}
}
