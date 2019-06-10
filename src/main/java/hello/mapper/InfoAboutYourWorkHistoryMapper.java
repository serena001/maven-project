package hello.mapper;

import java.time.LocalDate;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import hello.form.Country;
import hello.form.Job;
import hello.form.InfoAboutYourWorkHistory.WorkHistCurrentLastEmployer;
import hello.form.InfoAboutYourWorkHistory.WorkHistMedicalConditions;
import hello.form.InfoAboutYourWorkHistory.WorkHistOtherCountries;
import hello.form.InfoAboutYourWorkHistory.WorkHistOtherJobs;
import hello.service.dto.InfoAboutYourWorkHistory;
import hello.service.dto.InternationalWork;
import lombok.Getter;
import lombok.Setter;

@Mapper
public interface InfoAboutYourWorkHistoryMapper {
	@Mappings({	
		@Mapping(target = "stoppedWork", source = "workHistCurrentLastEmployer.hasStoppedWorking"),		
		@Mapping(target = "reasonYouStoppedWork", source = "workHistCurrentLastEmployer.reasonStopped"),	
		@Mapping(target = "detailsYouStoppedWork", source = "	workHistCurrentLastEmployer.providedDetailStopped"),	
		@Mapping(target = "currentJob", source = "workHistCurrentLastEmployer.job"),		
		@Mapping(target = "otherJobs", source = "workHistOtherJobs.jobLst")	,	
		@Mapping(target = "didDifferentTypeOfWork", source = "workHistMedicalConditions.medicalCondition"),
		@Mapping(target = "differentTypeOfWorkDescription", source = "workHistMedicalConditions.medicalDescribe"),
		@Mapping(target = "receivedEmploymentInsurance", source = "workHistMedicalConditions.employmentInsurance"),
		@Mapping(target = "receivedEmploymentInsuranceFrom", source = "workHistMedicalConditions.insuranceFromDate"),
		@Mapping(target = "receivedEmploymentInsuranceTo", source = "workHistMedicalConditions.insuranceToDate"),
		@Mapping(target = "selfEmployed", source = "workHistMedicalConditions.selfEmployed"),
		@Mapping(target = "selfEmployedWork", source = "workHistMedicalConditions.involvementWithBusiness"),
		@Mapping(target = "declareSelfEmployedForTax", source = "workHistMedicalConditions.incomeTax"),
		@Mapping(target = "stillSelfEmployed", source = "workHistMedicalConditions.selfEmployeStill"),
		@Mapping(target = "workedInAnotherCountry", source = "workHistOtherCountries.workedAnotherCountry"),
		@Mapping(target = "internationalWork", source = "workHistOtherCountries.countryLst")
	})
    InfoAboutYourWorkHistory infoAboutYourWorkHistoryAndToInfoAboutYourWorkHistory(WorkHistCurrentLastEmployer workHistCurrentLastEmployer, WorkHistMedicalConditions workHistMedicalConditions,
    		WorkHistOtherCountries workHistOtherCountries,WorkHistOtherJobs workHistOtherJobs);
	
	@Mappings({	
		@Mapping(source = "infoAboutYourWorkHistory.stoppedWork", target = "hasStoppedWorking"),		
		@Mapping(source = "infoAboutYourWorkHistory.reasonYouStoppedWork", target = "reasonStopped"),	
		@Mapping(source = "infoAboutYourWorkHistory.detailsYouStoppedWork", target = "providedDetailStopped"),	
		@Mapping(source = "infoAboutYourWorkHistory.currentJob", target = "job"),			
	})
	hello.form.InfoAboutYourWorkHistory.WorkHistCurrentLastEmployer infoAboutYourWorkHistoryToWorkHistCurrentLastEmployer(InfoAboutYourWorkHistory infoAboutYourWorkHistory);

