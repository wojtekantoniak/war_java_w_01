package pl.coderslab;

public class AppConfig {

	private static AppConfig INSTANCE;
	private String configuration;

	private AppConfig(String configuration) {
		this.configuration = configuration;
	}

	public static synchronized AppConfig getInstance(String configuration) {
		if (INSTANCE == null) {
			INSTANCE = new AppConfig(configuration);
		}
		return INSTANCE;
	}

	public String getConfiguration() {
		return configuration;
	}
	
}
