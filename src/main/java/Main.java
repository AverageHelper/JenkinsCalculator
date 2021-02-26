public class Main {
	
	public static final String ADD = "add";
	public static final String SUBTRACT = "subtract";
	public static final String MULTIPLY = "multiply";
	public static final String DIVIDE = "divide";
	public static final String FIND_FIBONACCI = "fib";
	public static final String CONVERT_TO_BINARY = "binary";
	
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Please specify an operation: " + ADD + " | " + SUBTRACT + " | " + MULTIPLY + " | " + DIVIDE + " | " + FIND_FIBONACCI + " | " + CONVERT_TO_BINARY);
			return;
		}
		
		Calculator calculator = new Calculator();
		String operation = args[0];
		String result;
		
		if (operation.equals(ADD)) {
			if (args.length < 3) {
				System.out.println("Too few arguments to add. Need two.");
				return;
			}
			int a = Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]);
			result = String.valueOf(calculator.add(a, b));
			
		} else if (operation.equals(SUBTRACT)) {
			if (args.length < 3) {
				System.out.println("Too few arguments to subtract. Need two.");
				return;
			}
			int a = Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]);
			result = String.valueOf(calculator.subtract(a, b));
			
		} else if (operation.equals(MULTIPLY)) {
			if (args.length < 3) {
				System.out.println("Too few arguments to multiply. Need two.");
				return;
			}
			int a = Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]);
			result = String.valueOf(calculator.multiply(a, b));
			
		} else if (operation.equals(DIVIDE)) {
			if (args.length < 3) {
				System.out.println("Too few arguments to divide. Need two.");
				return;
			}
			int a = Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]);
			result = String.valueOf(calculator.divide(a, b));
			
		} else if (operation.equals(FIND_FIBONACCI)) {
			if (args.length < 2) {
				System.out.println("Need one integer input to find Fibonacci.");
				return;
			}
			int n = Integer.parseInt(args[1]);
			result = String.valueOf(calculator.fibonacciNumberFinder(n));
			
		} else if (operation.equals(CONVERT_TO_BINARY)) {
			if (args.length < 2) {
				System.out.println("Need one integer input to convert to binary.");
				return;
			}
			int n = Integer.parseInt(args[1]);
			result = String.valueOf(calculator.intToBinaryNumber(n));
			
		} else {
			System.out.println("Invalid operation: " + operation);
			return;
		}
		
		System.out.println(result);
	}
	
}
