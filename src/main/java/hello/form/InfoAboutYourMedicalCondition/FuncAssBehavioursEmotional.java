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
public class FuncAssBehavioursEmotional {
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
}
