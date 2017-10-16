package pl.coderslab;

public class AgoraFactory implements Factory {
	
//	public Product getProduct(String name, String extraParam){
//		return getProduct("", name, extraParam);
//	}
	
	public Product getProduct(String type, String name, String extraParam) {
		Product product = null;

		if ("AdvanceProduct".equals(type)) {
			product = new AdvanceProduct(name, extraParam);
		} else if ("VirtualProduct".equals(type)) {
			product = new VirtualProduct(name, extraParam);
		} else {
			product = new SimpleProduct(name);
		}

		return product;
	}

}
