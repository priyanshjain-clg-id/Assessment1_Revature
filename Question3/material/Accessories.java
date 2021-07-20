package Question3.material;

public class Accessories extends Question3.stock.Inventory {
	
	private int UniqueId;
	private int prices;
	
	public Accessories(int uniqueId, int prices, int quantity,int lowOrderLevelQuantity) {
		UniqueId = uniqueId;
		this.prices = prices;
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
		return "Accessories [UniqueId=" + UniqueId + ", prices=" + prices + ", quantity=" + quantity
				+ ", lowOrderLevelQuantity=" + lowOrderLevelQuantity + "]";
	}
	
	
	
	
}
