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
public class Consent implements Serializable{
	@Getter @Setter
	private Integer consent;

	public Integer getConsent() {
		return consent;
	}

	public void setConsent(Integer consent) {
		this.consent = consent;
	}
}
