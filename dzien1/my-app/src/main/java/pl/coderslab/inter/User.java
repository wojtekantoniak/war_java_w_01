package pl.coderslab.inter;

public abstract class User {
	private String username;
	private String password;
	private int age;

	public User(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}

	public abstract boolean checkLogin(String username, String password);

	public final void login() {
		checkLogin(username, password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public abstract boolean setPassword(String password);

	public int getAge() {
		return age;
	}

	public abstract void setAge(int age);

}
