package pl.coderslab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {

	private static Pattern pattern = Pattern
			.compile("^[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]{1,})*\\.([a-zA-Z]{2,}){1}$");

	public static void main(String[] args) {
		System.out.println(verifyEmail("nicun@wp.pl"));
		System.out.println(verifyEmail("@wp.pl"));
		System.out.println(verifyEmail("nicun@_wp.pl"));
	}

	static boolean verifyEmail(String email) {
		Matcher m = pattern.matcher(email);
		return m.matches();
	}

}
