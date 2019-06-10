package hello;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter @Setter
public class InfoAbout {
	Address2 address2;
	List<Job>jobLst;
	public Address2 getAddress2() {
		return address2;
	}
	public void setAddress2(Address2 address2) {
		this.address2 = address2;
	}
	public List<Job> getJobLst() {
		return jobLst;
	}
	public void setJobLst(List<Job> jobLst) {
		this.jobLst = jobLst;
	}

}
