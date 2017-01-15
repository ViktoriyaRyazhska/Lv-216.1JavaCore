package t2;

public class Workers {
	int id;
	String name;
	int salary;

	public Workers() {
		super();
	}

	public Workers(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Workers [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
