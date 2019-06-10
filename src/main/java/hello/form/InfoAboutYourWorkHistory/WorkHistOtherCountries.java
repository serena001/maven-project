package hello.form.InfoAboutYourWorkHistory;

import static lombok.AccessLevel.PRIVATE;

import java.util.List;

import hello.form.Country;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor(access=PRIVATE)
@Getter @Setter
public class WorkHistOtherCountries {
	@Getter @Setter
	private Integer workedAnotherCountry;
	@Getter @Setter
	private List<Country>countryLst;
	public Integer getWorkedAnotherCountry() {
		return workedAnotherCountry;
	}
	public void setWorkedAnotherCountry(Integer workedAnotherCountry) {
		this.workedAnotherCountry = workedAnotherCountry;
	}
	public List<Country> getCountryLst() {
		return countryLst;
	}
	public void setCountryLst(List<Country> countryLst) {
		this.countryLst = countryLst;
	}
}
