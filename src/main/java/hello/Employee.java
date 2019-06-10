package hello;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Employee {
	public String name;
	public String startDate;

	public String checkboxesTest;
	public String selectBoxTest;
	public String textareaTest;
	public String radioTest;
	public String name1;
	public String textAreaPath;
	public String getTextAreaPath() {
		return textAreaPath;
	}
	public void setTextAreaPath(String textAreaPath) {
		this.textAreaPath = textAreaPath;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getCheckboxesTest() {
		return checkboxesTest;
	}
	public void setCheckboxesTest(String checkboxesTest) {
		this.checkboxesTest = checkboxesTest;
	}
	public String getSelectBoxTest() {
		return selectBoxTest;
	}
	public void setSelectBoxTest(String selectBoxTest) {
		this.selectBoxTest = selectBoxTest;
	}
	public String getTextareaTest() {
		return textareaTest;
	}
	public void setTextareaTest(String textareaTest) {
		this.textareaTest = textareaTest;
	}
	public String getRadioTest() {
		return radioTest;
	}
	public void setRadioTest(String radioTest) {
		this.radioTest = radioTest;
	}
	
}
