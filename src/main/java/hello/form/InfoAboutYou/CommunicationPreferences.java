package hello.form.InfoAboutYou;

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
public class CommunicationPreferences {
	@Getter @Setter
	private Integer language;
	@Getter @Setter
	private Integer time;
	@Getter @Setter
	private Integer qppBenefits;
	public Integer getLanguage() {
		return language;
	}
	public void setLanguage(Integer language) {
		this.language = language;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public Integer getQppBenefits() {
		return qppBenefits;
	}
	public void setQppBenefits(Integer qppBenefits) {
		this.qppBenefits = qppBenefits;
	}
}
