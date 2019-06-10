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
public class IdentityChildren {
	@Getter @Setter
	private List<Child>childLst;

	public List<Child> getChildLst() {
		return childLst;
	}

	public void setChildLst(List<Child> childLst) {
		this.childLst = childLst;
	}	
}
