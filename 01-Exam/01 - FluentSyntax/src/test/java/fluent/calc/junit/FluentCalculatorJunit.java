package fluent.calc.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fluentsyntax.rtnest.FluentCalculator;

public class FluentCalculatorJunit 
{

	FluentCalculator calc;
	
	@Test
	public void verifyPlus()
	{
		calc=new FluentCalculator();
		 assertEquals(3,calc.one().plus().two().result());
		
	}
	
	@Test
	public void verifyMinus()
	{
		calc=new FluentCalculator();
		 assertEquals(-1,calc.five().minus().six().result());
		
	}
	
	@Test
	public void verifyTimes()
	{
		calc=new FluentCalculator();
		 assertEquals(14,calc.seven().times().two());
		
	}
	
	@Test
	public void verifyDivideBy()
	{
		calc=new FluentCalculator();
		 assertEquals(3,calc.nine().divide_by().three());
		
	}
}
