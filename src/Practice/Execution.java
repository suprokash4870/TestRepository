package Practice;

public class Execution {

	public static void main(String[] args) {
		
		ConstructorConcept refVar1 = new ConstructorConcept();
		
		refVar1.model = "Mac";
		System.out.println(refVar1.model);
		
		
		ConstructorConcept refVar2 = new ConstructorConcept(2019);
		
			//refVar2.year = 2019;
		
		ConstructorConcept refVar3 = new ConstructorConcept();
		
			refVar3.os = "Windows";
		
		System.out.println(refVar3.os);
		
		System.out.println(refVar1.display);
	}

}
