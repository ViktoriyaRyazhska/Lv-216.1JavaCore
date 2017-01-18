package shop.logic;

import java.util.Comparator;

import shop.entity.Seller;

public class IdComparator implements Comparator<Seller> {

	@Override
	public int compare(Seller o1, Seller o2) {

		return o2.getId() - o1.getId();
	}

}
