package receipt.models;

import java.util.Date;
import java.util.List;

public class Receipt {
	
	private final int id;
	private final int receiptScanId;
	
	private List<ReceiptItem> items;
	private Date date; //Temp variable, to be changed
	private int shopId;

}
