import java.util.Scanner;

public class Main {
	
	public static final String ADD = "add";
	public static final String SUBTRACT = "subtract";
	public static final String MULTIPLY = "multiply";
	public static final String DIVIDE = "divide";
	public static final String FIND_FIBONACCI = "fib";
	public static final String CONVERT_TO_BINARY = "binary";
	public static final String EXIT = "exit";
	
	private static final String LEAVE_MSG = "Goodbye!";
	
	private static String runOperation(Calculator calculator, String operation, String[] args) throws NoSuchMethodException, IndexOutOfBoundsException {
		// Switch over the provided operation and do the thing
		
		if (operation.equals(ADD)) {
			if (args.length < 3) {
				throw new IndexOutOfBoundsException("Too few arguments to add. Need two.");
			}
			int a = Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]);
			return String.valueOf(calculator.add(a, b));
			
		} else if (operation.equals(SUBTRACT)) {
			if (args.length < 3) {
				throw new IndexOutOfBoundsException("Too few arguments to subtract. Need two.");
			}
			int a = Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]);
			return String.valueOf(calculator.subtract(a, b));
			
		} else if (operation.equals(MULTIPLY)) {
			if (args.length < 3) {
				throw new IndexOutOfBoundsException("Too few arguments to multiply. Need two.");
			}
			int a = Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]);
			return String.valueOf(calculator.multiply(a, b));
			
		} else if (operation.equals(DIVIDE)) {
			if (args.length < 3) {
				throw new IndexOutOfBoundsException("Too few arguments to divide. Need two.");
			}
			int a = Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]);
			return String.valueOf(calculator.divide(a, b));
			
		} else if (operation.equals(FIND_FIBONACCI)) {
			if (args.length < 2) {
				throw new IndexOutOfBoundsException("Need one integer input to find Fibonacci.");
			}
			int n = Integer.parseInt(args[1]);
			return String.valueOf(calculator.fibonacciNumberFinder(n));
			
		} else if (operation.equals(CONVERT_TO_BINARY)) {
			if (args.length < 2) {
				throw new IndexOutOfBoundsException("Need one integer input to convert to binary.");
			}
			int n = Integer.parseInt(args[1]);
			return String.valueOf(calculator.intToBinaryNumber(n));
			
		} else if (operation.equals(EXIT)) {
			return LEAVE_MSG;
			
		} else {
			throw new NoSuchMethodException(operation);
		}
	}
	
	private static void handleInput(Scanner scanner) {
		while (true) {
			System.out.print("Enter a command: ");
			String input = scanner.nextLine();
			String[] args = input.split("\\s+");
			
			if (args.length < 1) {
				System.out.println("Please specify an operation: " + ADD + " | " + SUBTRACT + " | " + MULTIPLY + " | " + DIVIDE + " | " + FIND_FIBONACCI + " | " + CONVERT_TO_BINARY + " | " + EXIT);
				break;
			}
			
			Calculator calculator = new Calculator();
			String operation = args[0];
			
			try {
				String result = runOperation(
					calculator,
					operation.toLowerCase(),
					args
				);
				System.out.println(result);
				if (result.equals(LEAVE_MSG)) {
					break;
				}
				
			} catch (NoSuchMethodException e) {
				System.out.println("Invalid operation: " + e.getMessage());
				
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		handleInput(scanner);
	}
	
}
