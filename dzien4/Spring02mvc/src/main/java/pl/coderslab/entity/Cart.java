package pl.coderslab.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {
	private List<CartItem> cartItems = new ArrayList<CartItem>();

	public void addToCart(CartItem cartItem) {
		cartItems.add(cartItem);
	}

	@Override
	public String toString() {
		return "Cart [cartItems=" + cartItems + "]";
	}
	
}
