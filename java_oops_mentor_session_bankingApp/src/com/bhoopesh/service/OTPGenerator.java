package com.bhoopesh.service;

import java.util.Random;

public class OTPGenerator {
	
	public int generateOTP() {
		
		
		//random fun will give value greater or equal 0.0 and less than 1.0 (0.99999)
		/*
		 * 1000 - 9999
		 * 8999 + 1000 = 9999
		 * 
		 */
		int randomPin = (int) (Math.random() *  9000) + 1000;
				
		return randomPin;
	}

}
