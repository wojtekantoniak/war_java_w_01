package pl.coderslab;

import java.util.regex.Pattern;

public class Main4 {
	public static void main(String[] args) {
//		boolean result1 = Pattern.matches("(dwa)(\w+)\2\1", "AladwaAladwa");
//		System.out.println(result1);

//		boolean result2 = Pattern.matches("\\.", "a");
//		System.out.println(result2);
//
//		boolean result3 = Pattern.matches("abc+", "abc");
//		System.out.println(result3);
//
//		boolean result4 = Pattern.matches("abc.+", "abcwwwww");
//		System.out.println(result4);
//
//		String pat1 = "abc\\.";
//		boolean result5 = Pattern.matches(pat1, "abc.");
//		System.out.println(result5);
//
		boolean result6 = Pattern.matches("(\\k{one}\\w+)=(\\g{one})", "Ala=Ala");
		System.out.println(result6);
//
		Pattern pattern1 = Pattern.compile("^abc");
//		boolean result7 = pattern1.matcher("Nazywam sie abc").find();
//		System.out.println(result7);
//
//		boolean result8 = pattern1.matcher("abc to moje imie").find();
//		System.out.println(result8);
//
		Pattern pattern2 = Pattern.compile("abc$");
//		boolean result9 = pattern2.matcher("Nazywam sie abc").find();
//		System.out.println(result9);
//
//		boolean result10 = pattern2.matcher("abc to moje imie").find();
//		System.out.println(result10);

//		boolean result11 = Pattern.matches("[0-9]", "1");
//		System.out.println(result11);
//
//		boolean result12 = Pattern.matches("^\\d{2}-\\d{3}$", "09-572");
//		System.out.println(result12);

	}
}
