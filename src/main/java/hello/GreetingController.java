package hello;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import hello.form.InfoAboutYourWorkHistory.WorkHistCurrentLastEmployer;
import hello.form.InfoAboutYourWorkHistory.WorkHistMedicalConditions;
import hello.form.InfoAboutYourWorkHistory.WorkHistOtherCountries;
import hello.form.InfoAboutYourWorkHistory.WorkHistOtherJobs;
import hello.mapper.InfoAboutYouMapper;
import hello.mapper.InfoAboutYourChildrenMapper;
import hello.mapper.InfoAboutYourWorkHistoryMapper;
import hello.form.Job;
import hello.form.InfoAboutYou.CommunicationPreferences;
import hello.form.InfoAboutYou.MaritalStatusChildren;
import hello.form.InfoAboutYourChildren.CRPInformation;
import hello.form.InfoAboutYourChildren.Child;
import hello.form.InfoAboutYourChildren.ChildDOBName;
import hello.form.InfoAboutYourChildren.ConsentToContactCustChild;
import hello.form.InfoAboutYourChildren.DCCCustodyAndContrChild;
import hello.form.InfoAboutYourChildren.IdentityChildren;
import hello.form.InfoAboutYourChildren.RequestCRP;
import hello.form.Address;
import hello.form.Country;
import hello.service.dto.InfoAboutYourChildren;
import hello.service.dto.InfoAboutYourWorkHistory;


@Controller

public class GreetingController {
	 private DestSourceMapper mapper= Mappers.getMapper(DestSourceMapper.class);
	 private JobMapper mapperJob = Mappers.getMapper(JobMapper.class);
	 private InfoAboutMapper mapperInfoAbout = Mappers.getMapper(InfoAboutMapper.class);
	 private InfoAboutMapper2 mapperInfoAbout2 = Mappers.getMapper(InfoAboutMapper2.class);
	 private InfoAboutYourWorkHistoryMapper infoAboutYourWorkHistoryMapper = Mappers.getMapper(InfoAboutYourWorkHistoryMapper.class);
	 private InfoAboutYourChildrenMapper infoAboutYourChildrenMapper = Mappers.getMapper(InfoAboutYourChildrenMapper.class);
	 private InfoAboutYouMapper infoAboutYouMapper = Mappers.getMapper(InfoAboutYouMapper.class);

	@Autowired
	UserHelper userHelper;
	
	@Autowired
	Employee employee;
	
	 @Value("${test.something.trying}")
     String testing;
	 
	 @GetMapping("/greeting")
	 public String greetings()
	 {
		 return "greeting3";
	 }
	 
    @GetMapping("/greeting1")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model, HttpSession session,HttpServletRequest request,/**@ModelAttribute("employee")Employee employee**/
    		@ModelAttribute("formBean")FormControllerBean formControllerBean) {
    	session.setAttribute("something", "blah");
    	request.setAttribute("work", "ha");
    	//This was used to test session values
    	request.getSession().setAttribute("work1", "ha1");
    	request.getSession().setAttribute("work2", "ha2");
    	//This was used to test retrieving a saved object from from the session whereby the value was saved in the interceptor
    	System.out.println("laughinh"+request.getSession().getAttribute("clientObject"));
    	//This was used to test for profile (dev) specifically the application-dev yml file
    	System.out.println("testing" + testing);
    	//This was used to test the profile (dev) specifically the class UserHelper file
    System.out.println(userHelper.getText());
    
    //WORKING FOR DROP DOWN LIST SINGLE --This is for the select list and to have a default option selected
    HashMap<String,String> listNames = new HashMap<String,String>();  
    listNames.put("1", "lala");
    listNames.put("2", "blah");
    listNames.put("3", "buttt");
    listNames.put("4", "buttt11");
    employee.setName("lucas");
    model.addAttribute("listNames", listNames);
//    model.addAttribute("name", name);
    model.addAttribute("selectedValue", "2");
 //   model.addAttribute("employee", employee);
    //WORKING FOR SINGLE EMPLOYEE
    formControllerBean.setEmployee(employee);
    
    //WORKING FOR LIST OF EMPLOYEES
    List<Employee> employeeList=new ArrayList<Employee>();
    employeeList.add(employee);
    employeeList.add(employee);
   formControllerBean.setEmployeeLst(employeeList);
  //  model.addAttribute("employeeLst", formControllerBean.getEmployeeLst());
    model.addAttribute("formBean", formControllerBean);
    //Use to test the cache
    userHelper.setText("moonraker");
	System.out.println("lllllllllllllllllll");
     return "greeting2";
    }
    
