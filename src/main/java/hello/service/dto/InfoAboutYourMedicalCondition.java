package hello.service.dto;

import static lombok.AccessLevel.PRIVATE;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.mapstruct.Mapping;

import hello.form.Address;
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
public class InfoAboutYourMedicalCondition implements Serializable{

	@Getter @Setter
	private String insuranceCompanyName;
	@Getter @Setter
	private String claimNumber;
	@Getter @Setter
	private String medicalCondition;
	@Getter @Setter
	private LocalDate benefitStartDate;
	@Getter @Setter
	private Integer insuranceAuthorized ;

	@Getter @Setter
	private LocalDate cannotWorkDate;
//	@Getter @Setter
//	private String medicalCondition;
	@Getter @Setter
	private String medicalConditionAddit;
	@Getter @Setter
	private Integer hand;
	@Getter @Setter
	private String aids;

	@Getter @Setter
	private Integer receivingBenefits;
	@Getter @Setter
	private List<DisabilityBenefit>disabilityBenefitLst;

	@Getter @Setter
	private List<Hospital>hospitalLst;

	@Getter @Setter
	private List<Medication>medicationLst;

	@Getter @Setter
	private List<Test>testLst;

	@Getter @Setter
	private List<Treatment> treatmentLst;

	@Getter @Setter
	private Integer behavEmotionProblems;
	@Getter @Setter
	private Integer bpQ1;
	@Getter @Setter
	private Integer bpQ2;
	@Getter @Setter
	private Integer bpQ3;
	@Getter @Setter
	private Integer bpQ4;
	@Getter @Setter
	private Integer bpQ5;
	@Getter @Setter
	private Integer bpQ6;
	@Getter @Setter
	private Integer bpQ7;
	@Getter @Setter
	private Integer bpQ8;
	@Getter @Setter
	private Integer bpQ9;	
	@Getter @Setter
	private Integer bpQ11;
	@Getter @Setter
	private Integer bpQ12;
	@Getter @Setter
	private String additionalInformationBehavEmotion;
	
	@Getter @Setter
	private Integer communThinkingProblems;
	@Getter @Setter
	private Integer ctpQ1;
	@Getter @Setter
	private Integer ctpQ2;
	@Getter @Setter
	private Integer ctpQ3;
	@Getter @Setter
	private Integer ctpQ4;
	@Getter @Setter
	private Integer ctpQ5;
	@Getter @Setter
	private Integer ctpQ6;
	@Getter @Setter
	private Integer ctpQ7;
	@Getter @Setter
	private Integer ctpQ8;
	@Getter @Setter
	private Integer ctpQ9;	
	@Getter @Setter
	private Integer ctpQ10;
	@Getter @Setter
	private Integer ctpQ11;
	@Getter @Setter
	private Integer ctpQ12;
	@Getter @Setter
	private Integer ctpQ13;
	@Getter @Setter
	private String additionalInformationCommunThinking;
	
	@Getter @Setter
	private Integer dailyActivitiesProblems;
	@Getter @Setter
	private Integer dapQ1;
	@Getter @Setter
	private Integer dapQ2;
	@Getter @Setter
	private Integer dapQ3;
	@Getter @Setter
	private Integer dapQ4;
	@Getter @Setter
	private Integer dapQ5;
	@Getter @Setter
	private Integer dapQ6;
	@Getter @Setter
	private Integer dapQ7;
	@Getter @Setter
	private Integer dapQ8;
	@Getter @Setter
	private Integer dapQ9;	
	@Getter @Setter
	private Integer dapQ10;
	@Getter @Setter
	private String additionalInformationDailyActivities;
	
