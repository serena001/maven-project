package hello.service.dto;

import static lombok.AccessLevel.PRIVATE;

import java.io.Serializable;
import java.util.List;

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
public class InfoAboutYourChildren implements Serializable{
	@Getter @Setter
	private List<Child> children;
	@Getter @Setter
	private Integer requestCrp;
	@Getter @Setter
	private Integer primaryCaregiver;
	@Getter @Setter
	private Integer faIsReceived;
	@Getter @Setter
	private Integer faWhoReceived;
	@Getter @Setter
	private Integer ccbIsReceived;
	@Getter @Setter
	private Integer ccbWhoReceived;
	@Getter @Setter
	private List<Custodian>custodianForChildrenUnder18;
	@Getter @Setter
	private List<Custodian>custodianForChildrenAbove18;
	@Getter @Setter
	private Integer consentToContact;
	public List<Child> getChildren() {
		return children;
	}
	public void setChildren(List<Child> children) {
		this.children = children;
	}
	public Integer getRequestCrp() {
		return requestCrp;
	}
	public void setRequestCrp(Integer requestCrp) {
		this.requestCrp = requestCrp;
	}
	public Integer getPrimaryCaregiver() {
		return primaryCaregiver;
	}
	public void setPrimaryCaregiver(Integer primaryCaregiver) {
		this.primaryCaregiver = primaryCaregiver;
	}
	public Integer getFaIsReceived() {
		return faIsReceived;
	}
	public void setFaIsReceived(Integer faIsReceived) {
		this.faIsReceived = faIsReceived;
	}
	public Integer getFaWhoReceived() {
		return faWhoReceived;
	}
	public void setFaWhoReceived(Integer faWhoReceived) {
		this.faWhoReceived = faWhoReceived;
	}
	public Integer getCcbIsReceived() {
		return ccbIsReceived;
	}
	public void setCcbIsReceived(Integer ccbIsReceived) {
		this.ccbIsReceived = ccbIsReceived;
	}
	public Integer getCcbWhoReceived() {
		return ccbWhoReceived;
	}
	public void setCcbWhoReceived(Integer ccbWhoReceived) {
		this.ccbWhoReceived = ccbWhoReceived;
	}
	public List<Custodian> getCustodianForChildrenUnder18() {
		return custodianForChildrenUnder18;
	}
	public void setCustodianForChildrenUnder18(List<Custodian> custodianForChildrenUnder18) {
		this.custodianForChildrenUnder18 = custodianForChildrenUnder18;
	}
	public List<Custodian> getCustodianForChildrenAbove18() {
		return custodianForChildrenAbove18;
	}
	public void setCustodianForChildrenAbove18(List<Custodian> custodianForChildrenAbove18) {
		this.custodianForChildrenAbove18 = custodianForChildrenAbove18;
	}
	public Integer getConsentToContact() {
		return consentToContact;
	}
	public void setConsentToContact(Integer consentToContact) {
		this.consentToContact = consentToContact;
	}
}
