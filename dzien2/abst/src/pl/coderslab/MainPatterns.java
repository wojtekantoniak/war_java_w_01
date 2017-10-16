package pl.coderslab;

public class MainPatterns {

	public static void main(String[] args) {
		AppConfig appConfig = AppConfig.getInstance("pierwsza");
		AppConfig appConfig2 = AppConfig.getInstance("apapapa");
		AppConfig appConfig3 = AppConfig.getInstance("spajsoapsnap");
		
		System.out.println(appConfig.getConfiguration());
		System.out.println(appConfig2.getConfiguration());
		System.out.println(appConfig3.getConfiguration());
	}

}
