package Practice;

public class ConstructorConcept {
	
	int year;
	String model;
	String display = "15 inch";
	String os = "Windows";
	
	public ConstructorConcept() {
		
		}

	public ConstructorConcept(int year) {
		this. year = year;
		System.out.println(year);
		
	}
	
	public ConstructorConcept(String model) {
		this.model = model;
		System.out.println(model);
	}
	
	 
	}

