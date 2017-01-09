package lesson9;

public class Plants {

	/*
	 * Create a class Plants, which includes fields int size, Color color and
	 * Type type, and constructor where these fields are initialized. Color and
	 * type are Enum. Override the method toString( ). Create classes
	 * ColorException and TypeException and describe there all possible colors
	 * and types of plants. In the method main create an array of five plants.
	 * Check to work your exceptions.
	 */

	public enum Color {
		White, Red, Blue
	}

	public enum Type {
		Rose, Chamomile, Marguerite
	}

	public class ColorException extends Exception {
		public ColorException(String message) {
			super(message);
		}
	}

	public class TypeException extends Exception {
		public TypeException(String message) {
			super(message);
		}
	}

	private Type type;
	private Color color;
	private int size;

	public Plants(String type, String color, int size) throws ColorException, TypeException {
		Type t = typeStrToEnum(type);
		Color c = colorStrToEnum(color);
		this.size = size;
		this.type = t;
		this.color = c;
	}

	private Type typeStrToEnum(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "rose":
			return Type.Rose;
		case "chamomile":
			return Type.Chamomile;
		case "marguerite":
			return Type.Marguerite;
		default:
			throw new TypeException("Input only type rose, chamomile, marguerite");
		}
	}

	private Color colorStrToEnum(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "blue":
			return Color.Blue;
		case "red":
			return Color.Red;
		case "white":
			return Color.White;
		default:
			throw new ColorException("Input only color blue, red or white");
		}
	}


	@Override
	public String toString() {
		return "Flower[" + type + " : " + color + " : " + size + "]";
	}
}
