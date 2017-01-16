package homeworks.day6;

public class RunBird {

    public static void main(String[] args) {

	Bird[] bird = new Bird[4];
	bird[0] = new Eagle("Brown", 0);
	bird[1] = new Swallow("White", 3);
	bird[2] = new Penguin("Black", 10);
	bird[3] = new Chicken("Gray", 22);

	for (int i = 0; i < bird.length; i++) {
	    bird[i].info();
	    bird[i].fly();
	}

    }

}