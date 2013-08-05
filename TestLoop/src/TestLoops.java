import java.util.Random;
import com.test.*;


public class TestLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Generate testing parameters
		int loops = 100; // default to run 100 loops
		int MaxInt = 100;  // default max. integer for random number
		if (args.length > 0)
		{
			loops = Integer.parseInt(args[0]);
			if (args.length > 1)
				MaxInt = Integer.parseInt(args[1]);
		}
		
		System.out.println("Loop:" + loops + " MaxInt:" + MaxInt);
		
		Double[] a = new Double[loops];
		Double[] b = new Double[loops];
		Double[] c = new Double[loops];
		Random randomGenerator = new Random();
		for (int i = 0; i < loops; i++)
		{
			Integer a1 = randomGenerator.nextInt(MaxInt);
			if (a1 == 0)
				a1 = 1;
			Integer c1 = randomGenerator.nextInt(MaxInt);

			a[i] =  (double) a1;
			Integer b1 = randomGenerator.nextInt(MaxInt);
			Integer tmp = b1 * b1 - 4 * a1 * c1; 
			while (tmp < 0)
			{
				b1 = b1 * 2 + 1;
				tmp = b1 * b1 - 4 * a1 * c1; 
			}
			b[i] =  (double) b1;
			c[i] =  (double) c1;
		}
		
		Double[][] results = new Double[loops][2];
		StopWatch stopWatch = new StopWatch(); 
		for (int i = 0; i < loops; i++)
		{
			Calc calcObj = new Calc(a[i], b[i], c[i]);
			results[i] = calcObj.getQuadricResults();
		}
		long delta = stopWatch.GetElapsedTime();
		System.out.println("Spent: " + delta + "ms");

		if (results != null)
		{
			for (int i = 0; i < loops; i++)
			{
				System.out.println("Loop:" + i + " a:" + a[i] + " b:" + b[i] + " c:" + c[i]);
				System.out.println("Ressult:" + results[i][0] + ", " + results[i][1]);
			}
		}

	}

}
