package hello.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import hello.form.InfoAboutYourChildren.CRPInformation;
import hello.form.InfoAboutYourChildren.ChildDOBName;
import hello.form.InfoAboutYourChildren.ConsentToContactCustChild;
import hello.form.InfoAboutYourChildren.DCCCustodyAndContrChild;
import hello.form.InfoAboutYourChildren.IdentityChildren;
import hello.form.InfoAboutYourChildren.RequestCRP;
import hello.service.dto.Child;
import hello.service.dto.Custodian;
import hello.service.dto.InfoAboutYourChildren;
@Mapper
public interface InfoAboutYourChildrenMapper {
	@Mappings({	
		@Mapping(source = "cRPInformation.cCBReceived",target = "ccbIsReceived"),
		@Mapping(source = "cRPInformation.cCBWhoReceived",target = "ccbWhoReceived"),
		@Mapping(source = "identityChildren.childLst",target = "children"),
		@Mapping(source = "consentToContactCustChild.contactConsent",target = "consentToContact"),
		@Mapping(source = "dCCCustodyAndContrChild.under18childDOBLst",target = "custodianForChildrenAbove18"),
		@Mapping(source = "dCCCustodyAndContrChild.child18to25DOBLst",target = "custodianForChildrenUnder18"),
		@Mapping(source = "cRPInformation.fAReceived",target = "faIsReceived"),
		@Mapping(source = "cRPInformation.fAWhoReceived",target = "faWhoReceived"),
		@Mapping(source = "cRPInformation.caregiver",target = "primaryCaregiver"),
		@Mapping(source = "requestCRP.requestCRP",target = "requestCrp")
	})
    InfoAboutYourChildren InfoAboutYourChildrenAndToInfoAboutYourChildren(
    		ChildDOBName childDOBName, 
    		ConsentToContactCustChild consentToContactCustChild,
    		CRPInformation cRPInformation,
    		DCCCustodyAndContrChild dCCCustodyAndContrChild,
    		IdentityChildren identityChildren,
    		RequestCRP requestCRP
    		);
//----------	
	@Mappings({	
		@Mapping(source = "infoAboutYourChildren.ccbIsReceived",target = "cCBReceived"),
		@Mapping(source = "infoAboutYourChildren.ccbWhoReceived",target = "cCBWhoReceived"),
		@Mapping(source = "infoAboutYourChildren.faIsReceived",target = "fAReceived"),
		@Mapping(source = "infoAboutYourChildren.faWhoReceived",target = "fAWhoReceived"),
		@Mapping(source = "infoAboutYourChildren.primaryCaregiver",target = "caregiver"),
	})
	CRPInformation InfoAboutYourChildrenToCRPInformation(InfoAboutYourChildren infoAboutYourChildren);
	
	@Mappings({	
		@Mapping(source = "infoAboutYourChildren.custodianForChildrenAbove18",target = "under18childDOBLst"),
		@Mapping(source = "infoAboutYourChildren.custodianForChildrenUnder18",target = "child18to25DOBLst"),
	})
	DCCCustodyAndContrChild InfoAboutYourChildrenToDCCCustodyAndContrChild(InfoAboutYourChildren infoAboutYourChildren);
	@Mappings({	
		@Mapping(source = "infoAboutYourChildren.consentToContact",target = "contactConsent"),
	})
	ConsentToContactCustChild InfoAboutYourChildrenToConsentToContactCustChild(InfoAboutYourChildren infoAboutYourChildren);
	
	@Mappings({	
		@Mapping(source = "infoAboutYourChildren.children",target = "childLst"),
	})
	IdentityChildren InfoAboutYourChildrenToIdentityChildren(InfoAboutYourChildren infoAboutYourChildren);
	
	@Mappings({	
		@Mapping(source = "infoAboutYourChildren.requestCrp",target = "requestCRP")
	})
	RequestCRP InfoAboutYourChildrenToRequestCRP(InfoAboutYourChildren infoAboutYourChildren);
	
	
//ChildDOBNAME and Custodian
	
	@Mappings({	
		@Mapping(source = "childDOBName.address",target = "address"),
		@Mapping(source = "childDOBName.child",target = "child"),
		@Mapping(source = "childDOBName.childInSchool",target = "isAttendingFullTimeSchool"),
		@Mapping(source = "childDOBName.custodianName",target = "name"),
		@Mapping(source = "childDOBName.hasCustody",target = "hasCustody"),
		@Mapping(source = "childDOBName.sameCustodian",target = "isUnderSameCustodian")
	})
	Custodian childDOBNameToCustodian(hello.form.InfoAboutYourChildren.ChildDOBName childDOBName);

	@Mappings({	
		@Mapping(source = "custodian.address",target = "address"),
		@Mapping(source = "custodian.child",target = "child"),
		@Mapping(source = "custodian.isAttendingFullTimeSchool",target = "childInSchool"),
		@Mapping(source = "custodian.name",target = "custodianName"),
		@Mapping(source = "custodian.hasCustody",target = "hasCustody"),
		@Mapping(source = "custodian.isUnderSameCustodian",target = "sameCustodian")
	})
	hello.form.InfoAboutYourChildren.ChildDOBName childDOBNameToCustodian(Custodian custodian);
	
//Child
	@Mappings({	
		@Mapping(source = "child.address",target = "address"),
		@Mapping(source = "child.dateEnteredCanada",target = "dateEnteredCanada"),
		@Mapping(source = "child.dateOfBirth",target = "dateOfBirth"),
		@Mapping(source = "child.fullName",target = "name"),
		@Mapping(source = "child.relationship",target = "relationship"),
		@Mapping(source = "child.relationshipOther",target = "relationshipOther"),
		@Mapping(source = "child.sin",target = "sin"),
	})
	Child childToChildForm(hello.form.InfoAboutYourChildren.Child child);

	@Mappings({	
		@Mapping(source = "child.address",target = "address"),
		@Mapping(source = "child.dateEnteredCanada",target = "dateEnteredCanada"),
		@Mapping(source = "child.dateOfBirth",target = "dateOfBirth"),
		@Mapping(source = "child.name",target = "fullName"),
		@Mapping(source = "child.relationship",target = "relationship"),
		@Mapping(source = "child.relationshipOther",target = "relationshipOther"),
		@Mapping(source = "child.sin",target = "sin"),
	})
	hello.form.InfoAboutYourChildren.Child childFormToChild(Child child);
	

	
	
}

