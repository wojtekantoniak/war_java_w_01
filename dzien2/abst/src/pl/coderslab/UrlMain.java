package pl.coderslab;

public class UrlMain {

	public static void main(String[] args) {
		Url url = null;

		if (true) {
			url = new StandardUrl("url_example?param1=99&param2=string");
		} else {
			url = new ExtendedUrl("url_example/param1.99/param2.string");
		}

//		System.out.println(url.getParam("param1", "url_example/param1.99/param2.string"));
//		System.out.println(url.getParam("param2", "url_example/param1.99/param2.string"));
//		System.out.println(url.getParam("param3", "url_example/param1.99/param2.string"));
		
		System.out.println(url.getParam("param1", "url_example?param1=99&param2=string"));
		System.out.println(url.getParam("param2", "url_example?param1=99&param2=string"));
		System.out.println(url.getParam("param3", "url_example?param1=99&param2=string"));

	}

}
