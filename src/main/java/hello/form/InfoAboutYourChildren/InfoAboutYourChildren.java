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
public class InfoAboutYourChildren {
	@Getter @Setter
	IdentityChildren identityChildren;
	@Getter @Setter
	RequestCRP  requestCRP;
	@Getter @Setter
	CRPInformation cRPInformation;
	@Getter @Setter
	DCCCustodyAndContrChild dCCCustodyAndContrChild;
	@Getter @Setter
	ConsentToContactCustChild consentToContactCustChild;
	public IdentityChildren getIdentityChildren() {
		return identityChildren;
	}
	public void setIdentityChildren(IdentityChildren identityChildren) {
		this.identityChildren = identityChildren;
	}
	public RequestCRP getRequestCRP() {
		return requestCRP;
	}
	public void setRequestCRP(RequestCRP requestCRP) {
		this.requestCRP = requestCRP;
	}
	public CRPInformation getcRPInformation() {
		return cRPInformation;
	}
	public void setcRPInformation(CRPInformation cRPInformation) {
		this.cRPInformation = cRPInformation;
	}
	public DCCCustodyAndContrChild getdCCCustodyAndContrChild() {
		return dCCCustodyAndContrChild;
	}
	public void setdCCCustodyAndContrChild(DCCCustodyAndContrChild dCCCustodyAndContrChild) {
		this.dCCCustodyAndContrChild = dCCCustodyAndContrChild;
	}
	public ConsentToContactCustChild getConsentToContactCustChild() {
		return consentToContactCustChild;
	}
	public void setConsentToContactCustChild(ConsentToContactCustChild consentToContactCustChild) {
		this.consentToContactCustChild = consentToContactCustChild;
	}
}
