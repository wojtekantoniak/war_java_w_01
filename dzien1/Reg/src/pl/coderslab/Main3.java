package pl.coderslab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Main3 {

	private static final Pattern PATTERN = Pattern.compile("[0-9]+([\\s]*[+\\-\\*\\/]+[\\s]*[0-9]+)+");

	public static void main(String[] args) throws IOException {
		Path file = Paths.get("operations.txt");
		String[] arr = { "2 + 2", "2 * 4 - 2", "6 / 3 + 10", "quit", "6 / 3 + 10" };
		StringBuilder sb = new StringBuilder();

		for (String op : arr) {
			if("quit".equals(op)){
				break;
			}
			
			if (isCorrect(op)) {
				sb.append(op).append(" = ").append(compute(op)).append(System.getProperty("line.separator"));
				System.out.println(op + "=" + compute(op));
			}

		}
		Files.write(file, sb.toString().getBytes());
	}

	private static double compute(String op) {
		Expression e = new ExpressionBuilder(op).build();
		return e.evaluate();
	}

	private static boolean isCorrect(String op) {
		Matcher m = PATTERN.matcher(op);
		return m.matches();
	}

}
