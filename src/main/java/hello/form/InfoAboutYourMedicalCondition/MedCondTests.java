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
public class MedCondTests {
	@Getter @Setter
	private List<Test>testLst;

	public List<Test> getTestLst() {
		return testLst;
	}

	public void setTestLst(List<Test> testLst) {
		this.testLst = testLst;
	}
}
