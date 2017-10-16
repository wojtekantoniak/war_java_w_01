package pl.coderslab;

public class FactoryMain {

	public static void main(String[] args) {
		OnetFactory factoryAgora = new OnetFactory();
		Product p1 = factoryAgora.getProduct("AdvanceProduct", "zaawansowany", "ekstra!");
		System.out.println(p1.getName());
		Product p2 = factoryAgora.getProduct("VirtualProduct", "wirtualny produkt", "gazeta.pl");
		System.out.println(p2.getName());
		Product p3 = factoryAgora.getProduct("", "prosty", "");
		System.out.println(p3.getName());
	}

}
