package hello;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter @Setter
public class InfoAboutForm {
	Address address;
	List<Job>jobLst;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Job> getJobLst() {
		return jobLst;
	}
	public void setJobLst(List<Job> jobLst) {
		this.jobLst = jobLst;
	}
	

}
