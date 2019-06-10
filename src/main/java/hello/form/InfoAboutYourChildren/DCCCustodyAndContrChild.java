package hello.form.InfoAboutYourChildren;

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
public class DCCCustodyAndContrChild {
	@Getter @Setter
	private List<ChildDOBName>under18childDOBLst;
	@Getter @Setter
	private List<ChildDOBName>child18to25DOBLst;
	public List<ChildDOBName> getUnder18childDOBLst() {
		return under18childDOBLst;
	}
	public void setUnder18childDOBLst(List<ChildDOBName> under18childDOBLst) {
		this.under18childDOBLst = under18childDOBLst;
	}
	public List<ChildDOBName> getChild18to25DOBLst() {
		return child18to25DOBLst;
	}
	public void setChild18to25DOBLst(List<ChildDOBName> child18to25dobLst) {
		child18to25DOBLst = child18to25dobLst;
	}
}
