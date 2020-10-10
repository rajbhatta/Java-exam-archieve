package fluentsyntax.rtnest;

public class MainRunner {

	public static void main(String[] args) {
		
		FluentCalculator calc=new FluentCalculator();
		
		calc.five().minus().six();
		System.out.println(calc.result());
		
		
	}
}
