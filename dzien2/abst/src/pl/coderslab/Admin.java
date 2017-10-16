package pl.coderslab;

public class Admin extends User {

	private String ip;

	protected Admin(String username, String ip) {
		super(username);
		this.ip = ip;
	}

	public boolean checkLogin(String username, String password) {
//		System.out.println(super.getPassword());
//		System.out.println(super.getUsername());
		
		if (isCorrectIp() && super.getPassword().equals(password) && super.getUsername().equals(username)) {
			return true;
		}
		return false;
	}

	private boolean isCorrectIp() {
//		System.out.println(ip);
//		System.out.println((ip != null && ip.indexOf("192") == 0 || ip.indexOf("127") == 0));
		if (ip != null && ip.indexOf("192") == 0 || ip.indexOf("127") == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean setPassword(String password) {
		if (password.length() >= 10) {
			super.password = password;
			return true;
		}
		return false;
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub

	}
}
