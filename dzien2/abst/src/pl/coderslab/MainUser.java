package pl.coderslab;

public class MainUser {

	public static void main(String[] args) {
		 Client client = new Client("Bolek");
		 client.setAge(19);
		 client.setPassword("abcdefg123456");
		 System.out.println(client.isLogged());
		 client.login("Bolek", "abcdefg12345644");
		 System.out.println(client.isLogged());
		 client.login("Bolek", "abcdefg12345644");
		 System.out.println(client.isLogged());
		 client.login("Bolek", "abcdefg123456");
		 System.out.println(client.isLogged());
		 client.login("Bolek", "abcdefg12345644");
		 System.out.println(client.isLogged());
		 client.login("Bolek", "abcdefg123456");
		 System.out.println(client.isLogged());

//		Admin admin = new Admin("admin", "127.0.0.1");
//		admin.setAge(18);
//		admin.setPassword("12345678901");
//		System.out.println(admin.isLogged());
//		admin.login("admin", "12345678901");
//		System.out.println(admin.isLogged());
	}

}
