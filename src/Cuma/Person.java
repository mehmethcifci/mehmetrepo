package Cuma;

public class Person {

	


	@Override
	public String toString() {
		return "Person [name=" + this.name + ", lastname=" + this.lastname + ", age=" + this.age + ", gender="
				+ this.gender + "]";
	}
	private String name;
	private String lastname;
	private int age;
	private String gender;
	
	
	
	void personFeatures() {
		
		System.out.println("Ýsim: "+ name + "  " + "Soyisim: "+ lastname + "  "+ "Yaþ: " + age + "  " + "Cinsiyet: " + gender);
		
	}
	
	
	
	public String getName() {
		return this.name;
	}
	public String getLastname() {
		return this.lastname;
	}
	public int getAge() {
		return this.age;
	}
	public String getGender() {
		return this.gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
