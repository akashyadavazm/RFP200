package day11Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {

	ArrayList<Stock> portfolio = new ArrayList<>();
	int totalvalue;

	Scanner sc = new Scanner(System.in);

	public void addStock() {

		Stock stock = new Stock();
		System.out.println("Enter the Name of Stock you want to purchase : ");
		stock.setStockname(sc.next());
//		stock.getStockname();

		System.out.println("Enter the number of Stock you want to purchase : ");
		stock.setNumberOfShare(sc.nextInt());

		System.out.println("Enter the Share Price : ");
		stock.setSharePrice(sc.nextInt());

		portfolio.add(stock);
		System.out.println(portfolio);
		System.out.println("Stock Added Successfully ");

	}

	public void addNoOfStock() {

		System.out.println("Enter the number of stock you want to add : ");
		int noOfStock = sc.nextInt();

	}

	public void totalvalue() {
		for (Stock stock : portfolio) {
			totalvalue = totalvalue + (stock.sharePrice * stock.numberOfShare);

		}
		System.out.println(totalvalue);
	}

	public static void main(String[] args) {

		StockPortfolio stk = new StockPortfolio();

		int choice = 0;
		while (choice < 4) {
			System.out.println(
					"Enter your choice \n 1: Add Stock \n 2: Add Multiple Of Stocks \n 3: Total value of Stocks ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				stk.addStock();
				break;
			case 2:
				stk.addNoOfStock();
				break;
			case 3:
				stk.totalvalue();
				break;
			default:
				break;
			}

		}

	}

}
