package hello.form;

import static lombok.AccessLevel.PRIVATE;

import hello.form.Consent.Consent;
import hello.form.InfoAboutYou.InfoAboutYou;
import hello.form.InfoAboutYourChildren.InfoAboutYourChildren;
import hello.form.InfoAboutYourEducation.InfoAboutYourEducation;
import hello.form.InfoAboutYourHealthCareProvider.InfoAboutYourHealthCareProvider;
import hello.form.InfoAboutYourMedicalCondition.InfoAboutYourMedicalCondition;
import hello.form.InfoAboutYourWorkHistory.InfoAboutYourWorkHistory;
import hello.form.TerminalIllness.TerminalIllness;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Builder
@NoArgsConstructor
@AllArgsConstructor(access=PRIVATE)
@Getter @Setter
public class ApplicationForm {
	TerminalIllness terminalIllness;
	InfoAboutYou infoAboutYou;
	InfoAboutYourChildren infoAboutYourChildren;
	InfoAboutYourEducation infoAboutYourEducation;
	InfoAboutYourHealthCareProvider infoAboutYourHealthCareProvider;
	InfoAboutYourMedicalCondition infoAboutYourMedicalCondition;
	InfoAboutYourWorkHistory infoAboutYourWorkHistory;
	Consent consent;
}
