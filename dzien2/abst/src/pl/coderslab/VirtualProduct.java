package pl.coderslab;

public class VirtualProduct implements Product {
	private String name;
	private String source;

	public VirtualProduct(String name, String source) {
		this.name = name;
		this.source = source;
	}

	public String getName() {
		return name + " from " + source;
	}

}
