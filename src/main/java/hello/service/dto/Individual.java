package hello.service.dto;

import static lombok.AccessLevel.PRIVATE;

import java.io.Serializable;

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
public class Individual implements Serializable{
	@Getter @Setter
	private Long individualId;
	@Getter @Setter
	private Long directDepositId;
	@Getter @Setter
	private Long phoneId;
	@Getter @Setter
	private Long homeAddressId;
	@Getter @Setter
	private String name;
}
