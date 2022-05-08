package Cuma;

public class PersonMain {

	public static void main(String[] args) {

		Person person1= new Person();
		Person person2 = new Person();
		
		
		person1.setName("Mehmet");
		person1.setLastname("Çifçi");
		person1.setAge(28);
		person1.setGender("Erkek");
		person1.personFeatures();
		System.out.println(person1);
		
		
		person2.setName("Çaðrý");
		person2.setLastname("Türkmen");
		person2.setAge(29);
		person2.setGender("Erkek");
		person2.personFeatures();
	}

}
