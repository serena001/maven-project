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
public class CppdApplication implements Serializable{
	@Getter @Setter
	private Long individualId;
	@Getter @Setter
	private Long directDepositId;
	@Getter @Setter
	private Long phoneId;
	@Getter @Setter
	private Long homeAddressId;
	@Getter @Setter
	private Integer formCd;
	@Getter @Setter
	private Integer ApplicationStatus;
	@Getter @Setter
	private InfoAboutYou infoAboutYou;
	@Getter @Setter
	private InfoAboutYourWorkHistory infoAboutYourWorkHistory;
	@Getter @Setter
	private InfoAboutYourChildren infoAboutYourChildren;
}
