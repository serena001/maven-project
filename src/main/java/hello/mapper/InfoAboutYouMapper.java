package hello.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import hello.form.InfoAboutYou.CommunicationPreferences;
import hello.form.InfoAboutYou.MaritalStatusChildren;
import hello.service.dto.InfoAboutYou;
import hello.service.dto.MaritalInfo;

@Mapper
public interface InfoAboutYouMapper {
	@Mappings({	
		@Mapping(source = "communicationPreferences.language",target = "language"),
		//@Mapping(source = "communicationPreferences.qppBenefits",target = "ccbIsReceived"),
		@Mapping(source = "communicationPreferences.time",target = "contactTime"),
		@Mapping(source = "maritalStatusChildren",target = "maritalInfo")
	})
    InfoAboutYou InfoAboutYouToInfoAboutYou(CommunicationPreferences communicationPreferences,MaritalStatusChildren maritalStatusChildren);
	
	@Mappings({	
		@Mapping(source = "infoAboutYou.maritalInfo",target = "maritalStatusChildren")
	})
	hello.form.InfoAboutYou.InfoAboutYou InfoAboutYouToMaritalStatusChildren(InfoAboutYou infoAboutYou);	
	
	@Mappings({	
		@Mapping(source = "infoAboutYou.language",target = "language"),
		//@Mapping(source = "communicationPreferences.qppBenefits",target = "ccbIsReceived"),
		@Mapping(source = "infoAboutYou.contactTime",target = "time"),
	})
	CommunicationPreferences InfoAboutYouToCommunicationPreferences(InfoAboutYou infoAboutYou);


	//Marital Status to MartialStatusChildren
	@Mappings({	
		@Mapping(source = "maritalStatusChildren.endDate",target = "to"),
		@Mapping(source = "maritalStatusChildren.martialStatus",target = "status"),
//		@Mapping(source = "maritalStatusChildren.numChildren",target = "language"),
//		@Mapping(source = "maritalStatusChildren.sixYearsJobs",target = "language"),
		@Mapping(source = "maritalStatusChildren.startDate",target = "from"),
	})
    MaritalInfo maritalStatusToMaritalStatusChildren(MaritalStatusChildren maritalStatusChildren);
	
	@Mappings({	
		@Mapping(source = "maritalInfo.to",target = "endDate"),
		@Mapping(source = "maritalInfo.status",target = "martialStatus"),
//		@Mapping(source = "maritalStatusChildren.numChildren",target = "language"),
//		@Mapping(source = "maritalStatusChildren.sixYearsJobs",target = "language"),
		@Mapping(source = "maritalInfo.from",target = "startDate"),
	})
	MaritalStatusChildren maritalStatusChildrenToMaritalStatus(MaritalInfo maritalInfo);

}
