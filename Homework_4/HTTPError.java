
public enum HTTPError {
	Bad_Request(400), Unauthorized(401), Payment_Required(402), Forbidden(403), Not_Found(404);

	private int input;

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	private HTTPError(int input) {
		this.setInput(input);
	}

	

	public static void printError(int input) {

		
		switch (input) {
		case 400:
			System.out.println(HTTPError.Bad_Request);
			break;
		case 401:
			
			System.out.println(HTTPError.Unauthorized);
			break;
		case 402:
			System.out.println(HTTPError.Payment_Required);
			break;
		case 403:
			System.out.println(HTTPError.Forbidden);
			break;
		case 404:
			System.out.println(HTTPError.Not_Found);
			break;
		default:
			System.out.println("default error");
		}
	}
}