	@Mappings({			
		@Mapping(source = "infoAboutYourWorkHistory.didDifferentTypeOfWork", target = "medicalCondition"),
		@Mapping(source = "infoAboutYourWorkHistory.differentTypeOfWorkDescription", target = "medicalDescribe"),
		@Mapping(source = "infoAboutYourWorkHistory.receivedEmploymentInsurance", target = "employmentInsurance"),
		@Mapping(source = "infoAboutYourWorkHistory.receivedEmploymentInsuranceFrom", target = "insuranceFromDate"),
		@Mapping(source = "infoAboutYourWorkHistory.receivedEmploymentInsuranceTo", target = "insuranceToDate"),
		@Mapping(source = "infoAboutYourWorkHistory.selfEmployed", target = "selfEmployed"),
		@Mapping(source = "infoAboutYourWorkHistory.selfEmployedWork", target = "involvementWithBusiness"),
		@Mapping(source = "infoAboutYourWorkHistory.declareSelfEmployedForTax", target = "incomeTax"),
		@Mapping(source = "infoAboutYourWorkHistory.stillSelfEmployed", target = "selfEmployeStill"),
	})
	hello.form.InfoAboutYourWorkHistory.WorkHistMedicalConditions infoAboutYourWorkHistoryToWorkHistMedicalConditions(InfoAboutYourWorkHistory infoAboutYourWorkHistory);
	
	@Mappings({	
		@Mapping(source = "infoAboutYourWorkHistory.workedInAnotherCountry", target = "workedAnotherCountry"),
		@Mapping(source = "infoAboutYourWorkHistory.internationalWork", target = "countryLst")
	})
	hello.form.InfoAboutYourWorkHistory.WorkHistOtherCountries infoAboutYourWorkHistoryToWorkHistOtherCountries(InfoAboutYourWorkHistory infoAboutYourWorkHistory);

	@Mappings({	
		@Mapping(source = "infoAboutYourWorkHistory.otherJobs", target = "jobLst")		
	})
	hello.form.InfoAboutYourWorkHistory.WorkHistOtherJobs infoAboutYourWorkHistoryToWorkHistOtherJobs(InfoAboutYourWorkHistory infoAboutYourWorkHistory);
	
	@Mappings({			
		@Mapping(source = "name", target = "country"),		
		@Mapping(source = "sin", target = "identificationNumber"),		
		@Mapping(source = "livedInFrom", target = "livedFrom"	),
		@Mapping(source = "livedInTo", target = "livedTo"),	
		@Mapping(source = "workedInFrom", target = "workedFrom"),		
		@Mapping(source = "workedInTo", target = "workedTo"),		
		@Mapping(source = "receivedBenefits", target = "receivedBenefit"),
	})
	InternationalWork countrytoInternationalWork(Country country);
	
	@Mappings({				
		@Mapping(source = "internationalWork.country", target = "name"),		
		@Mapping(source = "internationalWork.identificationNumber", target = "sin"),		
		@Mapping(source = "internationalWork.livedFrom", target = "livedInFrom"	),
		@Mapping(source = "internationalWork.livedTo", target = "livedInTo"),	
		@Mapping(source = "internationalWork.workedFrom", target = "workedInFrom"),		
		@Mapping(source = "internationalWork.workedTo", target = "workedInTo"),		
		@Mapping(source = "internationalWork.receivedBenefit", target = "receivedBenefits"),
	})
	Country internationalWorktoCountry(InternationalWork internationalWork);
	
	@Mappings({			
		@Mapping(source = "job.address", target = "address"),		
		@Mapping(source = "job.daysPerWeek", target = "numberOfDaysPerWeek"),		
		@Mapping(source = "job.employerName", target = "companyName"	),
		@Mapping(source = "job.fromDate", target = "from"),	
		@Mapping(source = "job.hoursPerDay", target = "numberOfHoursPerDay"),		
		@Mapping(source = "job.titlePosition", target = "title"),		
		@Mapping(source = "job.toDate", target = "to"),
		@Mapping(source = "job.workType", target = "typeOfWork"),
		@Mapping(source = "job.duties", target = "duties"),
		@Mapping(source = "job.phone", target = "phone")
	})
	hello.service.dto.Job jobtoJob(Job job);

	@Mappings({			
		@Mapping(source = "job.address", target = "address"),		
		@Mapping(source = "job.numberOfDaysPerWeek", target = "daysPerWeek"),		
		@Mapping(source = "job.companyName", target = "employerName"),		
		@Mapping(source = "job.from", target = "fromDate"	),
		@Mapping(source = "job.numberOfHoursPerDay", target = "hoursPerDay"),	
		@Mapping(source = "job.title", target = "titlePosition"),		
		@Mapping(source = "job.to", target = "toDate"),		
		@Mapping(source = "job.typeOfWork", target = "workType"),
		@Mapping(source = "job.duties", target = "duties"),
		@Mapping(source = "job.phone", target = "phone")

	})
	Job jobtoJob(hello.service.dto.Job job);
}
