package com.test;

public class StopWatch {

	/**
	 * @param args
	 */
	public  StopWatch() {
		_ms = System.currentTimeMillis();
	}
	
	public long GetElapsedTime()
	{
		return System.currentTimeMillis() - _ms; 
	}

	private long _ms; // milli-second
}
