package hello.form.InfoAboutYourChildren;

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
public class ConsentToContactCustChild {
	@Getter @Setter
	private Integer contactConsent;

	public Integer getContactConsent() {
		return contactConsent;
	}

	public void setContactConsent(Integer contactConsent) {
		this.contactConsent = contactConsent;
	}
}
