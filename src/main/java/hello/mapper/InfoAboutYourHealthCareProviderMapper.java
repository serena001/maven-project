package hello.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import hello.form.InfoAboutYourHealthCareProvider.HealthCareProvider;
import hello.form.InfoAboutYourHealthCareProvider.MainDoctorNursePractitioner;
import hello.form.InfoAboutYourHealthCareProvider.OtherHealthCareProviders;
import hello.service.dto.InfoAboutYourHealthCareProvider;

@Mapper
public interface InfoAboutYourHealthCareProviderMapper {
	@Mappings({	
		@Mapping(source = "mainDoctorNursePractitioner.doctorType",target = "doctorType1"),
		@Mapping(source = "mainDoctorNursePractitioner.healthCareProvider",target = "healthCareProvider1"),
		@Mapping(source = "otherHealthCareProviders.healthCareProvidersLst",target = "healthCareProviders"),
	})
   InfoAboutYourHealthCareProvider HealthCareProviderFormToHealthCareProviderForm(MainDoctorNursePractitioner mainDoctorNursePractitioner,OtherHealthCareProviders otherHealthCareProviders);

	@Mappings({	
		@Mapping(source = "healthCareProvider.healthCareProviders",target = "healthCareProvidersLst")
	})
	OtherHealthCareProviders HealthCareProviderToMainDoctorNursePractitioner(hello.service.dto.InfoAboutYourHealthCareProvider healthCareProvider);

	@Mappings({	
		@Mapping(source = "healthCareProviderVal.doctorType1",target = "doctorType"),
		@Mapping(source = "healthCareProviderVal.healthCareProvider1",target = "healthCareProvider")
	})
	MainDoctorNursePractitioner HealthCareProviderToOtherHealthCareProviders(hello.service.dto.InfoAboutYourHealthCareProvider healthCareProviderVal);
	
	@Mappings({	
		@Mapping(source = "healthCareProv.address",target = "address"),
		@Mapping(source = "healthCareProv.firstVisit",target = "firstVisit"),
		@Mapping(source = "healthCareProv.lastVisit",target = "lastVisit"),
		@Mapping(source = "healthCareProv.name",target = "name"),
		@Mapping(source = "healthCareProv.reasonVisit",target = "reasonVisit"),
		@Mapping(source = "healthCareProv.speciality",target = "speciality"),
		@Mapping(source = "healthCareProv.telephone",target = "telephone"),
		@Mapping(source = "healthCareProv.telephoneExt",target = "telephoneExt"),
	})
	hello.service.dto.HealthCareProvider HealthCareProviderToHealthCareProviderForm(HealthCareProvider healthCareProv);

	@Mappings({	
		@Mapping(source = "healthCareProv.address",target = "address"),
		@Mapping(source = "healthCareProv.firstVisit",target = "firstVisit"),
		@Mapping(source = "healthCareProv.lastVisit",target = "lastVisit"),
		@Mapping(source = "healthCareProv.name",target = "name"),
		@Mapping(source = "healthCareProv.reasonVisit",target = "reasonVisit"),
		@Mapping(source = "healthCareProv.speciality",target = "speciality"),
		@Mapping(source = "healthCareProv.telephone",target = "telephone"),
		@Mapping(source = "healthCareProv.telephoneExt",target = "telephoneExt"),
	})
	HealthCareProvider HealthCareProviderFormToHealthCareProvider(hello.service.dto.HealthCareProvider healthCareProv);

	
}
