package pl.coderslab.abs1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		// Vehicle[] vehicles = { new Car("Ferrari", 250, "Sport Car"), new
		// Train("Steam Train", 210, 600) };
		// for (Vehicle vehicle : vehicles) {
		// System.out.println(vehicle.toString());
		// }
		System.out.println(oi("param1", "url_example?param1=99&param2=string"));
	}

	private static String oi(String paramName, String url) {
		Pattern p = Pattern.compile(paramName + "=([a-zA-Z0-9]*)");
		Matcher m = p.matcher(url);
		try {
			if (m.find()) {
				return m.group(1);
			}
		} catch (Exception e) {

		}
		return "";
	}
}
