package com.test;

public class Calc {
	/*
	 * Create a object to calculate Quadric function ax**2 + bx + c  = 0
	 */
	public Calc(Double a, Double b, Double c)
	{
		_a = a;
		_b = b;
		_c = c;
		
	}
	
	/*
	 *  Calculate Quadric function ax**2 + bx + c  = 0
	 */
	public Double[] getQuadricResults()
	{
		if (_a != 0.0)
		{
			Double a2 = _a * 2.0;
			Double sqrtResult = Math.sqrt(_b*_b - 4.0 * _a * _c);
			Double[] results = new Double[2];
			results[0] = (-_b + sqrtResult) / a2;
			results[1] = (-_b - sqrtResult) / a2;
			return results;
		}
		return null;
	}
	
	private Double _a;
	private Double _b;
	private Double _c;
}
