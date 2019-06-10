package hello;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Job1 {
	String title;
	String name1;
	int age;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



}
