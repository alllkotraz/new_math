public class Math {
	public static void main(String[] args) {
		Integer a = Integer.valueOf(args[0]);
		String action = args[1];
		Integer b = Integer.valueOf(args[2]);
		switch (action) {
			case "-":
				System.out.printf("Result: %d", subtraction(a, b));
				break;
			default:
				System.out.printf("Unknown operator: %s\n", action);
				break;
		}
	}

	public static Integer subtraction (Integer a, Integer b) {
	       return a * b;
	}	       
}


