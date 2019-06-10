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
public class InfoAboutYou implements Serializable{
	@Getter @Setter
	private Integer language;
	@Getter @Setter
	private Integer contactTime;
	@Getter @Setter
	private MaritalInfo maritalInfo;
	public Integer getLanguage() {
		return language;
	}
	public void setLanguage(Integer language) {
		this.language = language;
	}
	public Integer getContactTime() {
		return contactTime;
	}
	public void setContactTime(Integer contactTime) {
		this.contactTime = contactTime;
	}
	public MaritalInfo getMaritalInfo() {
		return maritalInfo;
	}
	public void setMaritalInfo(MaritalInfo maritalInfo) {
		this.maritalInfo = maritalInfo;
	}
}
