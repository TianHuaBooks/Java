
public class SimpleQuadric {
	
	public static void main(String[] argv )
	{
		if (argv.length != 3)
		{
			System.out.println("Syntax: SimpleQuadric a b c\n a, b, c are real number.");
			return;
		}
		Double a = Double.parseDouble(argv[0]);
		Double b = Double.parseDouble(argv[1]);
		Double c = Double.parseDouble(argv[2]);
		if (a == 0.0)
		{
			System.out.println("Parameter a can't be zero!");
			return;
		}
		Double tmp = Math.sqrt(b*b - 4.0*a*c);
		Double a2 = 2.0 * a;
		Double result1 = (-b + tmp) / a2;
		Double result2 = (-b - tmp) / a2;
		System.out.println("Result 1:" + result1 + " Result 2:" + result2);
		
		
	}

}
