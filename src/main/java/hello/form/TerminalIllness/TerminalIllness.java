package hello.form.TerminalIllness;

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
public class TerminalIllness {
	@Getter @Setter 
	private List<String>illnessLst;
	@Getter @Setter
	private String hasTerminalIllness;
}
