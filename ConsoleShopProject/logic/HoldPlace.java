package shop.logic;

import java.io.IOException;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import shop.entity.Buyer;
import shop.entity.Goods;
import shop.entity.Seller;

import java.util.Set;

public final class HoldPlace {

	public static List<Seller> sellerList = new LinkedList<>();

	public static List<Buyer> buyerList = new LinkedList<>();

	public static Map<Seller, Goods> map = new LinkedHashMap<>();

	public static void viewListBuyers() {
		if (buyerList.isEmpty()) {
			System.out.println("Buyers list is Empty");
		} else {
			iterateByInputList(buyerList);
		}

	}

	public static void viewListSellers() throws NumberFormatException, IOException {
		for (Entry<Seller, Goods> pullGoods : map.entrySet()) {
			System.out.println(pullGoods.getKey());
		}
	}

	public static void viewListGoods() {
		System.out.println("\n\t\tLIST OF ALL PRODUCTS IN STORE");
		for (Entry<Seller, Goods> pullGoods : map.entrySet()) {
			System.out.println(pullGoods.getValue());
			System.out.println("-----------------------------------------------------------------");
		}

	}

	public static void viewListSellersProduct() throws NumberFormatException, IOException {
		System.out.println("\t\t\tGENERAL LIST OF SELLERS AND THEIR PRODUCTS");
		if (map.isEmpty()) {
			System.out.println("List of Sellers and Products is empty !!!");
		}
		for (Entry<Seller, Goods> entries : map.entrySet()) {
			System.out.println(entries.getKey() + "\n" + entries.getValue());
			System.out.println("Quantity of this product : " + entries.getValue().getQuantity() + " items");
			System.out.println("Total sum of this product : " + entries.getValue().getCost() + " USD");
			System.out.println("------------------------------------------------------------------");
		}
	}
	public static void viewSortByIdSellers() throws NumberFormatException, IOException {
		System.out.println("If your want to see (decrease) seler list enter"
				+ "else enter 0 to exit ");
		int a = Keyboard.inputInteger("Press 1 - sort , or 0 - to exit ---> ");
		if (a == 1) {
			compareByIdSeller();
		}else if (a==0) {
			return;
		}

	}

	private static <T> void iterateByInputList(List<T> enterList) {
		Iterator<T> iterator = enterList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	

	@SuppressWarnings("unchecked")
	private static void compareByIdSeller() {
		@SuppressWarnings("rawtypes")
		List listSeller = new ArrayList<>(map.keySet());
		Collections.sort(listSeller, new IdComparator());
		iterateByInputList(listSeller);

	}

}