	@Getter @Setter
	private Integer physicalProblems;
	@Getter @Setter
	private Integer Q1;
	@Getter @Setter
	private Integer Q2;
	@Getter @Setter
	private Integer Q3;
	@Getter @Setter
	private Integer Q4;
	@Getter @Setter
	private Integer Q5;
	@Getter @Setter
	private Integer Q6;
	@Getter @Setter
	private Integer Q7;
	@Getter @Setter
	private Integer Q8;
	@Getter @Setter
	private Integer Q9;	
	@Getter @Setter
	private Integer Q11;
	@Getter @Setter
	private Integer Q12;
	@Getter @Setter
	private Integer Q13;
	@Getter @Setter
	private Integer Q14;
	@Getter @Setter
	private Integer Q15;
	@Getter @Setter
	private Integer Q16;
	@Getter @Setter
	private String additionalInformationPhysicalProblems;
	public String getInsuranceCompanyName() {
		return insuranceCompanyName;
	}
	public void setInsuranceCompanyName(String insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}
	public String getClaimNumber() {
		return claimNumber;
	}
	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}
	public LocalDate getBenefitStartDate() {
		return benefitStartDate;
	}
	public void setBenefitStartDate(LocalDate benefitStartDate) {
		this.benefitStartDate = benefitStartDate;
	}
	public Integer getInsuranceAuthorized() {
		return insuranceAuthorized;
	}
	public void setInsuranceAuthorized(Integer insuranceAuthorized) {
		this.insuranceAuthorized = insuranceAuthorized;
	}
	public LocalDate getCannotWorkDate() {
		return cannotWorkDate;
	}
	public void setCannotWorkDate(LocalDate cannotWorkDate) {
		this.cannotWorkDate = cannotWorkDate;
	}
	public String getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	public String getMedicalConditionAddit() {
		return medicalConditionAddit;
	}
	public void setMedicalConditionAddit(String medicalConditionAddit) {
		this.medicalConditionAddit = medicalConditionAddit;
	}
	public Integer getHand() {
		return hand;
	}
	public void setHand(Integer hand) {
		this.hand = hand;
	}
	public String getAids() {
		return aids;
	}
	public void setAids(String aids) {
		this.aids = aids;
	}
	public Integer getReceivingBenefits() {
		return receivingBenefits;
	}
	public void setReceivingBenefits(Integer receivingBenefits) {
		this.receivingBenefits = receivingBenefits;
	}
	public List<DisabilityBenefit> getDisabilityBenefitLst() {
		return disabilityBenefitLst;
	}
	public void setDisabilityBenefitLst(List<DisabilityBenefit> disabilityBenefitLst) {
		this.disabilityBenefitLst = disabilityBenefitLst;
	}
	public List<Hospital> getHospitalLst() {
		return hospitalLst;
	}
	public void setHospitalLst(List<Hospital> hospitalLst) {
		this.hospitalLst = hospitalLst;
	}
	public List<Medication> getMedicationLst() {
		return medicationLst;
	}
	public void setMedicationLst(List<Medication> medicationLst) {
		this.medicationLst = medicationLst;
	}
	public List<Test> getTestLst() {
		return testLst;
	}
	public void setTestLst(List<Test> testLst) {
		this.testLst = testLst;
	}
	public List<Treatment> getTreatmentLst() {
		return treatmentLst;
	}
	public void setTreatmentLst(List<Treatment> treatmentLst) {
		this.treatmentLst = treatmentLst;
	}
	public Integer getBehavEmotionProblems() {
		return behavEmotionProblems;
	}
	public void setBehavEmotionProblems(Integer behavEmotionProblems) {
		this.behavEmotionProblems = behavEmotionProblems;
	}
	public Integer getBpQ1() {
		return bpQ1;
	}
	public void setBpQ1(Integer bpQ1) {
		this.bpQ1 = bpQ1;
	}
	public Integer getBpQ2() {
		return bpQ2;
	}
	public void setBpQ2(Integer bpQ2) {
		this.bpQ2 = bpQ2;
	}
	public Integer getBpQ3() {
		return bpQ3;
	}
	public void setBpQ3(Integer bpQ3) {
		this.bpQ3 = bpQ3;
	}
	public Integer getBpQ4() {
		return bpQ4;
	}
	public void setBpQ4(Integer bpQ4) {
		this.bpQ4 = bpQ4;
	}
	public Integer getBpQ5() {
		return bpQ5;
	}
	public void setBpQ5(Integer bpQ5) {
		this.bpQ5 = bpQ5;
	}
	public Integer getBpQ6() {
		return bpQ6;
	}
	public void setBpQ6(Integer bpQ6) {
		this.bpQ6 = bpQ6;
	}
	public Integer getBpQ7() {
		return bpQ7;
	}
	public void setBpQ7(Integer bpQ7) {
		this.bpQ7 = bpQ7;
	}
	public Integer getBpQ8() {
		return bpQ8;
	}
	public void setBpQ8(Integer bpQ8) {
		this.bpQ8 = bpQ8;
	}
	public Integer getBpQ9() {
		return bpQ9;
	}
	public void setBpQ9(Integer bpQ9) {
		this.bpQ9 = bpQ9;
	}
	public Integer getBpQ11() {
		return bpQ11;
	}
	public void setBpQ11(Integer bpQ11) {
		this.bpQ11 = bpQ11;
	}
	public Integer getBpQ12() {
		return bpQ12;
	}
	public void setBpQ12(Integer bpQ12) {
		this.bpQ12 = bpQ12;
	}
	public String getAdditionalInformationBehavEmotion() {
		return additionalInformationBehavEmotion;
	}
	public void setAdditionalInformationBehavEmotion(String additionalInformationBehavEmotion) {
		this.additionalInformationBehavEmotion = additionalInformationBehavEmotion;
	}
	public Integer getCommunThinkingProblems() {
		return communThinkingProblems;
	}
	public void setCommunThinkingProblems(Integer communThinkingProblems) {
		this.communThinkingProblems = communThinkingProblems;
	}
	public Integer getCtpQ1() {
		return ctpQ1;
	}
	public void setCtpQ1(Integer ctpQ1) {
		this.ctpQ1 = ctpQ1;
	}
	public Integer getCtpQ2() {
		return ctpQ2;
	}
	public void setCtpQ2(Integer ctpQ2) {
		this.ctpQ2 = ctpQ2;
	}
	public Integer getCtpQ3() {
		return ctpQ3;
	}
	public void setCtpQ3(Integer ctpQ3) {
		this.ctpQ3 = ctpQ3;
	}
	public Integer getCtpQ4() {
		return ctpQ4;
	}
	public void setCtpQ4(Integer ctpQ4) {
		this.ctpQ4 = ctpQ4;
	}
	public Integer getCtpQ5() {
		return ctpQ5;
	}
	public void setCtpQ5(Integer ctpQ5) {
		this.ctpQ5 = ctpQ5;
	}
	public Integer getCtpQ6() {
		return ctpQ6;
	}
	public void setCtpQ6(Integer ctpQ6) {
		this.ctpQ6 = ctpQ6;
	}
	public Integer getCtpQ7() {
		return ctpQ7;
	}
	public void setCtpQ7(Integer ctpQ7) {
		this.ctpQ7 = ctpQ7;
	}
	public Integer getCtpQ8() {
		return ctpQ8;
	}
	public void setCtpQ8(Integer ctpQ8) {
		this.ctpQ8 = ctpQ8;
	}
	public Integer getCtpQ9() {
		return ctpQ9;
	}
	public void setCtpQ9(Integer ctpQ9) {
		this.ctpQ9 = ctpQ9;
	}
	public Integer getCtpQ10() {
		return ctpQ10;
	}
	public void setCtpQ10(Integer ctpQ10) {
		this.ctpQ10 = ctpQ10;
	}
	public Integer getCtpQ11() {
		return ctpQ11;
	}
	public void setCtpQ11(Integer ctpQ11) {
		this.ctpQ11 = ctpQ11;
	}
	public Integer getCtpQ12() {
		return ctpQ12;
	}
	public void setCtpQ12(Integer ctpQ12) {
		this.ctpQ12 = ctpQ12;
	}
	public Integer getCtpQ13() {
		return ctpQ13;
	}
	public void setCtpQ13(Integer ctpQ13) {
		this.ctpQ13 = ctpQ13;
	}
	public String getAdditionalInformationCommunThinking() {
		return additionalInformationCommunThinking;
	}
	public void setAdditionalInformationCommunThinking(String additionalInformationCommunThinking) {
		this.additionalInformationCommunThinking = additionalInformationCommunThinking;
	}
	public Integer getDailyActivitiesProblems() {
		return dailyActivitiesProblems;
	}
	public void setDailyActivitiesProblems(Integer dailyActivitiesProblems) {
		this.dailyActivitiesProblems = dailyActivitiesProblems;
	}
	public Integer getDapQ1() {
		return dapQ1;
	}
	public void setDapQ1(Integer dapQ1) {
		this.dapQ1 = dapQ1;
	}
	public Integer getDapQ2() {
		return dapQ2;
	}
	public void setDapQ2(Integer dapQ2) {
		this.dapQ2 = dapQ2;
	}
	public Integer getDapQ3() {
		return dapQ3;
	}
	public void setDapQ3(Integer dapQ3) {
		this.dapQ3 = dapQ3;
	}
	public Integer getDapQ4() {
		return dapQ4;
	}
	public void setDapQ4(Integer dapQ4) {
		this.dapQ4 = dapQ4;
	}
	public Integer getDapQ5() {
		return dapQ5;
	}
	public void setDapQ5(Integer dapQ5) {
		this.dapQ5 = dapQ5;
	}
	public Integer getDapQ6() {
		return dapQ6;
	}
	public void setDapQ6(Integer dapQ6) {
		this.dapQ6 = dapQ6;
	}
	public Integer getDapQ7() {
		return dapQ7;
	}
	public void setDapQ7(Integer dapQ7) {
		this.dapQ7 = dapQ7;
	}
	public Integer getDapQ8() {
		return dapQ8;
	}
	public void setDapQ8(Integer dapQ8) {
		this.dapQ8 = dapQ8;
	}
	public Integer getDapQ9() {
		return dapQ9;
	}
	public void setDapQ9(Integer dapQ9) {
		this.dapQ9 = dapQ9;
	}
	public Integer getDapQ10() {
		return dapQ10;
	}
	public void setDapQ10(Integer dapQ10) {
		this.dapQ10 = dapQ10;
	}
	public String getAdditionalInformationDailyActivities() {
		return additionalInformationDailyActivities;
	}
	public void setAdditionalInformationDailyActivities(String additionalInformationDailyActivities) {
		this.additionalInformationDailyActivities = additionalInformationDailyActivities;
	}
	public Integer getPhysicalProblems() {
		return physicalProblems;
	}
	public void setPhysicalProblems(Integer physicalProblems) {
		this.physicalProblems = physicalProblems;
	}
	public Integer getQ1() {
		return Q1;
	}
	public void setQ1(Integer q1) {
		Q1 = q1;
	}
	public Integer getQ2() {
		return Q2;
	}
	public void setQ2(Integer q2) {
		Q2 = q2;
	}
	public Integer getQ3() {
		return Q3;
	}
	public void setQ3(Integer q3) {
		Q3 = q3;
	}
	public Integer getQ4() {
		return Q4;
	}
	public void setQ4(Integer q4) {
		Q4 = q4;
	}
	public Integer getQ5() {
		return Q5;
	}
	public void setQ5(Integer q5) {
		Q5 = q5;
	}
	public Integer getQ6() {
		return Q6;
	}
	public void setQ6(Integer q6) {
		Q6 = q6;
	}
	public Integer getQ7() {
		return Q7;
	}
	public void setQ7(Integer q7) {
		Q7 = q7;
	}
	public Integer getQ8() {
		return Q8;
	}
	public void setQ8(Integer q8) {
		Q8 = q8;
	}
	public Integer getQ9() {
		return Q9;
	}
	public void setQ9(Integer q9) {
		Q9 = q9;
	}
	public Integer getQ11() {
		return Q11;
	}
	public void setQ11(Integer q11) {
		Q11 = q11;
	}
	public Integer getQ12() {
		return Q12;
	}
	public void setQ12(Integer q12) {
		Q12 = q12;
	}
	public Integer getQ13() {
		return Q13;
	}
	public void setQ13(Integer q13) {
		Q13 = q13;
	}
	public Integer getQ14() {
		return Q14;
	}
	public void setQ14(Integer q14) {
		Q14 = q14;
	}
	public Integer getQ15() {
		return Q15;
	}
	public void setQ15(Integer q15) {
		Q15 = q15;
	}
	public Integer getQ16() {
		return Q16;
	}
	public void setQ16(Integer q16) {
		Q16 = q16;
	}
	public String getAdditionalInformationPhysicalProblems() {
		return additionalInformationPhysicalProblems;
	}
	public void setAdditionalInformationPhysicalProblems(String additionalInformationPhysicalProblems) {
		this.additionalInformationPhysicalProblems = additionalInformationPhysicalProblems;
	}
}
