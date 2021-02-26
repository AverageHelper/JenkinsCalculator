public class Main {
	
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Please specify an operation: add | subtract | multiply | divide | fib | binary");
			return;
		}
		
		Calculator calculator = new Calculator();
		String operation = args[0];
		String result;
		
		if (operation.equals("add")) {
			if (args.length < 3) {
				System.out.println("Too few arguments to add. Need two.");
				return;
			}
			int a = Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]);
			result = String.valueOf(calculator.add(a, b));
			
		} else if (operation.equals("subtract")) {
			if (args.length < 3) {
				System.out.println("Too few arguments to subtract. Need two.");
				return;
			}
			int a = Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]);
			result = String.valueOf(calculator.subtract(a, b));
			
		} else if (operation.equals("multiply")) {
			if (args.length < 3) {
				System.out.println("Too few arguments to multiply. Need two.");
				return;
			}
			int a = Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]);
			result = String.valueOf(calculator.multiply(a, b));
			
		} else if (operation.equals("divide")) {
			if (args.length < 3) {
				System.out.println("Too few arguments to divide. Need two.");
				return;
			}
			int a = Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]);
			result = String.valueOf(calculator.divide(a, b));
			
		} else if (operation.equals("fib")) {
			if (args.length < 2) {
				System.out.println("Need one integer input.");
				return;
			}
			int n = Integer.parseInt(args[1]);
			result = String.valueOf(calculator.fibonacciNumberFinder(n));
			
		} else if (operation.equals("binary")) {
			if (args.length < 2) {
				System.out.println("Need one integer input.");
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
