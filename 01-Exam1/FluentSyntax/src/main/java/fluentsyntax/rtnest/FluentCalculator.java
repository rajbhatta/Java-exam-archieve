package fluentsyntax.rtnest;

import java.util.ArrayList;
import java.util.List;

public class FluentCalculator
  {
	private String stringFormulator = "";

	public final FluentCalculator zero()
	{
		return stringOperation("0");
	}
	public final FluentCalculator one()
	{
		return stringOperation("1");
	}
	public final FluentCalculator two()
	{
		return stringOperation("2");
	}
	public final FluentCalculator three()
	{
		return stringOperation("3");
	}
	public final FluentCalculator four()
	{
		return stringOperation("4");
	}
	public final FluentCalculator five()
	{
		return stringOperation("5");
	}
	public final FluentCalculator six()
	{
		return stringOperation("6");
	}
	public final FluentCalculator seven()
	{
		return stringOperation("7");
	}
	public final FluentCalculator eight()
	{
		return stringOperation("8");
	}
	public final FluentCalculator nine()
	{
		return stringOperation("9");
	}
	public final FluentCalculator ten()
	{
		return stringOperation("10");
	}
	public final FluentCalculator plus()
	{
		return stringOperation("+");
	}
	public final FluentCalculator minus()
	{
		return stringOperation("-");
	}
	public final FluentCalculator times()
	{
		return stringOperation("*");
	}
	public final FluentCalculator divide_by()
	{
		return stringOperation("/");
	}

	public FluentCalculator stringOperation(String part)
	{
	  this.stringFormulator += part;
	  return this;
	}
	
	public int result()
	{
		int resultValue=0;
		
		switch(this.stringFormulator.charAt(1)) {
		  case '-':
			     	resultValue=Integer.parseInt(String.valueOf(this.stringFormulator.charAt(0))) -Integer.parseInt(String.valueOf(this.stringFormulator.charAt(2)));
			     	break;
		  case '+':
			  	   	resultValue=Integer.parseInt(String.valueOf(this.stringFormulator.charAt(0))) +Integer.parseInt(String.valueOf(this.stringFormulator.charAt(2)));
			  	   	break;
		  case '*':
			  		resultValue=Integer.parseInt(String.valueOf(this.stringFormulator.charAt(0))) * Integer.parseInt(String.valueOf(this.stringFormulator.charAt(2)));
		     		break;
		  case '/':
			  		resultValue=Integer.parseInt(String.valueOf(this.stringFormulator.charAt(0))) / Integer.parseInt(String.valueOf(this.stringFormulator.charAt(2)));
		  	   		break;
		  default:
		    		System.out.println("Error in finding proper opreations");
		}
		
		return resultValue;
	}
	
  }
