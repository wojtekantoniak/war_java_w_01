package pl.coderslab;

public class Client extends User {

	private int loginCount = 0;
	
	public Client(String username) {
		super(username);
	}

	@Override
	public boolean checkLogin(String username, String password) {
		if (loginCount<3 && super.getPassword().equals(password) && super.getUsername().equals(username) && getAge() >= 18) {
			loginCount = 0;
			return true;
		}
		loginCount++;
		return false;
	}

	@Override
	public boolean setPassword(String password) {
		if (password.length() > 8 && getAge() > 0) {
			super.password = password;
			return true;
		}
		return false;
	}

	@Override
	public void setAge(int age) {
		super.age = age;
	}

}
