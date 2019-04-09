package Practice;

public class ConstructorExecution {

	public static void main(String[] args) {
		
		ConstructorWithThisKeyWord abc1 = new ConstructorWithThisKeyWord();
		
			
			abc1.name="Suprokash Sanyal";
			System.out.println(abc1.name);
			
		ConstructorWithThisKeyWord abc2 = new ConstructorWithThisKeyWord();
			abc2.ssn = 123456;
			System.out.println(abc2.ssn);
		
		ConstructorWithThisKeyWord abc3 = new ConstructorWithThisKeyWord();
			
			abc3.dept = "Admin";
			System.out.println(abc3.dept);
			
			System.out.println("Apr09,1986");
	}

}
