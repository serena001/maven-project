package hello.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import hello.form.InfoAboutYourMedicalCondition.DisabilityBenefit;
import hello.form.InfoAboutYourMedicalCondition.FuncAssBehavioursEmotional;
import hello.form.InfoAboutYourMedicalCondition.FuncAssCommunicationThinking;
import hello.form.InfoAboutYourMedicalCondition.FuncAssOtherDaily;
import hello.form.InfoAboutYourMedicalCondition.FuncAssPhysical;
import hello.form.InfoAboutYourMedicalCondition.MedCondCondition;
import hello.form.InfoAboutYourMedicalCondition.MedCondDSBBenefitSource;
import hello.form.InfoAboutYourMedicalCondition.MedCondHospitalisations;
import hello.form.InfoAboutYourMedicalCondition.MedCondMedications;
import hello.form.InfoAboutYourMedicalCondition.MedCondTests;
import hello.form.InfoAboutYourMedicalCondition.MedCondTreatments;
import hello.form.InfoAboutYourWorkHistory.WorkHistCurrentLastEmployer;
import hello.form.InfoAboutYourWorkHistory.WorkHistMedicalConditions;
import hello.form.InfoAboutYourWorkHistory.WorkHistOtherCountries;
import hello.form.InfoAboutYourWorkHistory.WorkHistOtherJobs;
import hello.service.dto.InfoAboutYourMedicalCondition;
import hello.service.dto.InfoAboutYourWorkHistory;
@Mapper
public interface InfoAboutYourMedicalConditionMapper {
	@Mappings({	
		@Mapping(target = "hospitalLst", source = "medCondHospitalisations.hospitalLst"),	
		@Mapping(target = "medicationLst", source = "medCondMedications.medicationLst"),	
		@Mapping(target = "testLst", source = "medCondTests.testLst"),	 
		@Mapping(target = "treatmentLst", source = "medCondTreatments.treatmentLst"),						
		@Mapping(target = "aids", source = "medCondCondition.aids"),	
		@Mapping(target = "cannotWorkDate", source = "medCondCondition.cannotWorkDate"),	
		@Mapping(target = "hand", source = "medCondCondition.hand"),	
		@Mapping(target = "disabilityBenefitLst", source = "medCondDSBBenefitSource.disabilityBenefitLst"),	
		@Mapping(target = "receivingBenefits", source = "medCondDSBBenefitSource.receivingBenefits"),	
		@Mapping(target = "medicalCondition", source = "medCondCondition.medicalCondition"),	
		@Mapping(target = "medicalConditionAddit", source = "medCondCondition.medicalConditionAddit"),	
		@Mapping(target = "benefitStartDate", source = "disabilityBenefit.benefitStartDate"),	
		@Mapping(target = "claimNumber", source = "disabilityBenefit.claimNumber"),	
		@Mapping(target = "insuranceAuthorized", source = "disabilityBenefit.insuranceAuthorized"),	
		@Mapping(target = "insuranceCompanyName", source = "disabilityBenefit.insuranceCompanyName"),	
//		@Mapping(target = "medicalCondition", source = "disabilityBenefit.medicalCondition"),	
		@Mapping(target = "additionalInformationBehavEmotion", source = "funcAssBehavioursEmotional.additionalInformationBehavEmotion"),	
		@Mapping(target = "behavEmotionProblems", source = "funcAssBehavioursEmotional.behavEmotionProblems"),	
		@Mapping(target = "bpQ1", source = "funcAssBehavioursEmotional.bpQ1"),	
		@Mapping(target = "bpQ11", source = "funcAssBehavioursEmotional.bpQ11"),	
		@Mapping(target = "bpQ12", source = "funcAssBehavioursEmotional.bpQ12"),	
		@Mapping(target = "bpQ2", source = "funcAssBehavioursEmotional.bpQ2"),	
		@Mapping(target = "bpQ3", source = "funcAssBehavioursEmotional.bpQ3"),	
		@Mapping(target = "bpQ4", source = "funcAssBehavioursEmotional.bpQ4"),	
		@Mapping(target = "bpQ5", source = "funcAssBehavioursEmotional.bpQ5"),	
		@Mapping(target = "bpQ6", source = "funcAssBehavioursEmotional.bpQ6"),	
		@Mapping(target = "bpQ7", source = "funcAssBehavioursEmotional.bpQ7"),	
		@Mapping(target = "bpQ8", source = "funcAssBehavioursEmotional.bpQ8"),	
		@Mapping(target = "bpQ9", source = "funcAssBehavioursEmotional.bpQ9"),	
		@Mapping(target = "additionalInformationCommunThinking", source = "funcAssCommunicationThinking.additionalInformationCommunThinking"),	
		@Mapping(target = "communThinkingProblems", source = "funcAssCommunicationThinking.communThinkingProblems"),	
		@Mapping(target = "ctpQ1", source = "funcAssCommunicationThinking.ctpQ1"),	
		@Mapping(target = "ctpQ10", source = "funcAssCommunicationThinking.ctpQ10"),	
		@Mapping(target = "ctpQ11", source = "funcAssCommunicationThinking.ctpQ11"),	
		@Mapping(target = "ctpQ12", source = "funcAssCommunicationThinking.ctpQ12"),	
		@Mapping(target = "ctpQ13", source = "funcAssCommunicationThinking.ctpQ13"),	
		@Mapping(target = "ctpQ2", source = "funcAssCommunicationThinking.ctpQ2"),	
		@Mapping(target = "ctpQ3", source = "funcAssCommunicationThinking.ctpQ3"),	
		@Mapping(target = "ctpQ4", source = "funcAssCommunicationThinking.ctpQ4"),	
		@Mapping(target = "ctpQ5", source = "funcAssCommunicationThinking.ctpQ5"),	
		@Mapping(target = "ctpQ6", source = "funcAssCommunicationThinking.ctpQ6"),	
		@Mapping(target = "ctpQ7", source = "funcAssCommunicationThinking.ctpQ7"),	
		@Mapping(target = "ctpQ8", source = "funcAssCommunicationThinking.ctpQ8"),	
		@Mapping(target = "ctpQ9", source = "funcAssCommunicationThinking.ctpQ9"),	
		@Mapping(target = "additionalInformationDailyActivities", source = "funcAssOtherDaily.additionalInformationDailyActivities"),	
		@Mapping(target = "dailyActivitiesProblems", source = "funcAssOtherDaily.dailyActivitiesProblems"),	
		@Mapping(target = "dapQ1", source = "funcAssOtherDaily.dapQ1"),	
		@Mapping(target = "dapQ10", source = "funcAssOtherDaily.dapQ10"),	
		@Mapping(target = "dapQ2", source = "funcAssOtherDaily.dapQ2"),	
		@Mapping(target = "dapQ3", source = "funcAssOtherDaily.dapQ3"),	
		@Mapping(target = "dapQ4", source = "funcAssOtherDaily.dapQ4"),	
		@Mapping(target = "dapQ5", source = "funcAssOtherDaily.dapQ5"),	
		@Mapping(target = "dapQ6", source = "funcAssOtherDaily.dapQ6"),	
		@Mapping(target = "dapQ7", source = "funcAssOtherDaily.dapQ7"),	
		@Mapping(target = "dapQ8", source = "funcAssOtherDaily.dapQ8"),	
		@Mapping(target = "dapQ9", source = "funcAssOtherDaily.dapQ9"),	
		@Mapping(target = "additionalInformationPhysicalProblems", source = "funcAssPhysical.additionalInformationPhysicalProblems"),	
		@Mapping(target = "physicalProblems", source = "funcAssPhysical.physicalProblems"),	
		@Mapping(target = "q1", source = "funcAssPhysical.q1"),	
		@Mapping(target = "q11", source = "funcAssPhysical.q11"),	
		@Mapping(target = "q12", source = "funcAssPhysical.q12"),	
		@Mapping(target = "q13", source = "funcAssPhysical.q13"),	
		@Mapping(target = "q14", source = "funcAssPhysical.q14"),	
		@Mapping(target = "q15", source = "funcAssPhysical.q15"),	
		@Mapping(target = "q16", source = "funcAssPhysical.q16"),	
		@Mapping(target = "q2", source = "funcAssPhysical.q2"),	
		@Mapping(target = "q3", source = "funcAssPhysical.q3"),	
		@Mapping(target = "q4", source = "funcAssPhysical.q4"),	
		@Mapping(target = "q5", source = "funcAssPhysical.q5"),	
		@Mapping(target = "q6", source = "funcAssPhysical.q6"),	
		@Mapping(target = "q7", source = "funcAssPhysical.q7"),	
		@Mapping(target = "q8", source = "funcAssPhysical.q8"),	
		@Mapping(target = "q9", source = "funcAssPhysical.q9"),	
	})
    InfoAboutYourMedicalCondition infoAboutYourMedicalConditionToInfoAboutYourMedicalCondition(
    		MedCondHospitalisations medCondHospitalisations,
    		MedCondMedications medCondMedications,
    		MedCondTests medCondTests,
    		MedCondTreatments medCondTreatments,
    		MedCondCondition medCondCondition,
    		MedCondDSBBenefitSource medCondDSBBenefitSource,
    		DisabilityBenefit disabilityBenefit,
    		FuncAssBehavioursEmotional funcAssBehavioursEmotional,
    		FuncAssCommunicationThinking funcAssCommunicationThinking,
    		FuncAssOtherDaily funcAssOtherDaily,
    		FuncAssPhysical funcAssPhysical
    		);

}
