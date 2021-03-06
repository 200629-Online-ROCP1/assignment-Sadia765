package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class EvaluationService {

	/**
	 * 1.A Speed Converter - Convert to MilesPerHour
	 * 
	 * Write a method called toMilesPerHour that has 1 parameter of type double with
	 * the name kilometersPerHour. This method needs to return the rounded value of
	 * the calculation of type long.
	 * 
	 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
	 * needs to return -1 to indicate an invalid value.
	 * 
	 * Otherwise if it is positive, calculate the value of miles per hour, round it
	 * and return it. For conversion and rounding use Math.round().
	 */ 
	static class SpeedConverter {

		public static long toMilesPerHour(double kilometersPerHour) {
			// TODO Write an implementation for this method declaration
			if(kilometersPerHour<0) {
				return -1;
			}
			long miPerHr = Math.round(kilometersPerHour* 0.621371);
			return miPerHr;
		}

		/**
		 * 1.B Speed Converter - Print Conversion
		 * 
		 * Write another method called printConversion with 1 parameter of type double
		 * with the name kilometersPerHour. This method needs to return a String and
		 * needs to calculate milesPerHour from the kilometersPerHour parameter.
		 * 
		 * The String should print in the format: "XX km/h = YY mi/h"
		 * 
		 * XX represents the original value kilometersPerHour. YY represents the rounded
		 * milesPerHour from the kilometersPerHour parameter.
		 * 
		 * If the parameter kilometersPerHour is < 0, then print the text "Invalid
		 * Value"
		 */
		public static String printConversion(double kilometersPerHour) {
			// TODO Write an implementation for this method declaration
			long miPerHr = toMilesPerHour(kilometersPerHour);
			if(miPerHr == -1) {
				return "Invalid Value";
			}
			return kilometersPerHour + " km/h = " + miPerHr + " mi/h";
		}
	}

	/**
	 * 2. MegaBytes and KiloBytes
	 * 
	 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type
	 * int with the name kiloBytes.
	 * 
	 * The method should return a String and it needs to calculate the megabytes and
	 * remaining kilobytes from the kilobytes parameter.
	 * 
	 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
	 * 
	 * XX represents the original value kiloBytes. YY represents the calculated
	 * megabytes. ZZ represents the calculated remaining kilobytes.
	 * 
	 * For examples, when the parameter kiloBytes is 2500 it needs to print "2500 KB
	 * = 2 MB and 452 KB"
	 * 
	 * If the parameter kiloBytes is less than 0 then print the text "Invalid
	 * Value".
	 */
	public String printMegaBytesAndKiloBytes(int XX) {
		// TODO Write an implementation for this method declaration
		if(XX < 0) {
			return "Invalid Value";
		}
		double mB = XX*0.00097656;
		int YY = (int) Math.floor(mB);
		int ZZ = (int) Math.ceil((mB-YY)*1024);
		return XX + " KB = " + YY +" MB and " + ZZ +" KB";
	}

	/**
	 * 3. Barking Dog
	 * 
	 * We have a dog that loves to bark. We need to wake up if the dog is barking at
	 * night!
	 * 
	 * Write a method shouldWakeUp that has 2 parameters.
	 * 
	 * 1st parameter should be of type boolean and be named "barking". It represents
	 * if our dog is currently barking. 2nd parameter represents the hour of the day
	 * and is of type int with the name hourOfDay and has a valid range of 0-23.
	 * 
	 * We have to wake up if the dog is barking before 8 or after 22 hours, so in
	 * that case return true.
	 * 
	 * In all other cases return false.
	 * 
	 * If the hourOfDay parameter is less than 0 or greater than 23, return false.
	 */
	public boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		// TODO Write an implementation for this method declaration
		if(hourOfDay < 0 || hourOfDay > 23) {
			//System.out.println("isBarking: "+ isBarking + " false hourOfDay: " + hourOfDay);
			return false;
			
		}
		else if(isBarking) {
			if((hourOfDay >= 0 && hourOfDay <= 8) || hourOfDay == 22 || hourOfDay == 23) {
				//System.out.println("isBarking: "+ isBarking + " true hourOfDay: "+ hourOfDay);
				return true;
				
			}
		}
		//System.out.println("isBarking: "+ isBarking + " false hourOfDay: "+ hourOfDay);
		return false;
		
	}

	/**
	 * 4. DecimalComparator
	 * 
	 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
	 * double.
	 * 
	 * The method should return boolean and it needs to return true if two double
	 * numbers are the same up to three decimal places.
	 * 
	 * Otherwise, return false;
	 */
	public boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		// TODO Write an implementation for this method declaration
		//System.out.println("firstNum: " + firstNum +" secondNum: "+ secondNum);
		firstNum *=1000;
		secondNum *=1000;
		//System.out.println((int) firstNum == (int) secondNum);
		return (int) firstNum == (int) secondNum;
	}

	/**
	 * 5. Teen Number Checker
	 * 
	 * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
	 * Write a method named hasTeen with 3 parameters of type int.
	 * 
	 * The method should return boolean and it needs to return true if ONE of the
	 * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return
	 * false.
	 */
	static class TeenNumberChecker {

		public static boolean hasTeen(int x, int y, int z) {
			// TODO Write an implementation for this method declaration
			//System.out.println("x: "+ x +" y: "+ y + " z: "+ z);
			if(isTeen(x) || isTeen(y) || isTeen(z)) {
			//	System.out.println("x, y, or z is a teen!");
				return true;
			}
			//System.out.println("There are no teens!");
			return false;
		}

		// We can initialize isTeen method first
		// Then pass the parameter to hasTeen method

		public static boolean isTeen(int number) {
			// TODO Write an implementation for this method declaration
			if(number >= 13 & number <= 19) {
				return true;
			}
			return false;
		}
	}

	/**
	 * 6. Minutes To Years and Days Calculator
	 * 
	 * Write a method printYearsAndDays with parameter of type long named minutes.
	 * The method should not return anything (void) and it needs to calculate the
	 * years and days from the minutes parameter.
	 * 
	 * If the parameter is less than 0, print text "Invalid Value".
	 * 
	 * Otherwise, if the parameter is valid then it needs to print a message in the
	 * format "XX min = YY y and ZZ d".
	 * 
	 * XX represents the original value minutes. YY represents the calculated years.
	 * ZZ represents the calculated days.
	 */
	public String printYearsAndDays(long minutes) { 
		// TODO Write an implementation for this method declaration
		if(minutes < 0) {
			//System.out.println("Invalid Value");
			return "Invalid Value";
		}
		int year = 0;
		int days;
		if(minutes >= 525600) {
			year = (int) Math.floor(minutes/525600);
			days = (int) Math.floor((minutes%525600)/1440);
		}
		else {
			days = (int) Math.floor(minutes/1440);
		}
		//System.out.println(minutes +" min = " + year + " y and " + days +" d");
		return minutes +" min = " + year + " y and " + days +" d";
		
//		return null;
	}

	/**
	 * 7. Number In Word
	 * 
	 * Write a method called printNumberInWord. The method has one parameter number
	 * which is the whole number. The method needs to print "ZERO", "ONE", "TWO",
	 * ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
	 * for any other number including negative numbers. You can use if-else
	 * statement or switch statement whatever is easier for you.
	 */
	public String printNumberInWord(int number) {
		// TODO Write an implementation for this method declaration
		switch(number) {
			case 0:
				//System.out.println("ZERO");
				return "ZERO";
			case 1:
				//System.out.println("ONE");
				return "ONE";
			case 2:
				//System.out.println("TWO");
				return "TWO";
			case 3:
				//System.out.println("THREE");
				return "THREE";
			case 4:
				//System.out.println("FOUR");
				return "FOUR";
			case 5:
				//System.out.println("FIVE");
				return "FIVE";
			case 6:
				//System.out.println("SIX");
				return "SIX";
			case 7:
				//System.out.println("SEVEN");
				return "SEVEN";
			case 8:
				//System.out.println("EIGHT");
				return "EIGHT";
			case 9:
				//System.out.println("NINE");
				return "NINE";
			default:
				//System.out.println("OTHER");
				return "OTHER";
		}
	}

	/**
	 * 8. Greatest Common Divisor
	 * 
	 * Write a method named getGreatestCommonDivisor with two parameters of type int
	 * named first and second.
	 * 
	 * If one of the parameters is < 10, the method should return -1 to indicate an
	 * invalid value. The method should return the greatest common divisor of the
	 * two numbers (int).
	 * 
	 * The greatest common divisor is the largest positive integer that can fully
	 * divide each of the integers (i.e. without leaving a remainder).
	 * 
	 * For example 12 and 30: 12 can be divided by 1, 2, 3, 4, 6, 12 30 can be
	 * divided by 1, 2, 3, 5, 6, 10, 15, 30
	 * 
	 * The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
	 * and there is no resulting remainder.
	 */
	public int getGreatestCommonDivisor(int first, int second) {
		// TODO Write an implementation for this method declaration
		if(first < 10 || second < 10) {
			//System.out.println("first: " + first +" second: "+ second + " GCD: " + -1);
			return -1;
		}
		int minNum = Math.min(first, second);
		for(int i = minNum; i>=0; i--) {
			if(first%i == 0  && second%i == 0) {
				//System.out.println("first: " + first +" second: "+ second + " GCD: " + i);
				return i;
			}
		}
		return 0;
	}

	/**
	 * 9. First and Last Digit Sum
	 * 
	 * Write a method named sumFirstAndLastDigit with one parameter of type int
	 * called number.
	 * 
	 * The method needs to find the first and the last digit of the parameter number
	 * passed to the method, using a loop and return the sum of the first and the
	 * last digit of that number.
	 * 
	 * If the number is negative then the method needs to return -1 to indicate an
	 * invalid value.
	 */
	public int sumFirstAndLastDigit(int num) {
		// TODO Write an implementation for this method declaration
		if(num < 0) {
			return -1;
		}
		int last = num % 10;
		while(num >= 10) {
			num = num/10;
		}
		int first = num;
		//System.out.println("num: " + num + " first: " + first + " last: " + last + "sum: " + (first+last));
		return (first + last);
	}

	/**
	 * 10. Reverse String
	 * 
	 * Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 */
	public String reverse(String string) {
		// TODO Write an implementation for this method declaration
		String reverseStr = "";
		int counter = string.length()-1;
		while(counter >= 0) {
			reverseStr += string.charAt(counter);
			counter--;
		}
		//System.out.println(reverseStr);
		return reverseStr;
	}

	/**
	 * 11. Acronyms
	 * 
	 * Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 */
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		String acr = "";
		String[] acrList = phrase.toUpperCase().replace('-', ' ').split(" ");
		for(int i = 0; i < acrList.length; i++) {
			acr += acrList[i].charAt(0);
		}
		//System.out.println(acr);
		return acr;
	}

	/**
	 * 12. Triangles
	 * 
	 * Determine if a triangle is equilateral, isosceles, or scalene. An equilateral
	 * triangle has all three sides the same length. An isosceles triangle has at
	 * least two sides the same length.
	 * 
	 * (It is sometimes specified as having exactly two sides the same length, but
	 * for the purposes of this exercise we'll say at least two.) A scalene triangle
	 * has all sides of different lengths.
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			// TODO Write an implementation for this method declaration
			//System.out.println("isEquilateral");
			//System.out.println("side1: " + getSideOne() + " side2: " + getSideTwo() + " side3: " + getSideThree());
			if(getSideOne() == getSideTwo() && getSideTwo() == getSideThree()) {
				//System.out.println(true);
				return true;
			}
			//System.out.println(false);
			return false;
		}

		public boolean isIsosceles() {
			// TODO Write an implementation for this method declaration
			//System.out.println("isIsosceles");
			//System.out.println("side1: " + getSideOne() + " side2: " + getSideTwo() + " side3: " + getSideThree());
			if(getSideOne() == getSideTwo()) {
				//System.out.println(true);
				return true;
			}
			else if ( getSideOne() == getSideThree()) {
				//System.out.println(true);
				return true;
			}
			else if(getSideTwo() == getSideThree()) {
				//System.out.println(true);
				return true;
			}
			//System.out.println(false);
			return false;
		}

		public boolean isScalene() {
			// TODO Write an implementation for this method declaration
			//System.out.println("isScalene");
			//System.out.println("side1: " + getSideOne() + " side2: " + getSideTwo() + " side3: " + getSideThree());
			if(isIsosceles()) {
				//System.out.println("isScalene is false");
				return false;
			}
			//System.out.println("isScalene is true");
			return true;
		}

	}

	/**
	 * 13. Scrabble Score
	 * 
	 * Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 */
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
		string = string.toUpperCase();
		int total = 0;
		for(int i = 0; i<string.length(); i++) {
			char charAtIndex = string.charAt(i);
			if(charAtIndex == 'A' || charAtIndex == 'E' || charAtIndex =='I' || charAtIndex == 'O' || charAtIndex == 'U' || charAtIndex == 'L'|| charAtIndex == 'N'|| charAtIndex == 'R'|| charAtIndex == 'S'|| charAtIndex == 'T') {
				total+=1;
			}
			else if(charAtIndex == 'D' || charAtIndex == 'G') {
				total+=2;
			}
			else if(charAtIndex == 'B' || charAtIndex == 'C' || charAtIndex =='M' || charAtIndex == 'P') {
				total+=3;
			}
			else if(charAtIndex == 'F' || charAtIndex == 'H' || charAtIndex =='V' || charAtIndex == 'W' || charAtIndex == 'Y') {
				total+=4;
			}
			else if(charAtIndex == 'K') {
				total+=5;
			}
			else if(charAtIndex == 'J' || charAtIndex == 'X') {
				total+=8;
			}
			else if(charAtIndex == 'Q' || charAtIndex == 'Z') {
				total+=10;
			}
		}
		//System.out.println(string + " " + total);
		return total;
	}

	/**
	 * 14. Clean the Phone Number
	 * 
	 * Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		String str = "";
		//System.out.println("string: "+ string);
		string = String.join("", string.split(" "));
		for(char s: string.toCharArray()) {
			if(Character.isDigit(s)) {
				str+=s;
			}
			else if("-.+()".indexOf(s) != -1) {
				//System.out.println("has -.+()");
				continue;
			}
			else if(Character.isLetter(s)) {
				//System.out.println("throws an exception: Letters in number");
				throw new IllegalArgumentException("Letters are not allowed in number!");
			}
			else {
				//System.out.println("throws an exception: Not these characters!");
				throw new IllegalArgumentException("These characters are not allowed!");
			}
		}
		if(str.length()>11) {
			//System.out.println("throws an exception: Number too long!");
			throw new IllegalArgumentException("Number is too long!");
		}
		if(str.length() == 11) {
			if(str.charAt(0) == '1') {
				str = str.substring(1);
			}
			else {
				//System.out.println("throws an exception: number is too long!");
				throw new IllegalArgumentException("Number is too long!");
			}
		}
		//System.out.println("return str: "+ str);
		//System.out.println("======");
		return str;
	}

	/**
	 * 15. Recurring Word Counter
	 * 
	 * Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		Map<String, Integer> counts = new HashMap<String, Integer>();
		//System.out.println("string without formating: "+string);
		string = string.replace(",", " ");
		string = string.replace("\n", "");
		//System.out.println("string with spaces enforced: "+string);
		String[] strArr = string.split(" ");
		for(int i = 0; i < strArr.length; i++) {
			//System.out.println(strArr[i]);
			if(!counts.containsKey(strArr[i])) {
				counts.put(strArr[i], 1);
			}
			else {//counts has the key strArr[i], so find its value and increment it.
				int value = counts.get(strArr[i]);
				counts.put(strArr[i], value+1);
			}
		}
		//System.out.println("now counts looks like: "+ counts);
		//System.out.println("========");
		return counts;
	}

	/**
	 * 16. Armstrong Number
	 * 
	 * An Armstrong number is a number that is the sum of its own digits each raised
	 * to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 */
	public boolean isArmstrongNumber(int input) {
		int sum = 0;
		String[] inputStr = Integer.toString(input).split("");
		
		int length = inputStr.length;
		//System.out.println("input: " +input +" inputStr: "+inputStr +" length: "+length);
		Map<String, Integer> digits = new HashMap<String, Integer>();
		digits.put("0", 0);
		digits.put("1", 1);
		digits.put("2", 2);
		digits.put("3", 3);
		digits.put("4", 4);
		digits.put("5", 5);
		digits.put("6", 6);
		digits.put("7", 7);
		digits.put("8", 8);
		digits.put("9", 9);
	
		for(int i = 0; i < length; i++) {
			//System.out.println(Math.pow(digits.get(inputStr[i]),length));
			sum+=Math.pow(digits.get(inputStr[i]),length);
		}
		//System.out.println("The sum is "+sum);
		//System.out.println("Im here: " + (sum == input));
		//System.out.println("====");
		if(sum == input) {
			return true;
		}//*/
		return false;
	}

	/**
	 * 17. Prime Factors
	 * 
	 * Compute the prime factors of a given natural number. A prime number is only
	 * evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		ArrayList<Long> arr = new ArrayList<Long>();
		long number = l;
		long counter = 2L;
		long factors;
		
		//System.out.println("long: "+ l);
		while(counter<= number) {
			factors = 0;
			if(number%counter == 0) {
				//check if number is prime before adding it to arr. 
				//It turns out all such numbers entering this if statement are prime, but to be complete I will test for prime-ness here. 
				//System.out.println("counter: " + counter + " is a factor of "+ number);
				
				for(int i = 2; i<counter; i++) {
					if(counter%i == 0) {
						factors+=1;
					}
				}
				if(factors == 0) {
					//System.out.println("counter: " + counter + " is in factor a PRIME factor of "+ number);
					arr.add(counter);
					number = number/counter;
					counter = 2;
				}
			}
			else {
				counter++;
			}
		}
		//for(int j = 0; j<arr.size(); j++) {
		//	System.out.println("arr at index "+ j +" is " + arr.get(j));
		//	System.out.println("type is "+ arr.get(j).getClass());
		//}
		//System.out.println("====");
		return arr;
	}

	/**
	 * 18. Calculate Nth Prime
	 * 
	 * Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 */
	public int calculateNthPrime(int k) {
		// TODO Write an implementation for this method declaration 
		if(k <= 0) {
			//System.out.println("throws IllegalArgumentException becuase "+ k +" is less than one");
			throw new IllegalArgumentException("k cannot be less than one!");
		}
		int currentPrime = 2;
		int primes = 0;
		int factors;
		while(primes<k) {
			factors = 0;
			for(int i = 2; i<currentPrime; i++) {
				if(currentPrime%i == 0) {
					factors++;
				}
			}
			if(factors == 0) {
				primes+=1;
			}
			currentPrime++;
		}
		//System.out.println(k+"th prime is: " + (currentPrime-1));
		return currentPrime-1;
	}

	/**
	 * 19. Pangram
	 * 
	 * Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 */
	public boolean isPangram(String string) {
		// TODO Write an implementation for this method declaration
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		//System.out.println("string: "+ string);
		
		for(int i  = 0; i <alphabet.length(); i++) {
			if(string.indexOf(alphabet.charAt(i)) == -1) {
				//System.out.println("returned false");
				return false;
			}
		}
		//System.out.println("returned true");
		//System.out.println("=====");
		return true;
	}

	/**
	 * 20. Sum of Multiples 
	 * 
	 * Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 */
	public int getSumOfMultiples(int i, int[] set) {
		Map<Integer, Integer> setOfmultiples = new HashMap<Integer, Integer>();
		int sum = 0;
		int setCounter = 0;
		int multiplier = 1;
		int multiple;
		while(setCounter < set.length) {
			multiple = multiplier*set[setCounter];
			while(multiple < i) {
				if(!setOfmultiples.containsKey(multiple)) {
					setOfmultiples.put(multiple, 1);
					sum+=multiple;
				}
				multiplier++;
				multiple = multiplier*set[setCounter];
			}
			setCounter++;
			multiplier = 1;
		}
		
		//System.out.println("Given i: "+ i +" sum: "+ sum);
		//System.out.println("Given set looks like: ");
		//for(int j = 0; j<set.length; j++) {
		//	System.out.println("set at index "+j+ " is "+ set[j]);
		//}
		//System.out.println("=====");
		return sum;
	}
	
	/**
	 * 21. Three Magic Numbers
	 * 
	 * You work at a casino in Las Vegas.  Your job is to program a slot machine to
	 * return 3 random numbers using the java.util.Random class.
	 * 
	 * Write a method to return an int array of 3 random numbers between 1 - 100.
	 * Generate the 3 random numbers (1 - 100 inclusive) using the java.util.Random class.
	 */
	
	public int[] threeLuckyNumbers() {
		int[] luckyNums = new int[3]; 
		for(int i = 0; i < 3; i++) {
			Random randomInt = new Random();
			luckyNums[i] = randomInt.nextInt(100) + 1;
		}
		for(int i = 0; i < 3; i++) {
			//System.out.println("luckyNums at "+ i+ ": "+luckyNums[i]);			
		}
		return luckyNums;
	}
	
	/*
	 * 22. Easy Guessing Game
	 * 
	 * Create a program to generate a number between the given range:
	 * int x = minimum
	 * iny y = maximum (inclusive)
	 * 
	 * You must use the Math.random class to generate a random number between x and y.
	 */
	
	public int guessingGame(int x, int y) {
		int z = (int) ((y-x)*Math.random() + x);
		//System.out.println("z: "+z);
		return z;
	}
}
