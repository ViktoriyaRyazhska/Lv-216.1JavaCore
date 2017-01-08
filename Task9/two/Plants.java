package ua.bilas2;

public class Plants {

	private Type type;
	private Color color;
	private int size;
	
	public Plants() {
		// TODO Auto-generated constructor stub
	}

	public Plants(String type, String color, int size) throws ColorException, TypeException{
		super();
		Color c = colorStrToEnum(color);
		Type t = typeStrToEnum(type);
		this.type = t;
		this.color = c;
		this.size = size;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + size;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plants other = (Plants) obj;
		if (color != other.color)
			return false;
		if (size != other.size)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Plants [type=" + type + ", color=" + color + ", size=" + size + "]";
	}
	
	private Color colorStrToEnum(String color) throws ColorException{
	      switch(color.toLowerCase()){
	         case "green" : return Color.GREEN; 
	         case "blue" : return Color.BLUE; 
	         case "red" : return Color.RED; 
	         default : throw new ColorException("Input only color blue, red or green");
	      }
	   }
	
	private Type typeStrToEnum(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "tree": return Type.TREE;
		case "flower": return Type.FLOWER;
		case "bush": return Type.BUSH;			
		default: throw new TypeException("Input only type tree, wlower or bush");
		}
	}

}
