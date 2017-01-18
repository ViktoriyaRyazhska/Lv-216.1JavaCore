package shop.etitity.goods;

import shop.entity.Goods;

public final class Computer extends Goods {

	private boolean isLaptop;
	private boolean isStationary;
	private double HardDiskMemory;
	private double operationalMemory;

	public Computer() {
		super();

	}

	public boolean isLaptop() {
		return isLaptop;
	}

	public void setLaptop(boolean isLaptop) {
		this.isLaptop = isLaptop;
	}

	public boolean isStationary() {
		return isStationary;
	}

	public void setStationary(boolean isStationary) {
		this.isStationary = isStationary;
	}

	public double getHardDiskMemory() {
		return HardDiskMemory;
	}

	public void setHardDiskMemory(double hardDiskMemory) {
		HardDiskMemory = hardDiskMemory;
	}

	public double getOperationalMemory() {
		return operationalMemory;
	}

	public void setOperationalMemory(double operationalMemory) {
		this.operationalMemory = operationalMemory;
	}

	@Override
	public double getCost() {
		double realCost = this.getPrice() * this.getQuantity();
		return realCost;
	}

	@Override
	public String toString() {
		System.out.print(getClass().getSimpleName() + " |");
		System.out.println("ID :" + getId() + " | " + "Prise per 1 item : " + getPrice() + " USD | " + "Title : "
				+ getTitle() + " | " + "Is laptop :" + isLaptop + " | " + "HD memory : " + getHardDiskMemory()
				+ " GB | " + "ORM memory : " + getOperationalMemory() + " GB |");
		return "";
	}

}
