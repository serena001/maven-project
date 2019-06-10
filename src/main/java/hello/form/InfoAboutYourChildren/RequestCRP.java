package hello.form.InfoAboutYourChildren;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import static lombok.AccessLevel.PRIVATE;

@Builder
@NoArgsConstructor
@AllArgsConstructor(access=PRIVATE)
@Getter @Setter
public class RequestCRP {
	@Getter @Setter
	private Integer requestCRP;

	public Integer getRequestCRP() {
		return requestCRP;
	}

	public void setRequestCRP(Integer requestCRP) {
		this.requestCRP = requestCRP;
	}
}
