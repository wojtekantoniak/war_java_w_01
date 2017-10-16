package pl.coderslab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
	
	private static Pattern p1 = Pattern.compile("[\\S]{10,15}");
	private static Pattern p2 = Pattern.compile("[a-z]+");
	private static Pattern p3 = Pattern.compile("[A-Z]+");
	private static Pattern p4 = Pattern.compile(".*[a-z]{2,}.*");
	private static Pattern p5 = Pattern.compile(".*[A-Z]{2,}.*");
	
	public static void main(String[] args) {
		System.out.println(verifyPassword("12345aBcDeF1234"));
		System.out.println(verifyPassword("12345aBcDeF123445"));
		System.out.println(verifyPassword("12345aaBcDeF1234"));
		System.out.println(verifyPassword("12345aBBcDeF1234"));
		System.out.println(verifyPassword("12345a1c2e31234"));
		System.out.println(verifyPassword("123451B2D3F1234"));
	}
	
	static boolean verifyPassword(String password){
		Matcher m1 = p1.matcher(password);
		Matcher m2 = p2.matcher(password);
		Matcher m3 = p3.matcher(password);
		Matcher m4 = p4.matcher(password);
		Matcher m5 = p5.matcher(password);
		return m1.matches() && m2.find() && m3.find() && !m4.find() && !m5.find();
	}//(?=[\S]{10,15})(?=.*[A-Z]+.*)(?=.*[a-z]+.*)(?!.*[a-z]{2,}.*)(?!.*[A-Z]{2,}.*)
	
}