//    @GetMapping("/greeting")
//    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model, HttpSession session,HttpServletRequest request
//    		, @ModelAttribute("form")FormControllerBean formControllerBean) {
//    	System.out.println("lllllllllllllllllll");
//    	employee.setSelectBoxTest("");
//    	formControllerBean.employeeLst.add(employee);
//    model.addAttribute("employeeLst", formControllerBean.employeeLst);
//     return "greeting2";
//    }
    @GetMapping("/greeting3")
    public void handlerRequest(/**@ModelAttribute("employee")Employee employee,**/@ModelAttribute("formBean")FormControllerBean formControllerBean){
//    	InfoAboutYourWorkHistory infoAboutYourWorkHistory = new InfoAboutYourWorkHistory();
//    	infoAboutYourWorkHistory.setCurrentJob(currentJob);
//    	infoAboutYourWorkHistory.setDeclareSelfEmployedForTax(declareSelfEmployedForTax);
//    	infoAboutYourWorkHistory.setDetailsYouStoppedWork(detailsYouStoppedWork);
//    	infoAboutYourWorkHistory.setDidDifferentTypeOfWork(didDifferentTypeOfWork);
//    	infoAboutYourWorkHistory.setInternationalWork(internationalWork);
//    	infoAboutYourWorkHistory.setOtherJobs(otherJobs);
//    	infoAboutYourWorkHistory.setReasonYouStoppedWork(reasonYouStoppedWork);
//    	infoAboutYourWorkHistory.setReceivedEmploymentInsurance(receivedEmploymentInsurance);
//    	infoAboutYourWorkHistory.setReceivedEmploymentInsuranceFrom(receivedEmploymentInsuranceFrom);
//    	infoAboutYourWorkHistory.setReceivedEmploymentInsuranceTo(receivedEmploymentInsuranceTo);
//    	infoAboutYourWorkHistory.setSelfEmployed(selfEmployed);
//    	infoAboutYourWorkHistory.setStillSelfEmployed(stillSelfEmployed);
//    	infoAboutYourWorkHistory.setSelfEmployedWork(selfEmployedWork);
//    	infoAboutYourWorkHistory.setStoppedWork(stoppedWork);
//    	infoAboutYourWorkHistory.setWorkedInAnotherCountry(workedInAnotherCountry);

    	hello.form.InfoAboutYourWorkHistory.InfoAboutYourWorkHistory infoAboutYourWorkHistoryForm = new hello.form.InfoAboutYourWorkHistory.InfoAboutYourWorkHistory();
    	WorkHistCurrentLastEmployer workHistoryCurrentLastEmployer = new WorkHistCurrentLastEmployer();
    	workHistoryCurrentLastEmployer.setHadOtherJobs(1);
    	workHistoryCurrentLastEmployer.setHasStoppedWorking(1);
    	Job job = new Job();
    	Address address = new Address();
    	address.setCityTown("ci");
    	address.setCountry(1);
    	address.setPostalCode("ci");
    	address.setProvinceTerritory(1);
    	address.setStreetName("ci");

    	job.setAddress(address);
    	job.setDaysPerWeek(1);
    	job.setDuties("ci");
    	job.setEmployerName("ci");
    	job.setFromDate(LocalDate.now());
    	job.setToDate(LocalDate.now());
    	job.setHoursPerDay(1);
    	job.setPhone("ci");
    	job.setTitlePosition("ci");
    	job.setWorkType(1);
    	workHistoryCurrentLastEmployer.setJob(job);
    	workHistoryCurrentLastEmployer.setProvidedDetailStopped("stopped");
    	workHistoryCurrentLastEmployer.setReasonStopped(1);  	
    	infoAboutYourWorkHistoryForm.setWorkHistoryCurrentLastEmployer(workHistoryCurrentLastEmployer);
    	
    	WorkHistMedicalConditions workHistoryMedicalConditions = new WorkHistMedicalConditions();
    	workHistoryMedicalConditions.setEmploymentInsurance(1);
    	workHistoryMedicalConditions.setIncomeTax(1);
    	workHistoryMedicalConditions.setInsuranceFromDate(LocalDate.now());
    	workHistoryMedicalConditions.setInsuranceToDate(LocalDate.now());
    	workHistoryMedicalConditions.setInvolvementWithBusiness(1);
    	workHistoryMedicalConditions.setMedicalCondition(1);
    	workHistoryMedicalConditions.setMedicalDescribe("ci");
    	workHistoryMedicalConditions.setSelfEmployed(1);
    	workHistoryMedicalConditions.setSelfEmployeStill(1);
    	infoAboutYourWorkHistoryForm.setWorkHistoryMedicalConditions(workHistoryMedicalConditions);
    	
    	WorkHistOtherCountries workHistoryOtherCountries = new  WorkHistOtherCountries();
    	Country country = new Country();
    	country.setLivedInFrom(LocalDate.now());
    	country.setLivedInTo(LocalDate.now());
    	country.setName(1);
    	country.setReceivedBenefits(1);
    	country.setSin("ci");
    	country.setWorkedInFrom(LocalDate.now());
    	country.setWorkedInTo(LocalDate.now());
    	List<Country>countryLst = new ArrayList<Country>();
    	countryLst.add(country);
    	workHistoryOtherCountries.setCountryLst(countryLst);
    	workHistoryOtherCountries.setWorkedAnotherCountry(1);
    	infoAboutYourWorkHistoryForm.setWorkHistoryOtherCountries(workHistoryOtherCountries);
    	Job job1 = new Job();
     	job1.setAddress(address);
    	job1.setDaysPerWeek(1);
    	job1.setDuties("ci");
    	job1.setEmployerName("ci");
    	job1.setFromDate(LocalDate.now());
    	job1.setToDate(LocalDate.now());
    	job1.setHoursPerDay(1);
    	job1.setPhone("ci");
    	job1.setTitlePosition("ci");
    	job1.setWorkType(1);
    	WorkHistOtherJobs  workHistOtherJobs = new WorkHistOtherJobs();
    	List<Job>jobLst = new ArrayList<Job>();
    	jobLst.add(job);
    	jobLst.add(job1);
    	workHistOtherJobs.setJobLst(jobLst);
    	infoAboutYourWorkHistoryForm.setWorkHistoryOtherJobs(workHistOtherJobs);
    	
    InfoAboutYourWorkHistory infoAboutYourWorkHistoryTest =	infoAboutYourWorkHistoryMapper.infoAboutYourWorkHistoryAndToInfoAboutYourWorkHistory(workHistoryCurrentLastEmployer, workHistoryMedicalConditions, workHistoryOtherCountries, workHistOtherJobs);
    	ObjectMapper objectMapper = new ObjectMapper();
    try {
		System.out.println("testing workhistory" +objectMapper.writeValueAsString(infoAboutYourWorkHistoryTest));
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    hello.form.InfoAboutYourWorkHistory.InfoAboutYourWorkHistory infoAboutYourWorkHistory = new hello.form.InfoAboutYourWorkHistory.InfoAboutYourWorkHistory();
    infoAboutYourWorkHistory.setWorkHistoryCurrentLastEmployer(infoAboutYourWorkHistoryMapper.infoAboutYourWorkHistoryToWorkHistCurrentLastEmployer(infoAboutYourWorkHistoryTest));
    infoAboutYourWorkHistory.setWorkHistoryMedicalConditions(infoAboutYourWorkHistoryMapper.infoAboutYourWorkHistoryToWorkHistMedicalConditions(infoAboutYourWorkHistoryTest));
    infoAboutYourWorkHistory.setWorkHistoryOtherCountries(infoAboutYourWorkHistoryMapper.infoAboutYourWorkHistoryToWorkHistOtherCountries(infoAboutYourWorkHistoryTest));
    infoAboutYourWorkHistory.setWorkHistoryOtherJobs(infoAboutYourWorkHistoryMapper.infoAboutYourWorkHistoryToWorkHistOtherJobs(infoAboutYourWorkHistoryTest));
    
    try {
		System.out.println("testing workhistory1" +objectMapper.writeValueAsString(infoAboutYourWorkHistory));
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
    //CHildren
    ConsentToContactCustChild consentToContactCustChild = new ConsentToContactCustChild();
    consentToContactCustChild.setContactConsent(1);
    consentToContactCustChild.setContactConsent(1);
    
    CRPInformation cRPInformation = new CRPInformation();
    cRPInformation.setCaregiver(1);
    cRPInformation.setcCBReceived(1);
    cRPInformation.setcCBWhoReceived(1);
    cRPInformation.setfAReceived(1);
    cRPInformation.setfAWhoReceived(1);

    DCCCustodyAndContrChild dCCCustodyAndContrChild = new DCCCustodyAndContrChild();
    ChildDOBName  childDOBName = new ChildDOBName();
    Address address1 = new Address();
    address1.setCityTown("city");
    address1.setCountry(1);
    address1.setPostalCode("dd");
    address1.setProvinceTerritory(1);
    address1.setStreetName("dd");
    address1.setTelephone("dd");  
    childDOBName.setAddress(address1);
    Child child1 = new Child();
    child1.setAddress(address1);
    child1.setDateEnteredCanada(LocalDate.now());
    child1.setDateOfBirth(LocalDate.now());
    child1.setFullName("dd");
    child1.setRelationship(1);
    child1.setRelationshipOther("dd");
    child1.setSin("dd");
    childDOBName.setChild(child1);
    childDOBName.setChildInSchool(1);
    childDOBName.setCustodianName("name");
    childDOBName.setDateOfBirth(LocalDate.now());
    childDOBName.setFullName("fullname");
    childDOBName.setHasCustody(1);
    childDOBName.setSameCustodian(1);
    List<ChildDOBName>child18To25Lst = new ArrayList<ChildDOBName>();
    child18To25Lst.add(childDOBName);
    dCCCustodyAndContrChild.setChild18to25DOBLst(child18To25Lst);
    dCCCustodyAndContrChild.setUnder18childDOBLst(child18To25Lst);
    
    IdentityChildren identityChildren = new IdentityChildren();
    List<Child>childLst = new ArrayList<Child>();
    childLst.add(child1);
    childLst.add(child1);
    identityChildren.setChildLst(childLst);
    
    RequestCRP requestCRP = new RequestCRP();
    requestCRP.setRequestCRP(1);
    
    InfoAboutYourChildren infoAboutYourChildrenTest =infoAboutYourChildrenMapper.InfoAboutYourChildrenAndToInfoAboutYourChildren(childDOBName, consentToContactCustChild, cRPInformation, dCCCustodyAndContrChild, identityChildren, requestCRP);
    try {
		System.out.println("testing infoAboutYourChildren1" +objectMapper.writeValueAsString(infoAboutYourChildrenTest));
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    consentToContactCustChild=infoAboutYourChildrenMapper.InfoAboutYourChildrenToConsentToContactCustChild(infoAboutYourChildrenTest);
    cRPInformation=infoAboutYourChildrenMapper.InfoAboutYourChildrenToCRPInformation(infoAboutYourChildrenTest);
    dCCCustodyAndContrChild=infoAboutYourChildrenMapper.InfoAboutYourChildrenToDCCCustodyAndContrChild(infoAboutYourChildrenTest);
    identityChildren=infoAboutYourChildrenMapper.InfoAboutYourChildrenToIdentityChildren(infoAboutYourChildrenTest);
    	requestCRP=infoAboutYourChildrenMapper.InfoAboutYourChildrenToRequestCRP(infoAboutYourChildrenTest);
    hello.form.InfoAboutYourChildren.InfoAboutYourChildren infoAboutYourChildren1 = new hello.form.InfoAboutYourChildren.InfoAboutYourChildren();
    infoAboutYourChildren1.setConsentToContactCustChild(consentToContactCustChild);
    infoAboutYourChildren1.setcRPInformation(cRPInformation);
    infoAboutYourChildren1.setdCCCustodyAndContrChild(dCCCustodyAndContrChild);
    infoAboutYourChildren1.setIdentityChildren(identityChildren);
    infoAboutYourChildren1.setRequestCRP(requestCRP);
    
    try {
  		System.out.println("testing infoAboutYourChildren form" +objectMapper.writeValueAsString(infoAboutYourChildren1));
  	} catch (JsonProcessingException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
    CommunicationPreferences communicationPreferences = new CommunicationPreferences();
    communicationPreferences.setLanguage(1);
    communicationPreferences.setQppBenefits(1);
    communicationPreferences.setTime(1);
 
    MaritalStatusChildren  maritalStatusChildren = new MaritalStatusChildren();
    maritalStatusChildren.setEndDate(LocalDate.now());
    maritalStatusChildren.setMartialStatus(1);
    maritalStatusChildren.setNumChildren(1);
    maritalStatusChildren.setSixYearsJobs(1);
    maritalStatusChildren.setStartDate(LocalDate.now());  
    
    hello.service.dto.InfoAboutYou infoAboutYouTest = infoAboutYouMapper.InfoAboutYouToInfoAboutYou(communicationPreferences, maritalStatusChildren);
    
    try {
  		System.out.println("testing infoAboutYou " +objectMapper.writeValueAsString(infoAboutYouTest));
  	} catch (JsonProcessingException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
    hello.form.InfoAboutYou.InfoAboutYou infoAboutYou = new hello.form.InfoAboutYou.InfoAboutYou();
    infoAboutYou.setCommunicationPreferences(infoAboutYouMapper.InfoAboutYouToCommunicationPreferences(infoAboutYouTest));
    infoAboutYou.setMaritalStatusChildren(infoAboutYouMapper.InfoAboutYouToMaritalStatusChildren(infoAboutYouTest).getMaritalStatusChildren());
    try {
  		System.out.println("testing infoAboutYou form" +objectMapper.writeValueAsString(infoAboutYou));
  	} catch (JsonProcessingException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
    
    ////    	MapStructTesting mapStructTesting = new MapStructTesting();
////    	mapStructTesting.copyFiles();
//System.out.println("sssssss");
//
////Working with DestSourceMapper
////Job job = new Job();
////job.setTitle("hi");
////
////Job1 job1 = mapper.destinationToSource(job);
////System.out.println("testing" + job1.getTitle() + "testin1" + job.getTitle());
//
////working with JobMapper
////Job job = new Job();
////job.setAge(1L);
////job.setName("dumb");
////job.setTitle("title1");
////Job1 job1=mapperJob.jobToJob1(job);
////System.out.println("JobToJob1 JOB1" + job1.getAge() + job1.getName1() + job1.getTitle());
////
////Job1 jobs = new Job1();
////jobs.setAge(2);
////jobs.setName1("kitty");
////jobs.setTitle("title");
////Job joba=mapperJob.job1ToJob(job1);
////System.out.println("Job1ToJob JOB" + joba.getAge() + joba.getName() + joba.getTitle());
//
////working with infoAboutMapper --This is for infoForm that has address object in it.
////InfoAbout infoAbout = new InfoAbout();
////Address2 address2 = new Address2();
////address2.setPostalCode("postalCode");
////address2.setStreet("street");
////infoAbout.setAddress2(address2);
////
////InfoAboutForm infoAboutForm1 = mapperInfoAbout.InfoAboutToInfoAboutForm(infoAbout);
////System.out.println("mapper2 " + infoAboutForm1.getAddress().getPostalCode1() + infoAboutForm1.getAddress().getStreet1());
////
////InfoAboutForm infoAboutForm = new InfoAboutForm();
////Address address = new Address();
////address.setPostalCode1("postalCode");
////address.setStreet1("street");
////infoAboutForm.setAddress(address);
////
////InfoAbout infoAbout1 = mapperInfoAbout.InfoAboutFormToInfoAbout(infoAboutForm);
////System.out.println("mapper2 " + infoAbout1.getAddress2().getPostalCode() + infoAbout1.getAddress2().getStreet());
//
////working with infoAboutMapper with jobLst
////InfoAbout infoAbout = new InfoAbout();
////Address2 address2 = new Address2();
////address2.setPostalCode("postalCode");
////address2.setStreet("street");
////infoAbout.setAddress2(address2);
////Job job = new Job();
////job.setName("jimmy");
////job.setAge(1);
////job.setTitle("tt");
////
////List<Job>jobLst = new ArrayList<Job>();
////jobLst.add(job);
////job.setName("jimmy1");
////job.setAge(1);
////job.setTitle("tt1");
////jobLst.add(job);
////infoAbout.setJobLst(jobLst);
////
////InfoAboutForm infoAboutForm1 = mapperInfoAbout.InfoAboutToInfoAboutForm(infoAbout);
////System.out.println("mapper2333 " + infoAboutForm1.getAddress().getPostalCode1() + infoAboutForm1.getAddress().getStreet1() + "job" + infoAbout.getJobLst().get(1).getName());
////
////InfoAboutForm infoAboutForm = new InfoAboutForm();
////Address address = new Address();
////address.setPostalCode1("postalCode");
////address.setStreet1("street");
////infoAboutForm.setAddress(address);
////
////Job job1 = new Job();
////job1.setName("jimmy");
////job1.setAge(1);
////job1.setTitle("tt");
////List<Job>jobLst1 = new ArrayList<Job>();
////jobLst1.add(job1);
////job1.setName("jimmy2");
////job1.setAge(1);
////job1.setTitle("tt2");
////jobLst1.add(job1);
////infoAboutForm.setJobLst(jobLst1);
////
////InfoAbout infoAbout1 = mapperInfoAbout.InfoAboutFormToInfoAbout(infoAboutForm);
////System.out.println("mapper23333 " + infoAbout1.getAddress2().getPostalCode() + infoAbout1.getAddress2().getStreet() + "job" + infoAboutForm.getJobLst().get(1).getName());
//
////working with InfoAboutForm2
//
//InfoAbout2 infoAbout2 = new InfoAbout2();
//Address2 address2 = new Address2();
//address2.setPostalCode("postalCode");
//address2.setStreet("street");
//infoAbout2.setAddress2(address2);
//
//List<Address2>addressLst = new ArrayList<Address2>();
//Address2 address3 = new Address2();
//address3.setStreet("street1");
//addressLst.add(address3);
//infoAbout2.setAddressLst(addressLst);
//
//InfoAboutForm2 infoAboutForm1 = mapperInfoAbout2.InfoAboutToInfoAboutForm(infoAbout2);
//System.out.println("mapper2333 " + infoAboutForm1.getAddress().getPostalCode1() + infoAboutForm1.getAddress().getStreet1() + "job" + infoAboutForm1.getAddressLst().get(0).getStreet1());
//
//InfoAboutForm2 infoAboutForm2 = new InfoAboutForm2();
//Address address = new Address();
//address.setPostalCode1("postalCode");
//address.setStreet1("street");
//infoAboutForm2.setAddress(address);
//
//
//List<Address>addressLst4 = new ArrayList<Address>();
//Address address4 = new Address();
//address4.setPostalCode1("postalCode");
//address4.setStreet1("street1");
//addressLst4.add(address4);
//infoAboutForm2.setAddressLst(addressLst4);
//
//InfoAbout2 infoAbout1 = mapperInfoAbout2.InfoAboutFormToInfoAbout(infoAboutForm2);
//System.out.println("mapper23333 " + infoAbout1.getAddress2().getPostalCode() + infoAbout1.getAddress2().getStreet() + "job" + infoAbout1.getAddressLst().get(0).getPostalCode());
//
//
////    	mapperInfoAboutname"+formControllerBean.getEmployee().getName());
////    	System.out.println("checkbox" +	formControllerBean.getEmployee().getCheckboxesTest());
////    	System.out.println("	radio" +formControllerBean.getEmployee().getRadioTest());
////    	System.out.println("selectbox" + formControllerBean.getEmployee().getSelectBoxTest());
////    	System.out.println("startdate" +formControllerBean.getEmployee().getStartDate());
////    	System.out.println("textarea" +formControllerBean.getEmployee().getTextareaTest());
////    	
////    	System.out.println("drop down list" +formControllerBean.getSelect1());
////    	
////    	System.out.println("size" + formControllerBean);
////	    	System.out.println("name"+formControllerBean.getEmployeeLst().get(0).getName());
////	    	System.out.println("name spring path"+formControllerBean.getEmployeeLst().get(0).getName1());
////	    	System.out.println("textAreaPath spring path"+formControllerBean.getEmployeeLst().get(0).getTextAreaPath());
////	    	
////	    	System.out.println("checkbox" +	formControllerBean.getEmployeeLst().get(0).getCheckboxesTest());
////	    	System.out.println("	radio" +formControllerBean.getEmployeeLst().get(0).getRadioTest());
////	    	System.out.println("selectbox" + formControllerBean.getEmployeeLst().get(0).getSelectBoxTest());
////	    	System.out.println("startdate" +formControllerBean.getEmployeeLst().get(0).getStartDate());
////	    	System.out.println("textarea" +formControllerBean.getEmployeeLst().get(0).getTextareaTest());
////	    	
////	    	System.out.println("name"+formControllerBean.getEmployeeLst().get(1).getName());
////	    	System.out.println("name spring path1"+formControllerBean.getEmployeeLst().get(1).getName1());
////	    	System.out.println("checkbox" +	formControllerBean.getEmployeeLst().get(1).getCheckboxesTest());
////	    	System.out.println("	radio" +formControllerBean.getEmployeeLst().get(1).getRadioTest());
////	    	System.out.println("selectbox" + formControllerBean.getEmployeeLst().get(1).getSelectBoxTest());
////	    	System.out.println("startdate" +formControllerBean.getEmployeeLst().get(1).getStartDate());
////	    	System.out.println("textarea" +formControllerBean.getEmployeeLst().get(1).getTextareaTest());
    }

}
