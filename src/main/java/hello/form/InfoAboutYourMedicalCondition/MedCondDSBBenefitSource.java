package hello.form.InfoAboutYourMedicalCondition;

import static lombok.AccessLevel.PRIVATE;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor(access=PRIVATE)
@Getter @Setter
public class MedCondDSBBenefitSource {
	@Getter @Setter
	private Integer receivingBenefits;
	@Getter @Setter
	private List<DisabilityBenefit>disabilityBenefitLst;
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
}
