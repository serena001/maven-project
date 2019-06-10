package hello.form.InfoAboutYourMedicalCondition;

import static lombok.AccessLevel.PRIVATE;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
public class InfoAboutYourMedicalCondition {
	MedCondCondition medCondCondition;
	MedCondHospitalisations  medicalConditionHospitalisations;
	MedCondMedications medicalConditionMedications;
	MedCondTreatments medicalConditionTreatments;
	MedCondTests medicalConditionTests;
	MedCondDSBBenefitSource medicalConditionDSBBenefitSource;
//	FuncAssPreamble 	funcAssPreamble;
	FuncAssPhysical funcAssPhysical;
	FuncAssBehavioursEmotional funcAssBehavioursEmotional;
	FuncAssCommunicationThinking funcAssCommunicationThinking;
	FuncAssOtherDaily funcAssOtherDaily;
	public MedCondCondition getMedCondCondition() {
		return medCondCondition;
	}
	public void setMedCondCondition(MedCondCondition medCondCondition) {
		this.medCondCondition = medCondCondition;
	}
	public MedCondHospitalisations getMedicalConditionHospitalisations() {
		return medicalConditionHospitalisations;
	}
	public void setMedicalConditionHospitalisations(MedCondHospitalisations medicalConditionHospitalisations) {
		this.medicalConditionHospitalisations = medicalConditionHospitalisations;
	}
	public MedCondMedications getMedicalConditionMedications() {
		return medicalConditionMedications;
	}
	public void setMedicalConditionMedications(MedCondMedications medicalConditionMedications) {
		this.medicalConditionMedications = medicalConditionMedications;
	}
	public MedCondTreatments getMedicalConditionTreatments() {
		return medicalConditionTreatments;
	}
	public void setMedicalConditionTreatments(MedCondTreatments medicalConditionTreatments) {
		this.medicalConditionTreatments = medicalConditionTreatments;
	}
	public MedCondTests getMedicalConditionTests() {
		return medicalConditionTests;
	}
	public void setMedicalConditionTests(MedCondTests medicalConditionTests) {
		this.medicalConditionTests = medicalConditionTests;
	}
	public MedCondDSBBenefitSource getMedicalConditionDSBBenefitSource() {
		return medicalConditionDSBBenefitSource;
	}
	public void setMedicalConditionDSBBenefitSource(MedCondDSBBenefitSource medicalConditionDSBBenefitSource) {
		this.medicalConditionDSBBenefitSource = medicalConditionDSBBenefitSource;
	}
	public FuncAssPhysical getFuncAssPhysical() {
		return funcAssPhysical;
	}
	public void setFuncAssPhysical(FuncAssPhysical funcAssPhysical) {
		this.funcAssPhysical = funcAssPhysical;
	}
	public FuncAssBehavioursEmotional getFuncAssBehavioursEmotional() {
		return funcAssBehavioursEmotional;
	}
	public void setFuncAssBehavioursEmotional(FuncAssBehavioursEmotional funcAssBehavioursEmotional) {
		this.funcAssBehavioursEmotional = funcAssBehavioursEmotional;
	}
	public FuncAssCommunicationThinking getFuncAssCommunicationThinking() {
		return funcAssCommunicationThinking;
	}
	public void setFuncAssCommunicationThinking(FuncAssCommunicationThinking funcAssCommunicationThinking) {
		this.funcAssCommunicationThinking = funcAssCommunicationThinking;
	}
	public FuncAssOtherDaily getFuncAssOtherDaily() {
		return funcAssOtherDaily;
	}
	public void setFuncAssOtherDaily(FuncAssOtherDaily funcAssOtherDaily) {
		this.funcAssOtherDaily = funcAssOtherDaily;
	}
}
