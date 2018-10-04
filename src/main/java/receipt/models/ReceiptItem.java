package receipt.models;

import java.util.List;

public class ReceiptItem {

	private String name;
	private double price;
	private List<String> tags;
	private final int receiptId;

	public ReceiptItem(int receiptId) {
		this.receiptId = receiptId;
	}

	public int getReceiptId() {
		return receiptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() 
				+ " [ name="+name
				+ ", price="+price
				+ ", tags="+tags.toString()
				+ ", receiptId="+receiptId
				+ " ]";
	}
}
