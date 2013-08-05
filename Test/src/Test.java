
import com.test.*;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 3)
		{
			System.out.println("Syntax: Test a b c\n a, b, c are real number.");
			return;
		}
		Double a = Double.parseDouble(args[0]);
		Double b = Double.parseDouble(args[1]);
		Double c = Double.parseDouble(args[2]);
		if (a == 0.0)
		{
			System.out.println("Parameter a can't be zero!");
			return;
		}
		
		StopWatch stopWatch = new StopWatch(); 
		Calc calcObj = new Calc(a, b, c);
		Double[] results = calcObj.getQuadricResults();
		long delta = stopWatch.GetElapsedTime();
		System.out.println("Spent: " + delta + "ms");

		if (results != null)
		{
			System.out.println("Ressult:" + results[0]);
			System.out.println("Ressult:" + results[1]);
		}
		
	}

}
