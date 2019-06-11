package hello.form.Consent;

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
public class ConsentToCommun {
	@Getter @Setter
	private Integer consent;

	public Integer getConsent() {
		return consent;
	}

	public void setConsent(Integer consent) {
		this.consent = consent;
	}
}