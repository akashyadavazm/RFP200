package day11Problems;

public class Stock {
	String stockname;
	int numberOfShare;
	int sharePrice;

	public String getStockname() {
		return stockname;
	}

	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	public int getNumberOfShare() {
		return numberOfShare;
	}

	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "Stock [stockname=" + stockname + ", numberOfShare=" + numberOfShare + ", sharePrice=" + sharePrice
				+ "]";
	}

}
