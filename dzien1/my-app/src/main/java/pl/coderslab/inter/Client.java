package pl.coderslab.inter;

public class Client extends User {

	public Client(String username, int age) {
		super(username, age);
	}

	@Override
	public boolean checkLogin(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setPassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAge(int age) {
		if(age<=0)
		
	}

}
