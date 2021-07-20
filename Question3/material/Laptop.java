package Question3.material;


public class Laptop extends Question3.stock.Inventory {
	

	private int UniqueId;
	private String processor;
	private int prices;
	private String brand;
	

	public Laptop(int uniqueId, String processor, int prices, String brand ,int quantity,int lowOrderLevelQuantity) {
		UniqueId = uniqueId;
		this.processor = processor;
		this.prices = prices;
		this.brand = brand;
		this.quantity = quantity;
		this.lowOrderLevelQuantity = lowOrderLevelQuantity;
	}
	
	public void lowOrderLevelQuantityfun() {
		if(this.lowOrderLevelQuantity<3)
		{
			System.out.println(toString());
			RequestForMaterial();
		}
		else
		{
			System.out.println(toString());
			System.out.println("Your Invoice Successfully generated");
		}
	}
	
	public void RequestForMaterial () {
		System.err.println("Request for Material Generated");
	}

	@Override
	public String toString() {
		return "Laptop [UniqueId=" + UniqueId + ", processor=" + processor + ", prices=" + prices + ", brand=" + brand
				+ ", quantity=" + this.quantity + ", lowOrderLevelQuantity=" + this.lowOrderLevelQuantity + "]";
	}
	
	
}
