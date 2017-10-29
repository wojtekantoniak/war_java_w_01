package pl.coderslab.entity;

public class CartItem {
	private int quantity;
	private Product product;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CartItem(int quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}

	public CartItem() {
	}

	@Override
	public String toString() {
		return "CartItem [quantity=" + quantity + ", product=" + product + "]";
	}

}
