package pl.coderslab;

public interface Factory {
	public Product getProduct(String type, String name, String extraParam);
}
