package pl.coderslab;

public class OnetFactory implements Factory {

	@Override
	public Product getProduct(String type, String name, String extraParam) {
		Product product = null;

		if ("AdvanceProduct".equals(type)) {
			product = new AdvanceProduct(extraParam, name);
		} else if ("VirtualProduct".equals(type)) {
			product = new VirtualProduct(name, extraParam + " reklama, kupuj dziadu!");
		} else {
			product = new SimpleProduct(name+" to jest najlepszy produkt na siecie, dziadu");
		}

		return product;
	}

}
