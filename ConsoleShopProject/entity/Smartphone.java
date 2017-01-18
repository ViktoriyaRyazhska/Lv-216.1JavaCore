package shop.etitity.goods;

import shop.entity.Goods;

public final class Smartphone extends Goods {

	private double diagonal;
	private double cameraMPixel;

	public Smartphone() {

	}

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}

	public double getCameraMPixel() {
		return cameraMPixel;
	}

	public void setCameraMPixel(double cameraMPixel) {
		this.cameraMPixel = cameraMPixel;
	}

	@Override
	public double getCost() {
		double realCost = this.getPrice() * this.getQuantity();
		return realCost;
	}
	@Override
	public String toString() {
		return "Smartphone  ID : " + getId() + " | " + "  Price per 1 item  : " + getPrice() + " USD | " + ""
				+ " Title : " + getTitle() + " | " + "  Diagonal : " + diagonal + "` | " + "  MegaPixsels : "
				+ cameraMPixel + " Mpx | ";
	}

	

}
