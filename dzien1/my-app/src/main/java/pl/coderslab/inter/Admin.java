package pl.coderslab.inter;

public class Admin extends User {

	public Admin(String username, int age) {
		super(username, age);
	}

	@Override
	public boolean checkLogin(String username, String password) {
		return false;
	}

	@Override
	public boolean setPassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub

	}

}
