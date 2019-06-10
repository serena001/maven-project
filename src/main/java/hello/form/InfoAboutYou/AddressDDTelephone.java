package hello.form.InfoAboutYou;

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
public class AddressDDTelephone {
	@Getter @Setter
	private Integer language;
	@Getter @Setter
	private Integer time;
}
