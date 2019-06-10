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
public class InfoAboutYou {
	@Getter @Setter
	AddressDDTelephone AddressDDTelephone;
	@Getter @Setter
	CommunicationPreferences communicationPreferences;
	@Getter @Setter
	MaritalStatusChildren maritalStatusChildren;
	public AddressDDTelephone getAddressDDTelephone() {
		return AddressDDTelephone;
	}
	public void setAddressDDTelephone(AddressDDTelephone addressDDTelephone) {
		AddressDDTelephone = addressDDTelephone;
	}
	public CommunicationPreferences getCommunicationPreferences() {
		return communicationPreferences;
	}
	public void setCommunicationPreferences(CommunicationPreferences communicationPreferences) {
		this.communicationPreferences = communicationPreferences;
	}
	public MaritalStatusChildren getMaritalStatusChildren() {
		return maritalStatusChildren;
	}
	public void setMaritalStatusChildren(MaritalStatusChildren maritalStatusChildren) {
		this.maritalStatusChildren = maritalStatusChildren;
	}
}
