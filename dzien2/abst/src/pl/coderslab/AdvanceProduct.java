package pl.coderslab;

public class AdvanceProduct implements Product {
	private String name;
	private String advanceName;

	public AdvanceProduct(String name, String advanceName) {
		this.name = name;
		this.advanceName = advanceName;
	}

	@Override
	public String getName() {
		return name + " (" + advanceName + ")";
	}

}
