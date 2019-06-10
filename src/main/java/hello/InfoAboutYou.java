package hello;

import java.util.List;

public class InfoAboutYou {
	Address address;
	List<Job> jobLst;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
}
