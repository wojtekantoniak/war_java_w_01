package pl.coderslab;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

/**
 * Hello world!
 *
 */
public class App {
	private static Logger LOGGER = Logger.getLogger(App.class);

	public static void main(String[] args) {

		

		 System.out.println( "Hello World!" );
		

	}

	private static void testJSoup() {
		Connection connect = Jsoup.connect("http://www.onet.pl/");
		try {
			Document document = connect.get();
			Elements links = document.select("span.title");
			for (Element elem : links) {
				System.out.println(elem.text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
