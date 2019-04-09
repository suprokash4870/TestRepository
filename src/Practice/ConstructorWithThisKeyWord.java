package Practice;

public class ConstructorWithThisKeyWord {

	String name;
	int ssn;
	String dept;
	String dob;
	
	public  ConstructorWithThisKeyWord() {
		
		
	}
	
	public ConstructorWithThisKeyWord(String name) {
		
		this.name = name;
		System.out.println(name);
	}
	
	public ConstructorWithThisKeyWord(int ssn) {
		
		this.ssn = ssn;
		System.out.println(ssn);
	}
	
	
		
}
