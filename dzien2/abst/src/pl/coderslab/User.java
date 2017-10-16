package pl.coderslab;

public abstract class User {

	private String username;
	protected String password;
	protected int age;
	protected boolean logged;

	protected User(String username) {
		this.username = username;
	}

	public abstract boolean checkLogin(String username, String password);

	public void setUsername(String username) {
		this.username = username;
	}

	public abstract boolean setPassword(String password);

	public abstract void setAge(int age);

	public final boolean login(String username, String password) {
		logged = checkLogin(username, password);
		return logged;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public int getAge() {
		return age;
	}

	public boolean isLogged(){
		return logged;
	}
}
