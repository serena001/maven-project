package hello.form.InfoAboutYourMedicalCondition;

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
public class FuncAssPhysical {
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
