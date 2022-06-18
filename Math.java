public class Math {
	public static void main(String[] args) {
		Integer a = Integer.valueOf(args[0]);
		String action = args[1];
		Integer b = Integer.valueOf(args[2]);
		Integer r = 0;
		switch (action) {
			case "-":
				r = subtraction(a, b);
				System.out.printf("Result: %d\n", r);
				break;
			case "+":
				r = addition(a, b);
				System.out.printf("Result: %d\n", r);
				break;
			default:
				System.out.printf("Unknown operator: %s\n", action);
				break;
		}
	}

	public static Integer subtraction (Integer a, Integer b) {
	       return a - b;
	}	     
	
	public static Integer addition (Integer a, Integer b) {
		return a + b;
	}	
}
