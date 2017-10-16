package pl.coderslab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtendedUrl implements Url {

	private String url;

	public ExtendedUrl(String url) {
		super();
		this.url = url;
	}

	public String getParam(String name, String url) {
		Pattern p = Pattern.compile(name + ".([^\\/]+)");
		Matcher m = p.matcher(url);
		if (m.find()) {
			return m.group(1);
		}
		return "";
	}

}
