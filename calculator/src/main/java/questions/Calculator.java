package questions;

import java.util.HashMap;

import questions.operators.AddOperator;
import questions.operators.DivisionOperator;
import questions.operators.MultiplyOperator;
import questions.operators.OperatorInterface;
import questions.operators.SubtractOperator;

public class Calculator {

	private static HashMap<String, OperatorInterface> operatorsMap = new HashMap<String, OperatorInterface>();

	static {
		Calculator.register(new AddOperator());
		Calculator.register(new MultiplyOperator());
	}

	public static void registerOperator(OperatorInterface o) {
		Calculator.register(o);
	}

	public static void register(OperatorInterface o) {
		System.out.println("Adding new operator to the calculator: "
				+ o.getSymbolOperation());
		operatorsMap.put(o.getSymbolOperation(), o);
	}

	public double evaluate(String symbol, double a, double b) {
		if (Calculator.operatorsMap.containsKey(symbol)) {
			double result = Calculator.operatorsMap.get(symbol).calculate(a, b);
			System.out.printf("The result of the operation %f %s %f = %f\n", a, symbol, b, result);
			return result;
		}
		else{
			System.out.printf("Unknown operator %s\n", symbol);
		}

		return 0;
	}

	public static void main(String... args) {
		Calculator.register(new SubtractOperator());
		Calculator.register(new DivisionOperator());

		Calculator c = new Calculator();
		int a = 27;
		int b = 2;

		c.evaluate("+", a, b);
		c.evaluate("*", a, b);
		c.evaluate("-", a, b);
		c.evaluate("/", a, b);
	}
}
